package com.example.appfinal;

import java.util.Random;

public class Trivia {

    int charShown;
    String charAns;

    // storage for all Trivia info
    int charPic[] = {R.drawable.bo, R.drawable.boba, R.drawable.din};
    String charName[] = {"Bo Katan", "Boba Fett", "Din Djarin"};


    // character Trivia, pulls up images for the player to guess
    void charTrivia() {
        Random random = new Random();
        int susan = random.nextInt(charPic.length);
        charShown = charPic[susan];
        charAns = charName[susan];
    }
}
