package com.example.appfinal;

import java.util.Random;

public class Script {
    String [] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z"};

    void generate(){
        Random random = new Random();
        int value = random.nextInt(letters.length + 1);
    }
}
