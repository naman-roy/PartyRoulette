package com.company.partyroulette;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button buttonParty, buttonTruthOrDare, buttonLoveRoulette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonParty = findViewById(R.id.buttonPartyWheel);
        buttonTruthOrDare = findViewById(R.id.buttonTruthWheel);
        buttonLoveRoulette = findViewById(R.id.buttonLoveWheel);


        buttonParty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PartyWheelActivity.class);
                startActivity(intent);
            }
        });

        buttonTruthOrDare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTruth= new Intent(MainActivity.this, TruthDareActivity.class);
                startActivity(intentTruth);
            }
        });

        buttonLoveRoulette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLove= new Intent(MainActivity.this, LoveRouletteActivity.class);
                startActivity(intentLove);
            }
        });

    }
}