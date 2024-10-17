package com.example.password_manager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HelpActivity extends AppCompatActivity {

    private TextView answer1, answer2, answer3, supportInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        // Initialize the question and answer TextViews
        TextView question1 = findViewById(R.id.question1);
        answer1 = findViewById(R.id.answer1);
        TextView question2 = findViewById(R.id.question2);
        answer2 = findViewById(R.id.answer2);
        TextView question3 = findViewById(R.id.question3);
        answer3 = findViewById(R.id.answer3);
        supportInfo = findViewById(R.id.supportInfo);

        // Set up click listeners for the questions
        question1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(answer1);
            }
        });

        question2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(answer2);
            }
        });

        question3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(answer3);
            }
        });

        // Set up button click listeners
        Button contactSupportButton = findViewById(R.id.contactSupportButton);
        contactSupportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleVisibility(supportInfo);
            }
        });

        Button viewFAQsButton = findViewById(R.id.viewFAQsButton);
        viewFAQsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initially hide questions
                question1.setVisibility(View.VISIBLE);
                question2.setVisibility(View.VISIBLE);
                question3.setVisibility(View.VISIBLE);
            }
        });
    }

    // Method to toggle visibility of individual answers or support info
    private void toggleVisibility(TextView view) {
        if (view.getVisibility() == View.GONE) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.GONE);
        }
    }
}
