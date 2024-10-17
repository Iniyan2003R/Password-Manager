package com.example.password_manager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton; // Import ImageButton

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button profileButton, savedPasswordsButton, securityTipsButton, helpButton;
    private ImageButton fingerprintButton; // Declare ImageButton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        profileButton = findViewById(R.id.profileButton);
        savedPasswordsButton = findViewById(R.id.savedPasswordsButton);
        fingerprintButton = findViewById(R.id.fingerprintButton); // Find ImageButton
        securityTipsButton = findViewById(R.id.securityTipsButton);
        helpButton = findViewById(R.id.helpButton);

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
            }
        });

        savedPasswordsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, SavedPasswordsActivity.class));
            }
        });

        fingerprintButton.setOnClickListener(new View.OnClickListener() { // Handle ImageButton click
            @Override
            public void onClick(View v) {
                // Placeholder for update fingerprint functionality
            }
        });

        securityTipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, SecurityTipsActivity.class));
            }
        });

        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, HelpActivity.class));
            }
        });
    }
}
