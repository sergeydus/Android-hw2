package com.example.android_hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView test;
    int currentScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        currentScore=getIntent().getIntExtra("score",0);

        test=findViewById(R.id.ResultTextView);
        test.setText("the current score is "+currentScore);
    }
}
