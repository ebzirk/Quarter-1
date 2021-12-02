package com.example.appfinal;

import java.util.Locale;

public class Check {

    public boolean wordCheck(String one, String two) {
        boolean answer;
        if (one.toLowerCase().equals(two.toLowerCase())) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }



}
