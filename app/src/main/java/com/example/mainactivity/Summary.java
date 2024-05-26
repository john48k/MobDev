package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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

        // Retrieve the selected products and prices passed from the cart page
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("selectedProducts") && extras.containsKey("selectedPrices")) {
            // Get the list of selected products and prices
            ArrayList<String> selectedProducts = extras.getStringArrayList("selectedProducts");
            ArrayList<Double> selectedPrices = (ArrayList<Double>) extras.getSerializable("selectedPrices");

            if (selectedProducts != null && selectedPrices != null && selectedProducts.size() == selectedPrices.size()) {
                // Display selected products and prices in the summary layout
                displaySummary(selectedProducts, selectedPrices);
            }
        }
    }

    // Method to display selected products and prices in the summary layout
    private void displaySummary(ArrayList<String> selectedProducts, ArrayList<Double> selectedPrices) {
        // Initialize total price
        double totalPrice = 0.00;

        // Iterate through the list of selected products and prices
        for (int i = 0; i < selectedProducts.size(); i++) {
            String product = selectedProducts.get(i);
            double productPrice = selectedPrices.get(i);

            // Add the product to the summary layout
            addToSummary(product, productPrice);

            // Update the total price
            totalPrice += productPrice;
        }
//  updated na
        // Display the total price
        textTotalPrice.setText(String.format("$%.2f", totalPrice));
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
