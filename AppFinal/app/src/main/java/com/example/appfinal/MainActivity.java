package com.example.appfinal;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Check check = new Check();
    Trivia trivia = new Trivia();

    TextView mandoWords;
    TextView mandoScript;
    TextView ansStatus;
    ImageView character;
    Button checkAnswer;
    Button scriptButton;
    Button languageButton;
    Button scriptStart;
    Button backButton;
    Button characterButton;
    Button characterCheck;
    EditText answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //outputs
        mandoWords = findViewById(R.id.mandoWords);
        mandoScript = findViewById(R.id.mandoScript);
        character = findViewById(R.id.character);

        //buttons
        checkAnswer = findViewById(R.id.languageCheck);
        scriptStart = findViewById(R.id.scriptCheck);
        scriptButton = findViewById(R.id.button3);
        characterButton = findViewById(R.id.button4);


        characterCheck = findViewById(R.id.characterCheck);

        //answer related
        answer = findViewById(R.id.answerTextField);
        ansStatus = findViewById(R.id.ansStatus);

        //back button
        backButton = findViewById(R.id.back);

        languageClick();
        scriptClick();
        characterClick();
    }


    public void scriptClick() {
        scriptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScriptActivity.class));
            }
        });
    }

    private void languageClick() {
        languageButton = findViewById(R.id.mandoLanguage);
        languageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LanguageActivity.class));
            }
        });
    }

    private void characterClick(){
        characterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CharacterActivity.class));
            }
        });
    }


}