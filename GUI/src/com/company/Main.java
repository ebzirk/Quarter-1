package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLocation(200, 200);
        frame.setSize(400, 400);
        frame.setLayout(null);

        JButton button = new JButton("0");
        button.setBounds(150, 80, 100, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String string = button.getText();
                int click = Integer.parseInt(string);
                click++;
                button.setText(Integer.toString(click));
            }
        });
        frame.add(button);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
