package com.example.android.quiz_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void radio1(View view) {
        RadioButton radioThree = (RadioButton) findViewById(R.id.radioThreeOfOne);
        Boolean radioThreeOfOneYes = radioThree.isChecked();
        if (radioThreeOfOneYes) {
            score++;
            Toast.makeText(this, R.string.correct_answer, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, R.string.incrorrect_answer, Toast.LENGTH_SHORT).show();
        }
    }

    public void radio2(View view) {
        RadioButton radioFive = (RadioButton) findViewById(R.id.radioTwoOfTwo);
        Boolean radioTwoOfTwoYes = radioFive.isChecked();
        if (radioTwoOfTwoYes) {
            score++;
            Toast.makeText(this, R.string.correct_answer, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, R.string.incrorrect_answer, Toast.LENGTH_SHORT).show();
        }

    }

    public void submitAnswer1(View view) {
        EditText your_answer = (EditText) findViewById(R.id.answer);
        String ans = your_answer.getText().toString().trim();
        if (ans.equalsIgnoreCase("8")) {
            score++;
            Toast.makeText(this, R.string.correct_answer, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, R.string.incrorrect_answer, Toast.LENGTH_SHORT).show();
        }
    }

    public void submitAnswer(View view) {
        EditText bird_name = (EditText) findViewById(R.id.bird);
        String ansTwo = bird_name.getText().toString().trim();
        if (ansTwo.equalsIgnoreCase("Falcon")) {
            score++;
            Toast.makeText(this, R.string.correct_answer, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, R.string.incrorrect_answer, Toast.LENGTH_SHORT).show();
        }
    }

    public void check_this(View view) {
        CheckBox AnimalOne = (CheckBox) findViewById(R.id.bear);
        Boolean AnimalOneCheck = AnimalOne.isChecked();
        CheckBox AnimalTwo = (CheckBox) findViewById(R.id.crocodile);
        Boolean AnimalTwoCheck = AnimalTwo.isChecked();
        CheckBox AnimalThree = (CheckBox) findViewById(R.id.hamster);
        Boolean AnimalThreeCheck = AnimalThree.isChecked();
        if (AnimalOneCheck && AnimalThreeCheck && !AnimalTwoCheck) {
            score++;
            Toast.makeText(this, R.string.correct_answer, Toast.LENGTH_SHORT).show();
        } else if (AnimalTwoCheck) {
            Toast.makeText(this, R.string.incrorrect_answer, Toast.LENGTH_SHORT).show();
        }
    }

    public void checkScore(View view) {
        Toast.makeText(this, "You scored " + score + " out of 5", Toast.LENGTH_SHORT).show();
    }


}