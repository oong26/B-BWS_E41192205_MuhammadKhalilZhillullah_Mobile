package com.oong.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class RelativeLayoutActivity extends AppCompatActivity {

    EditText reminderName;
    Spinner date, time;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        reminderName = findViewById(R.id.name);
        date = findViewById(R.id.dates);
        time = findViewById(R.id.times);
        submit = findViewById(R.id.submit);

        // date
        ArrayAdapter<CharSequence> adapterDate = ArrayAdapter.createFromResource(this,
                R.array.date_array, android.R.layout.simple_spinner_item);
        adapterDate.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        date.setAdapter(adapterDate);
        // time
        ArrayAdapter<CharSequence> adapterTime = ArrayAdapter.createFromResource(this,
                R.array.time_array, android.R.layout.simple_spinner_item);
        adapterTime.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        time.setAdapter(adapterTime);

    }
}