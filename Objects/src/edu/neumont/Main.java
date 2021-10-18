package edu.neumont;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String greeting = scanner.nextLine();
        int min = Integer.parseInt((greeting));
        String greeting2 = scanner.nextLine();
        int max = Integer.parseInt(greeting2);

        Random random = new Random();
        int r = random.nextInt(min, max);

        String result = Integer.toString(r);
        System.out.println("Random: " + result);

        // write your code here
        System.out.println(add(20, 10));
        print("Hiya!");
    }

    static int add(int v1, int v2) {
        int result = v1 + v2;
        return v1 + v2;
    }

    static void print(String greeting) {
        System.out.println(greeting);
    }

    static double sqr(double v) {
        return v * v;
    }
}