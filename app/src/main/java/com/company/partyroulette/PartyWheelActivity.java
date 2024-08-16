package com.company.partyroulette;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class PartyWheelActivity extends AppCompatActivity {

    private ImageView imageViewParty;
    private TextView textViewParty;
    private Button buttonParty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party_wheel);

        imageViewParty = findViewById(R.id.imageViewParty);
        textViewParty = findViewById(R.id.textViewParty);
        buttonParty = findViewById(R.id.buttonParty);

        buttonParty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinPartyWheel();
            }
        });

    }

    public void spinPartyWheel() {
        // Implement the logic to spin the party wheel here

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                float floatRandomRotation= new Random().nextFloat() * 360;
                imageViewParty.setRotation(floatRandomRotation);

            }
        };

        Handler handler = new Handler(Looper.getMainLooper());
        for(int i = 0; i < 20; i++) {
            handler.postDelayed(runnable, i*100);
        }

    }
}