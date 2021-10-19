package edu.neumont;

public class Car {
    int doors;
    double mpg;
    String name;

    void display() {
        System.out.println(name);
        System.out.println(mpg);
        System.out.println(doors);
    }
        Car(int _doors, double _mpg, String _name){
            doors = _doors;
            mpg = _mpg;
            name = _name;
        }

    static void help(){
        System.out.println("Good luck!");
    }
}
