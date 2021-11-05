package edu.neumont;

import java.util.Random;

public class Language {
    String[] mandoa = {"Cyar'ika", "Aliit", "Beskar'gam", "Buy'ce", "Wayii", "Darasuum", "Di'kut", "Pare", "Kote",
            "Vod", "Oya", "Kar'ta", "Mand'alor", "K'uur", "Ge'tal", "Darjetii", "Kai'tome", "Kyr'am", "Aruetii",
            "Pirur", "Sharal", "Tracyn", "Beroya", "Riduur", "Vor'e", "Mirshmure'cya", "Mesh'la", "Shab", "Osik",
            "Haar'chak", "Rangir", "Cabur", "Lovik", "Gedet'ye", "K'atini", "Iviin", "Udesii"};

    String[] engVers = {"Darling", "Family", "Armor", "Helmet", "Good grief", "Eternity", "Idiot", "Wait", "Glory",
            "Comrade", "Cheers", "Heart", "Sole ruler", "Hush", "Red", "Sith", "Food", "Death", "Outsider", "Drink",
            "Lazy", "Fire", "Bounty Hunter", "Spouse", "Thanks", "Keldabe kiss", "Beautiful", "Fuck", "Shit",
            "Damn it", "To hell with it", "Guardian", "Knee", "Please", "Suck it up", "Speed", "Calm down"};

    String[] pronunce = {"shar-EE-kah", "ah-LEET", "BES-kar-GAM", "BOO-shay", "why-EE", "da-RAH-soom", "DEE-koot",
            "PAH-ray", "KOH-day", "vohd", "OY-ah", "kah-ROH-ta", "MAHN-dah-lor", "koor", "ge-TAhL", "dar-JAY-tee",
            "kai-TOHM-ay", "kee-RAHM", "ah-roo-AY-tee", "peer-OOR", "SHAH-ral", "trah-SHEEN", "bair-OY-ah", "REE-door",
            "VOHR-ay", "meersh-moor-AY-shah", "MAYSH-la", "SHAH-buh", "OH-sick", "HAR-chak", "RAN-geer", "KAH-boor",
            "LOH-veek", "Geh-DET-yay", "kah-TEEN-ee", "ee-VEEN", "oo-DAY-see"};

    String[] hints = {"Nickname for a significant other", "group of extremely close people", "Knights wore similar",
            "Head bucket", "Exclamation. Oh lords", "Forever", "Someone dumb", "Hang on", "Majesty", "It's also " +
            "'friend, brother, sister.", "Let's hunt, Stay Alive!", "Blood pumper", "Single king, someone in charge",
            "Be quiet", "Color of blood", "Users of the Dark Side", "Something you eat", "End of life", "Can also " +
            "mean Traitor, or foreigner", "You do this with water and ale", "Don't wanna do anything", "Burns things",
            "What is Boba Fett", "Husband, wife, partner", "Said before \"Your welcome\"", "Literally \"Brain kiss\"",
            "The best thing to call a woman", "F bomb", "Crap", "Swearing exclamation", "To heck it goes", "Protector",
            "Body part, middle of the leg", "With sugar on top?", "\"_____\" buttercup", "Lightning McQueen",
            "Also \"Take it easy\""};

    String mandoAnswer;
    String hintAnswer;
    String engAnswer;
    String nunciate;


    int getRandom(int min, int max){
        Random random = new Random();
        return random.nextInt(min, max - 1);
    }

    void generate(){
        int susan = getRandom(0, mandoa.length);
        mandoAnswer = mandoa[susan];
        hintAnswer = hints[susan];
        engAnswer =  engVers[susan];
        nunciate = pronunce[susan];

    }
}
