package edu.neumont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        Flashcard flashcard = new Flashcard();
        flashcard.generate();

        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 200, 300);

        JLabel operand1Label = new JLabel(Integer.toString(flashcard.operand1));
        operand1Label.setBounds(120, 30, 100, 40);
        operand1Label.setFont(new Font("Arial", Font.BOLD, 36));
        frame.add(operand1Label);

        JLabel operatorLabel = new JLabel("+");
        operatorLabel.setBounds(80, 90, 100, 40);
        frame.add(operatorLabel);

        JLabel operand2Label = new JLabel(Integer.toString(flashcard.operand2));
        operand2Label.setBounds(120, 90, 100, 40);
        operand2Label.setFont(new Font("Arial", Font.BOLD, 36));
        frame.add(operand2Label);

        JLabel incorrect = new JLabel("Incorrect!");
        incorrect.setBounds(40, 200, 140, 40);

        JLabel correctAns = new JLabel("Correct!");
        correctAns.setBounds(40, 200, 140, 40);


        JTextField answerTextField = new JTextField();
        answerTextField.setBounds(50, 150, 100, 40);
        answerTextField.setFont(new Font("Arial", Font.BOLD, 36));
        answerTextField.setHorizontalAlignment(JTextField.RIGHT);
        answerTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer = answerTextField.getText();
                int numAns = Integer.parseInt(answer);
               if (numAns == flashcard.answer){
                    flashcard.generate();
                    operand1Label.setText(Integer.toString(flashcard.operand1));
                    operand2Label.setText(Integer.toString(flashcard.operand2));
                    answerTextField.setText("");
                }
                else {
                    frame.add(incorrect);
                }



            }
        });



        frame.add(answerTextField);




        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
