package edu.neumont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(1000,1000,550,700);
        frame.setLayout(null);

        JLabel title = new JLabel("Random Number Generator");
        title.setBounds(150, 80, 1000, 50);
        title.setFont(new Font("Serif", Font.PLAIN, 20));
        frame.add(title);

        JTextField minimum = new JTextField();
        minimum.setBounds(40,200,200,30);
        frame.add(minimum);
        JLabel minimumLabel = new JLabel("Minimum");
        minimumLabel.setBounds(110,250, 80, 30);
        frame.add(minimumLabel);

        JTextField maximum = new JTextField();
        maximum.setBounds(300,200,200,30);
        frame.add(maximum);
        JLabel maxLabel = new JLabel("Maximum");
        maxLabel.setBounds(370,250, 80, 30);
        frame.add(maxLabel);

        JTextArea outputText = new JTextArea();
        outputText.setBounds(230, 370, 80, 50);
        outputText.setLineWrap(true);
        outputText.setEditable(false);
        outputText.setFont(new Font("Serif", Font.PLAIN, 25));
        frame.add(outputText);

        JButton button = new JButton("Get my number");
        button.setBounds(170, 300, 200, 50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String minNum = minimum.getText();
                String maxNum = maximum.getText();
                int minPoint = Integer.parseInt(minNum);
                int maxPoint = Integer.parseInt(maxNum);
                Random rng = new Random();
                int r = rng.nextInt(minPoint, maxPoint);
                String ranNum = Integer.toString(r);
                outputText.setText(ranNum);

            }
        });
        frame.add(button);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
