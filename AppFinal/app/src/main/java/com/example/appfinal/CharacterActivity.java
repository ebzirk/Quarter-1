package com.example.appfinal;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

public class CharacterActivity extends AppCompatActivity {
    Trivia trivia = new Trivia();
    Check check = new Check();

    Button characterCheck;
    ImageView character;
    TextView ansStatus;
    Button backButton;
    EditText answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        trivia.charTrivia();

        characterCheck = findViewById(R.id.characterCheck);
        ansStatus = findViewById(R.id.charAnsStatus);
        answer = findViewById(R.id.charAnsInput);
        character = findViewById(R.id.character);

        backButton = findViewById(R.id.charBack);

        character.setImageResource(trivia.charShown);
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