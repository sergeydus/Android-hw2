package com.example.android_hw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question9Activity extends AppCompatActivity {
    private Button Answer1Button;
    private Button Answer2Button;
    private Button Answer3Button;
    private Button Answer4Button;
    int currentScore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);
        currentScore=getIntent().getIntExtra("score",0);

        Answer1Button= (Button) findViewById(R.id.Q9button1);
        Answer1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        Answer2Button= (Button) findViewById(R.id.Q9button2);
        Answer2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        Answer3Button= (Button) findViewById(R.id.Q9button3);
        Answer3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        Answer4Button= (Button) findViewById(R.id.Q9button4);
        Answer4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
    }


    public void openActivity1(){
        Intent intent = new Intent(this, Question10Activity.class);
        intent.putExtra("score",currentScore+1);
        startActivity(intent);
    }
    public void openActivity2(){
        Intent intent = new Intent(this, Question10Activity.class);
        intent.putExtra("score",currentScore+0);
        startActivity(intent);
    }
}
