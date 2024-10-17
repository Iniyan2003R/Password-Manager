package com.example.password_manager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    private EditText usernameEditText, emailEditText, contactEditText, passwordEditText, retypePasswordEditText, captchaEditText;
    private Button registerButton, fingerprintButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        usernameEditText = findViewById(R.id.username);
        emailEditText = findViewById(R.id.email);
        contactEditText = findViewById(R.id.contact);
        passwordEditText = findViewById(R.id.password);
        retypePasswordEditText = findViewById(R.id.retypePassword);

        registerButton = findViewById(R.id.registerButton);
        fingerprintButton = findViewById(R.id.fingerprintButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Implement registration logic
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
            }
        });

        fingerprintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Implement fingerprint authentication setup logic
                // For now, it could open a new activity or show a dialog
                // startActivity(new Intent(SignUpActivity.this, FingerprintSetupActivity.class));
            }
        });
    }
}
