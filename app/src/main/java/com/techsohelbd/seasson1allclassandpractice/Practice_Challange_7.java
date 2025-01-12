package com.techsohelbd.seasson1allclassandpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Practice_Challange_7 extends AppCompatActivity {


    ImageView tamim,sakib,liton,soumma,sohel;
    LinearLayout Tamim_L,Sakib_L,Liton_L,Soumma_L,Sohel_L;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_challange7);

        //Variabler defone

        tamim=findViewById(R.id.tamim);
        sakib=findViewById(R.id.sakib);
        liton=findViewById(R.id.liton);
        soumma=findViewById(R.id.soumma);
        sohel=findViewById(R.id.sohel);

        Tamim_L=findViewById(R.id.Tamim_L);
        Sakib_L=findViewById(R.id.Sakib_L);
        Liton_L=findViewById(R.id.Liton_L);
        Soumma_L=findViewById(R.id.Soumma_L);
        Sohel_L=findViewById(R.id.Sohel_L);


        //OnclicListener

        tamim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code Here
                Tamim_L.setVisibility(View.VISIBLE);
                Sakib_L.setVisibility(View.GONE);
                Liton_L.setVisibility(View.GONE);
                Soumma_L.setVisibility(View.GONE);
                Sohel_L.setVisibility(View.GONE);
            }
        });
        sakib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code Here
                Tamim_L.setVisibility(View.GONE);
                Sakib_L.setVisibility(View.VISIBLE);
                Liton_L.setVisibility(View.GONE);
                Soumma_L.setVisibility(View.GONE);
                Sohel_L.setVisibility(View.GONE);
            }
        });
        liton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code Here
                Tamim_L.setVisibility(View.GONE);
                Sakib_L.setVisibility(View.GONE);
                Liton_L.setVisibility(View.VISIBLE);
                Soumma_L.setVisibility(View.GONE);
                Sohel_L.setVisibility(View.GONE);
            }
        });
        soumma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code Here
                Tamim_L.setVisibility(View.GONE);
                Sakib_L.setVisibility(View.GONE);
                Liton_L.setVisibility(View.GONE);
                Soumma_L.setVisibility(View.VISIBLE);
                Sohel_L.setVisibility(View.GONE);
            }
        });
        sohel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code Here
                Tamim_L.setVisibility(View.GONE);
                Sakib_L.setVisibility(View.GONE);
                Liton_L.setVisibility(View.GONE);
                Soumma_L.setVisibility(View.GONE);
                Sohel_L.setVisibility(View.VISIBLE);

            }
        });






    }
}