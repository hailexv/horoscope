package com.example.blackmoon.horosc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    private Button birthDate;
    private Button todaysHoroscope;
    private Button exit;
    private Button signs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        birthDate = findViewById(R.id.birthday);
        todaysHoroscope = findViewById(R.id.todaysHoroscope);
        signs = findViewById(R.id.zod);

        birthDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, MainActivity.class);
                startActivity(intent);
            }
        });

        todaysHoroscope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.astrology.com/horoscopes.html");
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(it);

            }
        });

        signs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, signs.class);
                startActivity(intent);
            }
        });

        exit = findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

    }


}
