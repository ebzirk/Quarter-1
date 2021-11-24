package com.example.highrollerdicegame;

import java.util.Random;

public class Die {

    private int value;

    public int getValue() {return value;}

    public void roll(){
        Random random = new Random();
        value = random.nextInt(6) + 1;
    }

}
