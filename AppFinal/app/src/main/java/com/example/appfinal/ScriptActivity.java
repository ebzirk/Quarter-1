package com.example.appfinal;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ScriptActivity extends AppCompatActivity {
    Script script = new Script();
    Check check = new Check();

    //Texts
    TextView ansStatus;
    TextView answer;
    TextView mandoScript;
    TextView answerShown;
    TextView scriptScore;

    //Buttons
    Button backButton;
    Button scriptButton;

    ImageView helm;//Helm in the background

    int round;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_script);
        getSupportActionBar().hide();

        script.generate();

        //texts
        ansStatus = findViewById(R.id.scriptAnsStatus);
        mandoScript = findViewById(R.id.mandoScript);
        mandoScript.setText(script.letter);
        answer = findViewById(R.id.scriptAnsInput);
        answerShown = findViewById(R.id.letterAns);
        scriptScore = findViewById(R.id.scriptScore);

        //buttons
        scriptButton = findViewById(R.id.scriptCheck);
        backButton = findViewById(R.id.scriptBack);

        //Helmet in background
        helm = findViewById(R.id.helmet);
        helm.setAlpha(50);

        backClick();
    }

    //When the button is clicked, will check if the answer is correct or not.
    //if it is, it will move on to the next letter.
    //If not, you have 3 lives before it doesn't let you try again.
    public void scriptCheck(View view){
        boolean ansCheck = check.wordCheck(script.letter,answer.getText().toString());
        if (round <= 2 || score == 40) {
            if (score == 40) {
                ansStatus.setText("YOU WIN");
                answer.setText("");
                scriptButton.setVisibility(View.INVISIBLE);
                scriptScore.setText("Score\n" + Integer.toString(score + 10));
            } else {
                if (ansCheck) {
                    ansStatus.setText("Correct!!");
                    script.generate();
                    mandoScript.setText(script.letter);
                    answer.setText("");
                    round = 0;
                    score += 10;
                    scriptScore.setText("Score\n" + Integer.toString(score));
                } else {
                    if (round == 2) {
                        answerShown.setText(script.letter);
                        ansStatus.setText("Better luck next time.");
                        scriptButton.setVisibility(View.INVISIBLE);
                    } else {
                        ansStatus.setText("Incorrect!!");
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
                startActivity(new Intent(ScriptActivity.this, MainActivity.class));
            }
        });
    }
}