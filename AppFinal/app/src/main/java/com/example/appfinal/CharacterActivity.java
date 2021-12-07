package com.example.appfinal;

import android.content.Intent;
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

    //Texts
    ImageView character;
    TextView ansStatus;
    EditText answer;

    //Buttons
    Button backButton;
    Button characterCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        getSupportActionBar().hide();
        trivia.charTrivia();

        //text fields
        ansStatus = findViewById(R.id.charAnsStatus);
        answer = findViewById(R.id.charAnsInput);
        character = findViewById(R.id.character);

        //buttons
        characterCheck = findViewById(R.id.characterCheck);
        backButton = findViewById(R.id.charBack);

        //Character image shown
        character.setImageResource(trivia.charShown);

        backCharClick();
    }

    //Checks to see if the name entered matches the image shown.
    //If they match, it moves to the next pairing.
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

    //Back button to take you back to the main page of the app.
    private void backCharClick() {
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CharacterActivity.this,
                        MainActivity.class));
            }
        });
    }
}