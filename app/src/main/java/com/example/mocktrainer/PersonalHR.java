package com.example.mocktrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersonalHR extends AppCompatActivity {

    private Button InterviewBit , UpGrad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_hr);

        InterviewBit = findViewById(R.id.ib);
        UpGrad = findViewById(R.id.ug);

        InterviewBit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.interviewbit.com/hr-interview-questions/"));
                startActivity(intent);
            }
        });

        UpGrad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.upgrad.com/blog/hr-interview-questions-answers/"));
                startActivity(intent);
            }
        });


    }
}