package com.example.appfinal;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Language language = new Language();

    TextView mando;
    Button start;
    Button languageButton;
    EditText langAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mando = findViewById(R.id.mando);
        start = findViewById(R.id.check);
        languageButton = findViewById(R.id.button2);
        langAns = findViewById(R.id.answerTextField);

    }

    public void languageClick(View view){
        language.generate();
        mando.setText(language.mandoAnswer);

        if(start.getVisibility() == View.INVISIBLE){
            start.setVisibility(View.VISIBLE);
            langAns.setVisibility(View.VISIBLE);
            languageButton.setVisibility(View.INVISIBLE);
        }
        else{start.setVisibility(View.VISIBLE);
        }
    }

    public void languageCheck(){
        //String answer = .getText();
        //if (answer.toLowerCase(Locale.ROOT).equals(language.engAnswer.toLowerCase(Locale.ROOT))) {
        //  language.generate();
        //mando.setText(language.mandoAnswer);
        //} else {
        //hint.setText("Hint: " + language.hintAnswer);
        //answerTextField.setText("");
        //}
    }

}