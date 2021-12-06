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

    TextView ansStatus;
    TextView answer;
    TextView mandoScript;

    ImageView helm;

    Button backButton;
    Button scriptButton;

    int round;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_script);
        getSupportActionBar().hide();

        script.generate();

        ansStatus = findViewById(R.id.scriptAnsStatus);

        mandoScript = findViewById(R.id.mandoScript);
        mandoScript.setText(script.letter);

        answer = findViewById(R.id.scriptAnsInput);

        scriptButton = findViewById(R.id.scriptCheck);
        backButton = findViewById(R.id.scriptBack);

        //Helmet in background
        helm = findViewById(R.id.helmet);
        helm.setAlpha(50);

        backClick();
    }

    public void scriptCheck(View view){
        boolean ansCheck = check.wordCheck(script.letter,answer.getText().toString());
        if (round <= 2) {
            if (ansCheck) {
                ansStatus.setText("Correct!!");
                script.generate();
                mandoScript.setText(script.letter);
                answer.setText("");
                round = 0;
            } else {
                if (round == 2) {
                    ansStatus.setText("Try again.");
                    scriptButton.setVisibility(View.INVISIBLE);
                } else {
                    ansStatus.setText("Incorrect!!");
                    round++;
                }
            }
        }
    }

    private void backClick() {
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScriptActivity.this, MainActivity.class));
            }
        });
    }
}