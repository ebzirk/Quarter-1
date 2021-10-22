package edu.neumont;

import java.util.Random;

public class Flashcard {

    int operand1;
    int operand2;
    int answer;

    static int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }

    void generate(){
        operand1 = getRandom(1, 10);
        operand2 = getRandom(1, 10);
        answer = operand1 + operand2;
        System.out.println(answer);
    }
}
