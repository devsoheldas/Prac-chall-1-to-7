package com.techsohelbd.seasson1allclassandpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;

public class Practice_Challange_2 extends AppCompatActivity {


    ImageView Dot3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_challange2);

        Dot3 = findViewById(R.id.Dot3);

        Dot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Code here
                Intent intent = new Intent (Practice_Challange_2.this,SPI.class);
                startActivity(intent);
            }
        });


    }
}