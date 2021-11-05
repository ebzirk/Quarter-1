package edu.neumont;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setBounds(100,100, 200, 400);
        frame.setLayout(null);

        JTextField num1Field = new JTextField();
        num1Field.setBounds(20,20,60,80);
        num1Field.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(num1Field);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(100,20,60,80);
        num2Field.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(num2Field);

        //random number button
        JButton button = new JButton("Randomize");
        button.setBounds(40, 120, 100, 30);
        frame.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Helper.getRandom(1, 100);
                int num2 = Helper.getRandom(1, 100);

                num1Field.setText(Integer.toString(num1));
                num2Field.setText(Integer.toString(num2));
            }
        });

        // result text
        JTextArea resultTextArea = new JTextArea();
        resultTextArea.setBounds(40,220,100,80);
        resultTextArea.setEditable(false);
        frame.add(resultTextArea);

        //calc button
        JButton calcButton = new JButton("Calculate");
        calcButton.setBounds(40,170,100,30);
        frame.add(calcButton);
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                String output = "Addition: "  + Helper.display(Helper.add(num1,num2));
                output = output + "\nSubtraction: " + Helper.display(Helper.subtract(num1,num2));
                output = output + "\nDivision: " + Helper.display(Helper.divide(num1,num2));
                output = output + "\nMultiplication: " + Helper.display(Helper.divide(num1,num2));
                output = output + "\nRemainder: " + Helper.display(Helper.remainder(num1,num2));
                resultTextArea.setText(output);
            }
        });
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
