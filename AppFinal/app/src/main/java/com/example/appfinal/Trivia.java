package com.example.appfinal;

import java.util.Random;

public class Trivia {

    int charShown;
    String charAns;

    // storage for all Trivia info
    int charPic[] = {R.drawable.bo, R.drawable.boba, R.drawable.din, R.drawable.ultimate, R.drawable.jango,
            R.drawable.jaster, R.drawable.paz, R.drawable.sabine};
    String charName[] = {"Bo Katan", "Boba Fett", "Din Djarin", "Mand'alor the Ultimate", "Jango Fett", "Jaster Mereel",
            "Paz Vizsla", "Sabine Wren"};

    // character Trivia, pulls up images for the player to guess
    void charTrivia() {
        Random random = new Random();
        int susan = random.nextInt(charPic.length);
        charShown = charPic[susan];
        charAns = charName[susan];
    }
}
