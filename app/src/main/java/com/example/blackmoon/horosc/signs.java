package com.example.blackmoon.horosc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class signs extends AppCompatActivity {

    private CardView virgo;
    private CardView aries;
    private CardView taurus;
    private CardView scorpio;
    private CardView sagitarius;
    private CardView pisces;
    private CardView leo;
    private CardView libra;
    private CardView gemini;
    private CardView aquarius;
    private CardView cancer;
    private CardView capricorn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signs);

        virgo = findViewById(R.id.virgo);
        aries = findViewById(R.id.aries);
        taurus = findViewById(R.id.taurus);
        scorpio = findViewById(R.id.scorpio);
        sagitarius = findViewById(R.id.sagitarius);
        pisces = findViewById(R.id.pisces);
        leo = findViewById(R.id.leo);
        libra = findViewById(R.id.libra);
        gemini = findViewById(R.id.gemini);
        aquarius = findViewById(R.id.aquarius);
        cancer = findViewById(R.id.cancer);
        capricorn = findViewById(R.id.capricorn);

        virgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signs.this, Description.class);
                intent.putExtra("name", "Virgo");
                startActivity(intent);
            }
        });

        aries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signs.this, Description.class);
                intent.putExtra("name", "Aries");
                startActivity(intent);
            }
        });

        taurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signs.this, Description.class);
                intent.putExtra("name", "Taurus");
                startActivity(intent);
            }
        });

        scorpio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signs.this, Description.class);
                intent.putExtra("name", "Scorpio");
                startActivity(intent);
            }
        });

        sagitarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signs.this, Description.class);
                intent.putExtra("name", "Sagitarius");
                startActivity(intent);
            }
        });

        pisces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signs.this, Description.class);
                intent.putExtra("name", "Pisces");
                startActivity(intent);
            }
        });

        leo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signs.this, Description.class);
                intent.putExtra("name", "Leo");
                startActivity(intent);
            }
        });

        libra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signs.this, Description.class);
                intent.putExtra("name", "Libra");
                startActivity(intent);
            }
        });

        gemini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signs.this, Description.class);
                intent.putExtra("name", "Gemini");
                startActivity(intent);
            }
        });

        aquarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signs.this, Description.class);
                intent.putExtra("name", "Aquarius");
                startActivity(intent);
            }
        });

        cancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signs.this, Description.class);
                intent.putExtra("name", "Cancer");
                startActivity(intent);
            }
        });

        capricorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signs.this, Description.class);
                intent.putExtra("name", "Capricorn");
                startActivity(intent);
            }
        });
    }
}
