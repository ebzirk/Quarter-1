package com.example.appfinal;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ScriptActivity extends AppCompatActivity {
    Script script = new Script();
    Check check = new Check();

    TextView ansStatus;
    TextView answer;
    TextView mandoScript;

    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_script);

        script.generate();

        ansStatus = findViewById(R.id.scriptAnsStatus);

        mandoScript = findViewById(R.id.mandoScript);
        mandoScript.setText(script.letter);

        answer = findViewById(R.id.scriptAnsInput);

        backButton = findViewById(R.id.scriptBack);

        backClick();
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

    private void backClick() {
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScriptActivity.this, MainActivity.class));
            }
        });
    }
}