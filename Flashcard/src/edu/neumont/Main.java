package edu.neumont;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Flashcard flashcard = new Flashcard();
        flashcard.generate();



        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 200, 300);

        JLabel operand1Label = new JLabel(Integer.toString(flashcard.operand1));
        operand1Label.setBounds(120, 30, 100, 40);
        frame.add(operand1Label);

        JLabel operand2Label = new JLabel(Integer.toString(flashcard.operand2));
        operand2Label.setBounds(120, 90, 100, 40);
        frame.add(operand2Label);







        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
