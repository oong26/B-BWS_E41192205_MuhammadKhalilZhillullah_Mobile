package com.oong.gps_sensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnGps, btnSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGps = findViewById(R.id.btn_gps);
        btnSensor = findViewById(R.id.btn_sensor);

        btnGps.setOnClickListener(v -> {
            Intent goGps = new Intent(this, MapsActivity.class);
            startActivity(goGps);
        });

        btnSensor.setOnClickListener(v -> {
            Intent goSensor = new Intent(this, SensorActivity.class);
            startActivity(goSensor);
        });
    }
}