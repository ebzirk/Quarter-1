package edu.neumont;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        URL fontUrl = new URL("file:///C:/Users/bpenrod/Documents/mandalor.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, fontUrl.openStream());
        font = font.deriveFont(Font.PLAIN, 50);
        GraphicsEnvironment ge =
                GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);
        Language language = new Language();
        language.generate();

        JFrame frame = new JFrame("Learn Mando'a");
        frame.setBounds(400, 900, 600, 600);

        JLabel title = new JLabel("Learn Mando'a");
        title.setBounds(90, 90, 400, 45);
        title.setFont(new Font("arial", Font.BOLD, 50));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(title);

        JLabel warning = new JLabel("Take a guess at what the word means.");
        warning.setBounds(90, 125, 400, 45);
        warning.setFont(new Font("arial", Font.PLAIN, 20));
        warning.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(warning);

        JLabel mandoaWord = new JLabel(language.mandoAnswer);
        mandoaWord.setBounds(125, 150, 300, 100);
        mandoaWord.setFont(new Font("arial", Font.BOLD, 40));
        mandoaWord.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(mandoaWord);

        JLabel mandoaDisplay = new JLabel(mandoaWord.getText());
        mandoaDisplay.setBounds(125, 200, 300, 100);
        mandoaDisplay.setFont(font);
        mandoaDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(mandoaDisplay);

        JLabel hint = new JLabel();
        hint.setBounds(100, 400, 400, 40);
        hint.setFont(new Font("Arial", Font.BOLD, 20));
        hint.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(hint);

        JLabel proNunce = new JLabel("["+ language.nunciate + "]");
        proNunce.setBounds(150, 280, 250, 40);
        proNunce.setFont(new Font("Arial", Font.ITALIC, 18));
        proNunce.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(proNunce);

        JLabel thanks = new JLabel("Olarom, Vod.");
        thanks.setFont(font);
        thanks.setBounds(0,30, 500, 50);
        thanks.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(thanks);

        JTextField answerTextField = new JTextField();
        answerTextField.setBounds(150, 350, 250, 40);
        answerTextField.setFont(new Font("Arial", Font.BOLD, 36));
        answerTextField.setHorizontalAlignment(JTextField.RIGHT);
        answerTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer = answerTextField.getText();
                if (answer.toLowerCase(Locale.ROOT).equals(language.engAnswer.toLowerCase(Locale.ROOT))) {
                    language.generate();
                    mandoaWord.setText(language.mandoAnswer);
                    mandoaDisplay.setText(mandoaWord.getText());
                    proNunce.setText("["+ language.nunciate + "]");
                    answerTextField.setText("");
                    hint.setText("");
                } else {
                    hint.setText("Hint: " + language.hintAnswer);
                    answerTextField.setText("");
                }
            }
        });

        frame.add(answerTextField);


        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

