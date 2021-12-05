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
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        language.generate();
        mandoWords = findViewById(R.id.mandoWords);

        mandoWords.setText(language.mandoAnswer);
        backButton = findViewById(R.id.langBack);

        answer = findViewById(R.id.landAnsInput);
        ansStatus = findViewById(R.id.langAns);

        backClick();
    }

    public void languageCheck(View view){
        boolean ansCheck = check.wordCheck(language.engAnswer,answer.getText().toString());
        if (ansCheck){
            ansStatus.setText("Correct!!");
            language.generate();
            mandoWords.setText(language.mandoAnswer);
            answer.setText("");
        } else {
            ansStatus.setText("Incorrect!!");
        }
    }

    public void backClick() {
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageActivity.this, MainActivity.class));
            }
        });
    }
}