package edu.neumont;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] numbers = {23, -45, 0, 2};//new int[5];
//        numbers[0] = 21;
//        System.out.println(numbers[2]);
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

        Scanner scanner = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        boolean quit = false;
        while (quit == false) {
            System.out.println("Enter Command: ");
            char command = scanner.nextLine().charAt(0);
            if (Character.toUpperCase(command) == 'Q'){
                quit = true;
            }
            if (Character.toUpperCase(command) == 'B'){
                displayTotal(seats);
                for (int i = 0; i < seats.length; i++){
                    if (seats[i] == false) System.out.print((i + 1) + " ");
                    else System.out.print("X ");
                }
                System.out.println();
                System.out.println("Enter seat number: ");
                String string = scanner.nextLine();
                int seatNumber = Integer.parseInt(string) - 1;
                if (seats[seatNumber] == false){
                    seats[seatNumber] = true;
                    System.out.println("Seat " + seatNumber + " has been purchased.");
                } else {
                    System.out.println("Seat " + seatNumber + " is not available.");
                }
            }
            if (Character.toUpperCase(command) == 'R'){
                displayTotal(seats);
            }
        }
    }

    static void displayTotal(boolean[] seats){
        int sold = 0;
        for (int i = 0; i < seats.length; i++){
            if (seats[i] == true) sold++;
        }
        System.out.println(sold + " Tickets sold.");
        System.out.println(seats.length - sold + " Tickets available.");

    }
}
