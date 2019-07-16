package com.example.blackmoon.horosc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Description extends AppCompatActivity {

    private TextView signName;
    private TextView description;
    private TextView upside;
    private TextView downside;
    private ImageView sign;
    private TextView hiddenSide;
    private TextView habit;
    private TextView fear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        signName = findViewById(R.id.name);
        description = findViewById(R.id.description);
        upside = findViewById(R.id.upside);
        downside = findViewById(R.id.downside);
        sign = findViewById(R.id.sign);
        hiddenSide = findViewById(R.id.hiddenSide);
        habit = findViewById(R.id.habit);
        fear = findViewById(R.id.fear);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        switch (name) {
            case "Gemini":
                signName.setText(name);
                description.setText(R.string.gemniDescription);
                upside.setText(R.string.gemniUpside);
                downside.setText(R.string.gemniDownside);
                hiddenSide.setText(R.string.gemniHiddenSide);
                habit.setText(R.string.gemniHabit);
                fear.setText(R.string.gemniFear);
                sign.setImageResource(R.drawable.ic_gemini);

                break;

            case "Aries":
                signName.setText(name);
                description.setText(R.string.ariesDescription);
                upside.setText(R.string.ariesUpside);
                downside.setText(R.string.ariesDownside);
                hiddenSide.setText(R.string.ariesHiddenSide);
                habit.setText(R.string.ariesHabit);
                fear.setText(R.string.ariesFear);
                sign.setImageResource(R.drawable.ic_aries);

                break;

            case "Virgo":
                signName.setText(name);
                description.setText(R.string.virgoDescription);
                upside.setText(R.string.virgoUpside);
                downside.setText(R.string.virgoDownside);
                hiddenSide.setText(R.string.virgoHiddenSide);
                habit.setText(R.string.virgoHabit);
                fear.setText(R.string.virgoFear);
                sign.setImageResource(R.drawable.ic_virgo);

                break;

            case "Taurus":
                signName.setText(name);
                description.setText(R.string.taurusDescription);
                upside.setText(R.string.taurusUpside);
                downside.setText(R.string.taurusDownside);
                hiddenSide.setText(R.string.taurusHiddenSide);
                habit.setText(R.string.taurusHabit);
                fear.setText(R.string.taurusFear);
                sign.setImageResource(R.drawable.ic_taurus_1);

                break;

            case "Scorpio":
                signName.setText(name);
                description.setText(R.string.scorpioDescription);
                upside.setText(R.string.scorpioUpside);
                downside.setText(R.string.scorpioDownside);
                hiddenSide.setText(R.string.scorpioHiddenSide);
                habit.setText(R.string.scorpioHabit);
                fear.setText(R.string.scorpioFear);
                sign.setImageResource(R.drawable.ic_scorpio_1);

                break;

            case "Sagitarius":
                signName.setText(name);
                description.setText(R.string.sagitariusDescription);
                upside.setText(R.string.sagitariusUpside);
                downside.setText(R.string.sagitariusDownside);
                hiddenSide.setText(R.string.sagitariusHiddenSide);
                habit.setText(R.string.sagitariusHabit);
                fear.setText(R.string.sagitariusFear);
                sign.setImageResource(R.drawable.ic_sagittarius_1);

                break;

            case "Pisces":
                signName.setText(name);
                description.setText(R.string.piscesDescription);
                upside.setText(R.string.piscesUpside);
                downside.setText(R.string.piscesDownside);
                hiddenSide.setText(R.string.piscesHiddenSide);
                habit.setText(R.string.piscesHabit);
                fear.setText(R.string.piscesFear);
                sign.setImageResource(R.drawable.ic_pisces_1);

                break;

            case "Leo":
                signName.setText(name);
                description.setText(R.string.leoDescription);
                upside.setText(R.string.leoUpside);
                downside.setText(R.string.leoDownside);
                hiddenSide.setText(R.string.leoHiddenSide);
                habit.setText(R.string.leoHabit);
                fear.setText(R.string.leoFear);
                sign.setImageResource(R.drawable.ic_leo_1);

                break;

            case "Libra":
                signName.setText(name);
                description.setText(R.string.libraDescription);
                upside.setText(R.string.libraUpside);
                downside.setText(R.string.libraDownside);
                hiddenSide.setText(R.string.libraHiddenSide);
                habit.setText(R.string.libraHabit);
                fear.setText(R.string.libraFear);
                sign.setImageResource(R.drawable.ic_libra_1);

                break;

            case "Aquarius":
                signName.setText(name);
                description.setText(R.string.aquariusDescription);
                upside.setText(R.string.aquariusUpside);
                downside.setText(R.string.aquariusDownside);
                hiddenSide.setText(R.string.aquariusHiddenSide);
                habit.setText(R.string.aquariusHabit);
                fear.setText(R.string.aquariusFear);
                sign.setImageResource(R.drawable.ic_aquarius);

                break;

            case "Cancer":
                signName.setText(name);
                description.setText(R.string.cancerDescription);
                upside.setText(R.string.cancerUpside);
                downside.setText(R.string.cancerDownside);
                hiddenSide.setText(R.string.cancerHiddenSide);
                habit.setText(R.string.cancerHabit);
                fear.setText(R.string.cancerFear);
                sign.setImageResource(R.drawable.ic_cancer);

                break;

            case "Capricorn":
                signName.setText(name);
                description.setText(R.string.capricornDescription);
                upside.setText(R.string.capricornUpside);
                downside.setText(R.string.capricornDownside);
                hiddenSide.setText(R.string.capricornHiddenSide);
                habit.setText(R.string.capricornHabit);
                fear.setText(R.string.capricornFear);
                sign.setImageResource(R.drawable.ic_capricornus);

                break;
        }
    }
}
