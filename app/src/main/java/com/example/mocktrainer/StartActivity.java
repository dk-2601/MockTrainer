package com.example.mocktrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {
    private Button StartButton,InterviewProcess,abtUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();*/

        setContentView(R.layout.activity_start);

        StartButton = findViewById(R.id.startButton);
        InterviewProcess = findViewById(R.id.abtInterview);
        abtUs = findViewById(R.id.aboutus);

        StartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,SubjectActivity.class);
                startActivity(intent);
            }


        });

        InterviewProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,AbtInterview.class);
                startActivity(intent);
            }
        });



        abtUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,AboutUs.class);
                startActivity(intent);
            }
        });

        /*abtInterview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,AbtInterview.class);
                startActivity(intent);
            }
        });*/


    }
}