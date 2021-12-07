package com.example.appfinal;

import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button scriptButton;
    Button languageButton;
    Button backButton;
    Button characterButton;
    Button surpriseButton;
    ImageView mythSkull;


    int randomNum[] = {1,2,3,4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        //buttons
        scriptButton = findViewById(R.id.button3);
        languageButton = findViewById(R.id.mandoLanguage);
        characterButton = findViewById(R.id.button4);
        surpriseButton = findViewById(R.id.surprise);
        backButton = findViewById(R.id.back);
        mythSkull = findViewById(R.id.mythSkull);
        mythSkull.setAlpha(60);

        languageClick();
        scriptClick();
        characterClick();
        surpriseClick();
    }

    private void scriptClick() {
        scriptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScriptActivity.class));
            }
        });
    }

    private void languageClick() {
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

    private void surpriseClick(){
        Random random = new Random();
        int takeMe = random.nextInt(randomNum.length);
        surpriseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(takeMe==1){
                    startActivity(new Intent(MainActivity.this,LanguageActivity.class));
                }else if (takeMe == 2) {
                    startActivity(new Intent(MainActivity.this,ScriptActivity.class));
                }else if (takeMe ==3) {
                    startActivity(new Intent(MainActivity.this,CharacterActivity.class));
                }
            }
        });
    }
}