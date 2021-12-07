package com.example.appfinal;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LanguageActivity extends AppCompatActivity {
    Check check = new Check();
    Language language = new Language();


    TextView mandoWords;
    TextView answer;
    TextView ansStatus;
    TextView langHint;
    TextView langScore;
    Button backButton;
    Button langButton;

    int round = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        getSupportActionBar().hide();

        language.generate();

        //Texts
        mandoWords = findViewById(R.id.mandoWords);
        mandoWords.setText(language.mandoAnswer); //Shows the answer
        langScore = findViewById(R.id.langScore);

        //buttons
        backButton = findViewById(R.id.langBack);
        langButton = findViewById(R.id.langCheck);

        answer = findViewById(R.id.landAnsInput); // Where you put the answer in
        ansStatus = findViewById(R.id.langAns);
        langScore.setText("Score\n");

        backClick();
    }

    //When the button is clicked, will check if the answer is correct or not.
    //if it is, it will move on to the next word to guess.
    //If not, you have 3 lives before it doesn't let you try again.
    public void languageCheck(View view) {
        boolean ansCheck = check.wordCheck(language.engAnswer, answer.getText().toString());
        if (round <= 2 || score == 40) {
            if (score == 40) {
                ansStatus.setText("YOU WIN");
                langHint.setText("");
                langButton.setVisibility(View.INVISIBLE);
                langScore.setText("Score\n" + Integer.toString(score + 10));
            } else {
                if (ansCheck) {
                    ansStatus.setText("Correct!!");
                    language.generate();
                    mandoWords.setText(language.mandoAnswer);
                    answer.setText("");
                    langHint.setText("");
                    round = 0;
                    score += 10;
                    langScore.setText("Score\n" + Integer.toString(score));
                } else {
                    if (round == 2) {
                        if (round == 2) {
                            ansStatus.setText("Try again.");
                            langHint.setText("Answer: " + language.engAnswer);
                            langButton.setVisibility(View.INVISIBLE);
                        }
                    } else {
                        ansStatus.setText("Incorrect!!");
                        langHint.setText(language.hintAnswer);
                        round++;
                    }
                }
            }
        }
    }

    //Back button to take you back to the main page of the app.
    private void backClick() {
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageActivity.this,
                        MainActivity.class));
            }
        });
    }
}