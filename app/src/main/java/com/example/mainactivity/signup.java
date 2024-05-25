package com.example.mainactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Get references to the form fields
        EditText emailField = findViewById(R.id.email);
        EditText passwordField = findViewById(R.id.password);
        EditText confirmPasswordField = findViewById(R.id.confirm_password);

        // Get reference to the sign-up button
        Button signUpButton = findViewById(R.id.signup_button);

        // Set an OnClickListener for the sign-up button
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered email and password
                String email = emailField.getText().toString();
                String password = passwordField.getText().toString();
                String confirmPassword = confirmPasswordField.getText().toString();

                // Check if the passwords match
                if (password.equals(confirmPassword)) {
                    // Display a toast message with the entered email and password
                    Toast.makeText(signup.this, "Email: " + email + "\nPassword: " + password, Toast.LENGTH_SHORT).show();
                } else {
                    // Display an error message if the passwords don't match
                    Toast.makeText(signup.this, "Error: Passwords do not match", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}