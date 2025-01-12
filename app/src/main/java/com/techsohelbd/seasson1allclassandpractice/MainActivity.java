package com.techsohelbd.seasson1allclassandpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class   MainActivity extends AppCompatActivity {
    TextView pc1,pc2,pc3,pc4,pc5,pc6,pc7,pc8,pc9;

    BottomNavigationView bottomNavigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //........Intialize........
        pc1 = findViewById(R.id.pc1);
        pc2 = findViewById(R.id.pc2);
        pc3 = findViewById(R.id.pc3);
        pc4 = findViewById(R.id.pc4);
        pc5 = findViewById(R.id.pc5);
        pc6 = findViewById(R.id.pc6);
        pc7 = findViewById(R.id.pc7);
        pc8 = findViewById(R.id.pc8);
        pc1 = findViewById(R.id.pc1);
        pc9 = findViewById(R.id.pc9);

        bottomNavigationView =findViewById(R.id.bottomNavigationView);

        //....setOnClickListener......

        pc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this,Practice_Challange_1.class);
                startActivity(myIntent);

            }
        });
        pc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this,Practice_Challange_2.class);
                startActivity(myIntent);

            }
        });
        pc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this,Practice_Challange_3.class);
                startActivity(myIntent);

            }
        });


        pc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this,Practice_Challange_4.class);
                startActivity(myIntent);

            }
        });
        pc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this,Practice_Challange_7.class);
                startActivity(myIntent);

            }
        });


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {





                return false;
            }
        });



    }
}