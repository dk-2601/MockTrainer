package com.example.mocktrainer;
import com.example.mocktrainer.R;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;


import androidx.appcompat.widget.Toolbar;

import static com.example.mocktrainer.MainActivity.subList;

public class SubjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();*/
        setContentView(R.layout.activity_subject);


        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Subjects");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        GridView subGrid = findViewById(R.id.subGridView);



        SubGridAdapter adapter = new SubGridAdapter(subList);
        subGrid.setAdapter(adapter);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}