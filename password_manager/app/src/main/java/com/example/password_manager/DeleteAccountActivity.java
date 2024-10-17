package com.example.password_manager;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DeleteAccountActivity extends AppCompatActivity {

    private EditText passwordEditText, captchaEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_account);

        passwordEditText = findViewById(R.id.password);
        captchaEditText = findViewById(R.id.captcha);

        // TODO: Implement account deletion logic
    }
}
