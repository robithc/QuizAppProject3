package com.example.android.quizappproject3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {

    EditText editText;
    CheckBox checkBox1,checkBox2, checkBox3, checkBox4, checkBox5;

int answer_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox1 = findViewById(R.id.question_2_answer_1);
        checkBox2 = findViewById(R.id.question_2_answer_2);
        checkBox3 = findViewById(R.id.question_2_answer_3);
        checkBox4 = findViewById(R.id.question_2_answer_4);
        checkBox5 = findViewById(R.id.question_2_answer_5);



    }

public void Question_2_Check(View view){
        boolean checked = ((CheckBox)view).isChecked();
        int answer = 0;

    switch (view.getId()) {
        case R.id.question_2_answer_1:
            answer = 0;
            break;
        case R.id.question_2_answer_2:
            answer = 1;
            break;
        case R.id.question_2_answer_3:
            answer = 2;
            break;
    }

}











    private void calculateScore(String answer1, int answer2, int answer3, int answer4, boolean[] answer5)
    {
        editText =  findViewById(R.id.question_1_edit_text);
        String answer_1 = editText.getText().toString();

        int score = 0;
        if (answer_1.toLowerCase().equals("florentino perez"))
        {
            score++;
        }

        if (answer2 == 1)
        {
            score++;
        }

        if (answer3 == 2)
        {
            score++;
        }

        if (answer4 == 1)
        {
            score++;
        }

        for (int i = 0; i < 4; i++)
        {
            if (answer5[i])
            {
                score++;
            }
        }



        String scoreMessage = getString(R.string.score) +" "+ score;

        Toast scoreToast = Toast.makeText(this, scoreMessage, Toast.LENGTH_LONG);
        scoreToast.show();
    }
    }







