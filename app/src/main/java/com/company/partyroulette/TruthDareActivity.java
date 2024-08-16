package com.company.partyroulette;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class TruthDareActivity extends AppCompatActivity {

    private Button buttonTruth;
    private ImageView imageViewTruth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truth_dare);

        buttonTruth = findViewById(R.id.buttonTruth);
        imageViewTruth = findViewById(R.id.imageViewTruth);

        buttonTruth.setOnClickListener(new View.OnClickListener() {
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
                imageViewTruth.setRotation(floatRandomRotation);

            }
        };

        Handler handler = new Handler(Looper.getMainLooper());
        for(int i = 0; i < 20; i++) {
            handler.postDelayed(runnable, i*100);
        }

    }
}