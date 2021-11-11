package com.example.passingdata;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //get the activity that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra("KEY");

        textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}