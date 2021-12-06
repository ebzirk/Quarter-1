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

public class MainActivity extends AppCompatActivity {

    Button scriptButton;
    Button languageButton;
    Button backButton;
    Button characterButton;
    ImageView mythSkull;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        //buttons
        scriptButton = findViewById(R.id.button3);
        languageButton = findViewById(R.id.mandoLanguage);
        characterButton = findViewById(R.id.button4);

        //back button
        backButton = findViewById(R.id.back);

        //mythosaur skull on main page
        mythSkull = findViewById(R.id.mythSkull);
        mythSkull.setAlpha(60);

        languageClick();
        scriptClick();
        characterClick();
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
}