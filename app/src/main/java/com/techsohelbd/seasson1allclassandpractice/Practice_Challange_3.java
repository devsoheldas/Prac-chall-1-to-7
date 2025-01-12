package com.techsohelbd.seasson1allclassandpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class Practice_Challange_3 extends AppCompatActivity {


    RelativeLayout home_page,my_trip_page,aleart_page,me_page;
    BottomNavigationView bottomNavigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_challange3);

        //onCreate define..
        home_page = findViewById(R.id.home_page);
        my_trip_page = findViewById(R.id.my_trip_page);
        aleart_page = findViewById(R.id.aleart_page);
        me_page = findViewById(R.id.me_page);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);


    bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            if (item.getItemId()==R.id.home1) {
                Toast.makeText(Practice_Challange_3.this, "Home", Toast.LENGTH_SHORT).show();
                home_page.setVisibility(View.VISIBLE);
                my_trip_page.setVisibility(View.GONE);
                aleart_page.setVisibility(View.GONE);
                me_page.setVisibility(View.GONE);
            }
            else if (item.getItemId()==R.id.my_trip) {
                Toast.makeText(Practice_Challange_3.this, "My Trip", Toast.LENGTH_SHORT).show();
                home_page.setVisibility(View.GONE);
                my_trip_page.setVisibility(View.VISIBLE);
                aleart_page.setVisibility(View.GONE);
                me_page.setVisibility(View.GONE);
            }
            else if (item.getItemId()==R.id.aleart) {
                Toast.makeText(Practice_Challange_3.this, "Aleart", Toast.LENGTH_SHORT).show();
                home_page.setVisibility(View.GONE);
                my_trip_page.setVisibility(View.GONE);
                aleart_page.setVisibility(View.VISIBLE);
                me_page.setVisibility(View.GONE);
            }
            else if (item.getItemId()==R.id.me) {
                Toast.makeText(Practice_Challange_3.this, "Me", Toast.LENGTH_SHORT).show();
                home_page.setVisibility(View.GONE);
                my_trip_page.setVisibility(View.GONE);
                aleart_page.setVisibility(View.GONE);
                me_page.setVisibility(View.VISIBLE);
            }




            return true;
        }


    });














    }
}