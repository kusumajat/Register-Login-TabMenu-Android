package com.example.optionsmenu;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView usernameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Initialize the TextView
        usernameTextView = findViewById(R.id.username_display);

        // Get the Intent that started this activity and extract the username
        String username = getIntent().getStringExtra("USERNAME");

        // Display the username in the TextView
        if (username != null) {
            usernameTextView.setText("Welcome, " + username + "!");
        } else {
            usernameTextView.setText("Selamat datang! Silahkan Login terlebih dahulu.");
        }
    }
}
