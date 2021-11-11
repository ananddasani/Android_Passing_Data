package com.example.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button passData;
    EditText fetchMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passData = findViewById(R.id.passButton);
        fetchMessage = findViewById(R.id.fetchMessage);

        passData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                String message = fetchMessage.getText().toString();
                intent.putExtra("KEY", message);

                startActivity(intent);
            }
        });
    }
}