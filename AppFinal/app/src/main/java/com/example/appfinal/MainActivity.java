package com.example.appfinal;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Language language = new Language();
    Script script = new Script();
    Check check = new Check();
    Trivia trivia = new Trivia();

    TextView mandoWords;
    TextView mandoScript;
    TextView ansStatus;
    ImageView character;
    Button checkAnswer;
    Button languageButton;
    Button scriptButton;
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
        languageButton = findViewById(R.id.button2);
        scriptButton = findViewById(R.id.button3);
        characterButton = findViewById(R.id.button4);
        characterCheck = findViewById(R.id.characterCheck);

        //answer related
        answer = findViewById(R.id.answerTextField);
        ansStatus = findViewById(R.id.ansStatus);

        //back button
        backButton = findViewById(R.id.back);
    }

    public void characterClick(View view){
        trivia.charTrivia();
        character.setImageResource(trivia.charShown);
        if(checkAnswer.getVisibility() == View.INVISIBLE){
            character.setVisibility(View.VISIBLE);
            characterCheck.setVisibility(View.VISIBLE);
            answer.setVisibility(View.VISIBLE);
            ansStatus.setVisibility(View.VISIBLE);
            scriptButton.setVisibility(View.INVISIBLE);
            languageButton.setVisibility(View.INVISIBLE);
            characterButton.setVisibility(View.INVISIBLE);
            backButton.setVisibility(View.VISIBLE);
        }
        else{checkAnswer.setVisibility(View.VISIBLE);
        }
    }

    public void languageClick(View view){
        language.generate();
        mandoWords.setText(language.mandoAnswer);
        if(checkAnswer.getVisibility() == View.INVISIBLE){
            mandoWords.setVisibility(View.VISIBLE);
            checkAnswer.setVisibility(View.VISIBLE);
            answer.setVisibility(View.VISIBLE);
            ansStatus.setVisibility(View.VISIBLE);
            scriptButton.setVisibility(View.INVISIBLE);
            languageButton.setVisibility(View.INVISIBLE);
            backButton.setVisibility(View.VISIBLE);
        }
        else{checkAnswer.setVisibility(View.VISIBLE);
        }
    }

    public void scriptClick(View view) {
        script.generate();
        mandoScript.setText(script.letter);
        if (scriptStart.getVisibility() == View.INVISIBLE) {
            mandoScript.setVisibility(View.VISIBLE);
            scriptStart.setVisibility(View.VISIBLE);
            answer.setVisibility(View.VISIBLE);
            ansStatus.setVisibility(View.VISIBLE);
            scriptButton.setVisibility(View.INVISIBLE);
            languageButton.setVisibility(View.INVISIBLE);
            backButton.setVisibility(View.VISIBLE);
        } else {
            checkAnswer.setVisibility(View.VISIBLE);
        }
    }

    public void backClick(View view){
        mandoWords.setVisibility(View.INVISIBLE);
        mandoScript.setVisibility(View.INVISIBLE);
        checkAnswer.setVisibility(View.INVISIBLE);
        scriptStart.setVisibility(View.INVISIBLE);
        answer.setVisibility(View.INVISIBLE);
        ansStatus.setVisibility(View.INVISIBLE);
        scriptButton.setVisibility(View.VISIBLE);
        languageButton.setVisibility(View.VISIBLE);
        backButton.setVisibility(View.INVISIBLE);
    }

    public void scriptCheck(View view){
        boolean ansCheck = check.wordCheck(script.letter,answer.getText().toString());
        if (ansCheck){
            ansStatus.setText("Correct!!");
            script.generate();
            mandoScript.setText(script.letter);
            answer.setText("");
        } else {
            ansStatus.setText("Incorrect!!");
        }
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

    public void charCheck(View view){
        boolean ansCheck = check.wordCheck(trivia.charAns, answer.getText().toString());
        if (ansCheck){
            ansStatus.setText("Correct!");
            trivia.charTrivia();
            character.setImageResource(trivia.charShown);
            answer.setText("");
        } else {
            ansStatus.setText("Incorrect!");
        }
    }
}