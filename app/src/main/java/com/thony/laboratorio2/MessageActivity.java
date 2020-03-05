package com.thony.laboratorio2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MessageActivity extends AppCompatActivity  {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_message);

            Intent intent = getIntent();
            String message = intent.getStringExtra("MESSAGE");

            TextView textView = findViewById(R.id.display_message);
            textView.setText(message);

        }
}
