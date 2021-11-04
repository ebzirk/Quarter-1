package edu.neumont;

import java.util.Random;

public class Language {
    String[] mandoa = {"Cyar'ika", "Aliit", "Beskar'gam", "Buy'ce", "Wayii", "Darasuum", "Di'kut", "Pare", "Kote",
            "Vod", "Oya", "Kar'ta", "Mand'alor", "K'uur"};
    String[] engVers = {"Darling", "Family", "Armor", "Helmet", "Good grief", "Eternity", "Idiot", "Wait", "Glory",
            "Comrade", "Cheers", "Heart", "Sole ruler", "Hush"};
    String[] hints = {"Nickname for a significant other", "group of extremely close people", "Knights wore similar",
            "Head bucket", "Exclamation. Oh lords", "Forever", "Someone dumb", "Hang on", "Majesty", "It's also " +
            "'friend, brother, sister.", "Let's hunt, Stay Aive!", "Blood pumper", "Single king, someone in charge",
            "Be quiet"};

    String mandoAnswer;
    String hintAnswer;
    String engAnswer;


    int getRandom(int min, int max){
        Random random = new Random();
        return random.nextInt(min, max - 1);
    }

    void generate(){
        int susan = getRandom(0, mandoa.length);
        mandoAnswer = mandoa[susan];
        hintAnswer = hints[susan];
        engAnswer =  engVers[susan];

    }
}
