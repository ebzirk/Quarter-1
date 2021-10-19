package edu.neumont;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(1000,1000,700,700);
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
        maximum.setBounds(350,200,200,30);
        frame.add(maximum);
        JLabel maxLabel = new JLabel("Noun");
        maxLabel.setBounds(350,200, 40, 30);
        frame.add(maxLabel);




        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
