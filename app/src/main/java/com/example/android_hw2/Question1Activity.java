package com.example.android_hw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question1Activity extends AppCompatActivity {
    private Button Answer1Button;
    private Button Answer2Button;
    private Button Answer3Button;
    private Button Answer4Button;
    int StartingValue=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        Answer1Button= (Button) findViewById(R.id.Q1button1);
        Answer1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        Answer2Button= (Button) findViewById(R.id.Q1button2);
        Answer2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        Answer3Button= (Button) findViewById(R.id.Q1button3);
        Answer3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        Answer4Button= (Button) findViewById(R.id.Q1button4);
        Answer4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }


    public void openActivity1(){
        Intent intent = new Intent(this, Question3Activity.class);
        intent.putExtra("score",StartingValue+1);
        startActivity(intent);
    }
    public void openActivity2(){
        Intent intent = new Intent(this, Question3Activity.class);
        intent.putExtra("score",StartingValue+0);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this, Question3Activity.class);
        intent.putExtra("score",StartingValue+0);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent(this, Question3Activity.class);
        intent.putExtra("score",StartingValue+0);
        startActivity(intent);
    }
}
