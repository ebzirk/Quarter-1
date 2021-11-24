package com.example.highrollerdicegame;

public class Player {
    private String name;
    private int score;


    public Player(int score) {
        this.score = score;
    }



    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    public Player () {

    }

    public int getScore(){return score;}

    public void setScore(int score) {this.score = score;}
}
