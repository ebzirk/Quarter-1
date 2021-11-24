package com.example.highrollerdicegame;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    com.example.highrollerdicegame.Player[] players = new com.example.highrollerdicegame.Player[3];
    TextView[] playerView = new TextView[3];
    int currentPlayerIndex = 0;

    Die[] dice = new Die[4];
    TextView[] dieViews = new TextView[4];
    int round = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        players[0] = new com.example.highrollerdicegame.Player("Xavier");
        players[1] = new com.example.highrollerdicegame.Player("Ethan");
        players[2] = new com.example.highrollerdicegame.Player("Steve");


        playerView[0] = findViewById(R.id.playerOne);
        playerView[1] = findViewById(R.id.playerTwo);
        playerView[2] = findViewById(R.id.playerThree);

        dice[0] = new Die();
        dice[1] = new Die();
        dice[2] = new Die();
        dice[3] = new Die();

        dieViews[0] = findViewById(R.id.dice1);
        dieViews[1] = findViewById(R.id.dice2);
        dieViews[2] = findViewById(R.id.dice3);
        dieViews[3] = findViewById(R.id.dice4);

        updatePlayerView();
    }

    public void rollClick(View view) {
        if(round > 3){
            return;
        }
        for (Die die : dice) {
            die.roll();
        }

        int total = 0;
        for (Die die : dice) {
            total += die.getValue();
        }

        String status = players[currentPlayerIndex].getName() + " rolled a " + total + " in round " + round;
        setStatusText(status);

        players[currentPlayerIndex].setScore(players[currentPlayerIndex].getScore() + total);
        currentPlayerIndex++;
        if (currentPlayerIndex == 3) {
            currentPlayerIndex = 0;
            round++;
            if (round > 3) {
                if (players[0].getScore() > players[1].getScore()) {
                    if (players[0].getScore() > players[2].getScore()) {
                        setStatusText(players[0].getName() + " is the winner!");
                    } else {
                        setStatusText(players[2].getName() + " is the winner!");
                    }
                } else {
                    if (players[1].getScore() > players[2].getScore()) {
                        setStatusText(players[1].getName() + " is the winner!");
                    } else {
                        setStatusText(players[2].getName() + " is the winner!");
                    }
                }
            }
        }
        updateDieViews();
        updatePlayerView();
    }

    private void updatePlayerView() {
        for (int i = 0; i < playerView.length; i++) {
            String string = players[i].getName() + " " + players[i].getScore();
            playerView[i].setText(string);
        }
    }

    private void updateDieViews() {
        for (int i = 0; i < dieViews.length; i++) {
            dieViews[i].setText(Integer.toString(dice[i].getValue()));
        }

    }

    private void setStatusText(String string) {
        TextView statusText = findViewById(R.id.winnerBar);
        statusText.setText(string);

    }
}


