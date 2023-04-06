package com.example.mocktrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AbtInterview extends AppCompatActivity {

    private Button aptitudeBtn , gdbutton , problemSolving , personalHRround;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abt_interview);

        aptitudeBtn = findViewById(R.id.aptbtn);
        gdbutton = findViewById(R.id.gd);
        problemSolving = findViewById(R.id.ps);
        personalHRround = findViewById(R.id.hr);

        aptitudeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbtInterview.this, AptitudeTest.class);
                startActivity(intent);
            }
        });

        gdbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbtInterview.this,Gd.class);
                startActivity(intent);
            }
        });

        problemSolving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbtInterview.this,ProblemSolving.class);
                startActivity(intent);
            }
        });

        personalHRround.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbtInterview.this,PersonalHR.class);
                startActivity(intent);
            }
        });
    }
}