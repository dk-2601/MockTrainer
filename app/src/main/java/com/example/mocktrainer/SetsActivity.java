package com.example.mocktrainer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import org.jetbrains.annotations.NotNull;

import androidx.appcompat.widget.Toolbar;

import static com.example.mocktrainer.MainActivity.subList;

public class SetsActivity extends AppCompatActivity {

    private GridView sets_grid;
    private FirebaseFirestore firestore;
    public static int subject_id;
    //private Dialog loadingDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sets);

        Toolbar toolbar = findViewById(R.id.set_toolbar);
        setSupportActionBar(toolbar);

        String title = getIntent().getStringExtra("SUBJECT");
        subject_id = getIntent().getIntExtra("SUBJECT_ID",1);
        getSupportActionBar().setTitle(title);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sets_grid = findViewById(R.id.sets_gridview);

        /*loadingDialog = new Dialog(SetsActivity.this);
        loadingDialog.setContentView(R.layout.loading_progressbar);
        loadingDialog.setCancelable(false);
        loadingDialog.getWindow().setBackgroundDrawableResource(R.drawable.progress_background);
        loadingDialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        loadingDialog.show();*/

        firestore = FirebaseFirestore.getInstance();

        loadSets();



    }

    public void loadSets()
    {

        firestore.collection("QUIZ").document("SUB" + String.valueOf(subject_id))
                .get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
        @Override
        public void onComplete(@NonNull @NotNull Task<DocumentSnapshot> task) {

            if (task.isSuccessful()) {

                DocumentSnapshot doc = task.getResult();

                if (doc.exists()) {
                    long sets = (long) doc.get("SETS");

                    SetsAdapter adapter = new SetsAdapter((int) sets);
                    sets_grid.setAdapter(adapter);



                } else {
                    Toast.makeText(SetsActivity.this, "No SUB document Exists!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            } else {


                Toast.makeText(SetsActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();

            }
            //loadingDialog.cancel();
        }
    });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}