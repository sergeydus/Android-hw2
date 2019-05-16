package com.example.android_hw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question8Activity extends AppCompatActivity {
    private Button Answer1Button;
    private Button Answer2Button;
    private Button Answer3Button;
    private Button Answer4Button;
    int score1;
    //Intent intent1 = getIntent();
    //  int score1 = getIntent().getIntExtra("score", 0);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
        score1 = getIntent().getIntExtra("score", 0);

        Answer1Button= (Button) findViewById(R.id.Q8button1);
        Answer1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        Answer2Button= (Button) findViewById(R.id.Q8button2);
        Answer2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        Answer3Button= (Button) findViewById(R.id.Q8button3);
        Answer3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        Answer4Button= (Button) findViewById(R.id.Q8button4);
        Answer4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }


    public void openActivity1(){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("score",score1+1);
        startActivity(intent);
    }
    public void openActivity2(){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("score",score1);
        startActivity(intent);
    }

}

