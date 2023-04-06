package com.example.mocktrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AptitudeTest extends AppCompatActivity {

    private Button GFG,LMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude_test);

        GFG = findViewById(R.id.ib);
        LMC = findViewById(R.id.ug);
        GFG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://practice.geeksforgeeks.org/courses/complete-interview-preparation?source=google&medium=cpc&device=c&keyword=job%20interview%20preparation&matchtype=b&campaignid=2031157862&adgroup=71863555916&gclid=CjwKCAjwu_mSBhAYEiwA5BBmf3ZqK6HxvTD2FwFhkOPMOXtQHTwrSOZgxxryiT0gRYC92ID57p9elBoCBwIQAvD_BwE"));
                startActivity(intent);
            }
        });

        LMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.launchmycareer.com/signup?utm_source=google&utm_medium=cpc&utm_campaign=&utm_adgroup=&utm_term=aptitude%20test%20for%20jobs&gclid=CjwKCAjwu_mSBhAYEiwA5BBmf9XL_ApcLSP4L5MOIQcz3f2gUpgYGf4dlmR4aZFFIdgbu2Q65ZPdexoCuuQQAvD_BwE"));
                startActivity(intent);
            }
        });
    }
}