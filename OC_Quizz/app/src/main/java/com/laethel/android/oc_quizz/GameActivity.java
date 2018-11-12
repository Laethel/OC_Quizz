package com.laethel.android.oc_quizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private TextView question;
    private Button answ1;
    private Button answ2;
    private Button answ3;
    private Button answ4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        question = (TextView) findViewById(R.id.game_question_text);
        answ1 = (Button) findViewById(R.id.game_answer1);
        answ2 = (Button) findViewById(R.id.game_answer2);
        answ3 = (Button) findViewById(R.id.game_answer3);
        answ4 = (Button) findViewById(R.id.game_answer4);
    }
}
