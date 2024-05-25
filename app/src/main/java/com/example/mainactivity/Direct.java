package com.example.mainactivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Direct extends AppCompatActivity {

    EditText messageInput;
    Button sendButton;
    TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direct);

        // Initialize views
        messageInput = findViewById(R.id.message_input);
        sendButton = findViewById(R.id.send_button);
        textViewMessage = findViewById(R.id.text_view_message);

        // Set click listener for the send button
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });
    }

    // Method to handle sending the message
    private void sendMessage() {
        // Get the message from the EditText
        String message = messageInput.getText().toString().trim();

        // Display the message in the TextView
        if (!message.isEmpty()) {
            textViewMessage.setText(message);
            messageInput.getText().clear(); // Clear the EditText
        }
    }
}
