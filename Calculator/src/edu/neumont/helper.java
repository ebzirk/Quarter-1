package edu.neumont;

import java.util.Random;

public class Helper {
        static int add(int v1, int v2){
            return v1 + v2;
        }
        static int subtract(int v1, int v2){
            return v1 - v2;
        }
        static int multiply(int v1, int v2){
            return v1 * v2;
        }
        static int divide(int v1, int v2){
            if (v2 == 0) return -1;
            return v1 / v2;
        }
        static int remainder(int v1, int v2){
            return v1 % v2;
        }

        static int getRandom(int min, int max) {
            Random random = new Random();
            return random.nextInt(min, max);
        }
    }


