package edu.neumont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(400,400,400,500);
        frame.setLayout(null);

        JLabel title = new JLabel("Mad Libs");
        title.setBounds(100,10,200,30);
        title.setFont(new Font("Serif", Font.PLAIN, 20));
        frame.add(title);

        JTextField inputOne = new JTextField();
        inputOne.setBounds(100,50,200,30);
        frame.add(inputOne);
        JLabel inputOneLabel = new JLabel("Noun");
        inputOneLabel.setBounds(20,50, 40, 30);
        frame.add(inputOneLabel);

        JTextField inputTwo = new JTextField();
        inputTwo.setBounds(100, 85, 200, 30);
        frame.add(inputTwo);
        JLabel inputTwoLabel = new JLabel("Verb");
        inputTwoLabel.setBounds(20, 85, 40, 30);
        frame.add(inputTwoLabel);

        JTextField inputThree = new JTextField();
        inputThree.setBounds(100, 120, 200, 30);
        frame.add(inputThree);
        JLabel inputThreeLabel = new JLabel("Number");
        inputThreeLabel.setBounds(20, 120, 80, 30);
        frame.add(inputThreeLabel);

        JTextField inputFour = new JTextField();
        inputFour.setBounds(100, 155, 200, 30);
        frame.add(inputFour);
        JLabel inputFourLabel = new JLabel("Adjective");
        inputFourLabel.setBounds(20, 155, 90, 30);
        frame.add(inputFourLabel);

        JTextArea outputText = new JTextArea("Here is your Mad Lib");
        outputText.setBounds(30, 260, 300, 500);
        outputText.setLineWrap(true);
        outputText.setEditable(false);
        frame.add(outputText);

        JButton button = new JButton("Create");
        button.setBounds(100, 200, 100, 50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numberInput = inputThree.getText();
                String noun = inputOne.getText();
                String verb = inputTwo.getText();
                String adjective = inputFour.getText();
                int number = Integer.parseInt(numberInput);
                number *= 2;

                String madlib = "One day, some " + noun + " had wondered into town. ";
                madlib = madlib + "There were " + number + " of them!";
                madlib = madlib + " They were doing " + verb + ", the nerve of them! ";
                madlib = madlib + "These " + noun + " were very " + adjective + ".";
                outputText.setText(madlib);

            }
        });
        frame.add(button);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
