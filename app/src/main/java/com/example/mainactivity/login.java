package com.example.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Reference the EditText fields and the submit button
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Button submit = findViewById(R.id.submit);

        // Set click listener for the submit button
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(login.this, "Error: Both fields must be filled", Toast.LENGTH_SHORT).show();
                } else {
                    // Navigate to the product page
                    Intent intent = new Intent(login.this, product.class);
                    startActivity(intent);
                }
            }
        });
    }
}



