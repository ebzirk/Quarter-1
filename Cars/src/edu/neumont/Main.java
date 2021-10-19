package edu.neumont;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car(4, 23.5, "Chevy");
        cars[1] = new Car(2, 23.5, "Jeep");
        cars[2] = new Car(4, 23.5, "Ford");

        Car car = new Car(4, 23.5, "Audi");

        for (int i = 0; i < cars.length; i++){
            cars[i].display();
        }

        car.display();
        Car.help();




    }
}
