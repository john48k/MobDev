package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Summary extends AppCompatActivity {

    LinearLayout summaryItemsLayout;
    TextView textTotalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // Initialize summaryItemsLayout
        summaryItemsLayout = findViewById(R.id.summary_items_layout);

        // Initialize textTotalPrice
        textTotalPrice = findViewById(R.id.text_total_price);

        // Retrieve the selected products passed from the cart page
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("selectedProducts")) {
            // Get the list of selected products
            ArrayList<String> selectedProducts = extras.getStringArrayList("selectedProducts");
            if (selectedProducts != null) {
                // Display selected products in the summary layout
                displaySummary(selectedProducts);
            }
        }
    }

    // Method to display selected products in the summary layout
    private void displaySummary(ArrayList<String> selectedProducts) {
        // Initialize total price
        double totalPrice = 0.00;

        // Iterate through the list of selected products
        for (String product : selectedProducts) {
            // For demonstration purposes, let's assume all products have the same price
            double productPrice = 20.12; // Change this value according to your actual product prices

            // Add the product to the summary layout
            addToSummary(product, productPrice);

            // Update the total price
            totalPrice += productPrice;
        }

        // Display the total price
        textTotalPrice.setText(String.format("%.2f", totalPrice));
    }

    // Method to add item to the summary layout
    private void addToSummary(String productName, double productPrice) {
        // Create a new TextView to display the product details
        TextView textView = new TextView(this);
        textView.setText(productName + " - $" + String.format("%.2f", productPrice));
        textView.setTextSize(16);
        textView.setPadding(0, 8, 0, 8);

        // Add the TextView to the summaryItemsLayout
        summaryItemsLayout.addView(textView);
    }
}
