package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Add extends AppCompatActivity {

    LinearLayout cartItemsLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        // Initialize cartItemsLayout
        cartItemsLayout = findViewById(R.id.cart_items_layout);

        // Retrieve the product details passed from the product page
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // Get product details from extras
            String productName = extras.getString("productName");
            String productPrice = extras.getString("productPrice");

            // Add the product to the cart
            addToCart(productName, productPrice);
        }

        // Initialize buttonOrderMore and set onClickListener
        Button buttonOrderMore = findViewById(R.id.button_order_more);
        buttonOrderMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go back to the product page
                Intent intent = new Intent(Add.this, product.class);
                startActivity(intent);
            }
        });

        // Initialize buttonSummary and set onClickListener
        Button buttonSummary = findViewById(R.id.button_summary);
        buttonSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Proceed to summary of order
                Intent intent = new Intent(Add.this, Order.class);
                startActivity(intent);
            }
        });
    }

    // Method to add item to the cart and update the cart page layout
    private void addToCart(final String productName, String productPrice) {
        // Create a new LinearLayout to hold the item details and remove button
        LinearLayout itemLayout = new LinearLayout(this);
        itemLayout.setOrientation(LinearLayout.HORIZONTAL);

        // Create a new TextView to display the product details
        TextView textView = new TextView(this);
        textView.setText(productName + " - " + productPrice);
        textView.setTextSize(16);
        textView.setPadding(0, 8, 0, 8);

        // Create a new Button to remove the item from the cart
        Button removeButton = new Button(this);
        removeButton.setText("Remove");
        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Remove the item from the cart
                cartItemsLayout.removeView(itemLayout);
            }
        });

        // Add the TextView and Button to the itemLayout
        itemLayout.addView(textView);
        itemLayout.addView(removeButton);

        // Add the itemLayout to the cart items layout
        cartItemsLayout.addView(itemLayout);
    }
}
