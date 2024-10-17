package com.example.password_manager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private EditText nameEditText, emailEditText, contactEditText, passwordEditText;
    private Button updatePasswordButton, deleteAccountButton, logoutButton;
    private ImageButton fingerprintButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile); // Ensure this matches your layout file name

        // Initialize UI components
        nameEditText = findViewById(R.id.name);
        emailEditText = findViewById(R.id.email);
        contactEditText = findViewById(R.id.contact);
        passwordEditText = findViewById(R.id.password);
        updatePasswordButton = findViewById(R.id.updatePasswordButton);
        deleteAccountButton = findViewById(R.id.deleteAccountButton);
        logoutButton = findViewById(R.id.logoutButton);
        fingerprintButton = findViewById(R.id.fingerprintButton);

        // Set up listeners
        updatePasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle password update logic
                String newPassword = passwordEditText.getText().toString();
                if (newPassword.isEmpty()) {
                    Toast.makeText(ProfileActivity.this, "Please enter a password", Toast.LENGTH_SHORT).show();
                } else {
                    // TODO: Implement password update logic here
                    Toast.makeText(ProfileActivity.this, "Password updated", Toast.LENGTH_SHORT).show();
                }
            }
        });

        deleteAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle account deletion logic
                // TODO: Implement delete account logic here
                Toast.makeText(ProfileActivity.this, "Account deleted", Toast.LENGTH_SHORT).show();
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle logout logic
                // TODO: Implement logout logic here
                Toast.makeText(ProfileActivity.this, "Logged out", Toast.LENGTH_SHORT).show();
            }
        });

        fingerprintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle fingerprint update logic
                // TODO: Implement fingerprint update logic here
                Toast.makeText(ProfileActivity.this, "Fingerprint updated", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
