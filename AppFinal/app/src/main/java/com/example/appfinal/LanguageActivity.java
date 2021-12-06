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
    TextView mandoHint;
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
        mandoWords = findViewById(R.id.mandoWords);
        mandoWords.setText(language.mandoAnswer);
        mandoHint = findViewById(R.id.mandoHint);
        mandoHint.setText(language.mandoAnswer);
        langHint = findViewById(R.id.langHint);
        langScore = findViewById(R.id.langScore);
        backButton = findViewById(R.id.langBack);
        langButton = findViewById(R.id.langCheck);

        answer = findViewById(R.id.landAnsInput);
        ansStatus = findViewById(R.id.langAns);
        langScore.setText("Score\n");

        backClick();
    }

    public void languageCheck(View view) {
        boolean ansCheck = check.wordCheck(language.engAnswer, answer.getText().toString());
        if (round <= 2 || score == 90) {
            if (score == 100) {
                ansStatus.setText("YOU WIN");
                langHint.setText("");
                langButton.setVisibility(View.INVISIBLE);
                langScore.setText("Score\n" + Integer.toString(score));
            } else {
                if (ansCheck) {
                    ansStatus.setText("Correct!!");
                    language.generate();
                    mandoWords.setText(language.mandoAnswer);
                    mandoHint.setText(language.mandoAnswer);
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