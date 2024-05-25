package com.example.mainactivity;

import android.annotation.SuppressLint;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.view.View;
import android.widget.Button;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class product extends AppCompatActivity {
    private List<String> selectedProducts;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        selectedProducts = new ArrayList<>();

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart1 = findViewById(R.id.button_add_to_cart_product1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart2 = findViewById(R.id.button_add_to_cart_product2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart3 = findViewById(R.id.button_add_to_cart_product3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart4 = findViewById(R.id.button_add_to_cart_product4);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart5 = findViewById(R.id.button_add_to_cart_product5);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart6 = findViewById(R.id.button_add_to_cart_product6);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart7 = findViewById(R.id.button_add_to_cart_product7);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart8 = findViewById(R.id.button_add_to_cart_product8);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart9 = findViewById(R.id.button_add_to_cart_product9);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart10 = findViewById(R.id.button_add_to_cart_product10);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart11= findViewById(R.id.button_add_to_cart_product11);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart12= findViewById(R.id.button_add_to_cart_product12);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart13= findViewById(R.id.button_add_to_cart_product13);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart14= findViewById(R.id.button_add_to_cart_product14);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonAddToCart15= findViewById(R.id.button_add_to_cart_product15);


        buttonAddToCart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for product 1 button
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Product 1");
                intent.putExtra("productPrice", "Price of Product 1");
                startActivity(intent);
            }
        });

        buttonAddToCart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for product 2 button
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Product 2");
                intent.putExtra("productPrice", "Price of Product 2");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);
            }
        });

// Similarly, handle onClick listeners for other product buttons

        buttonAddToCart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Pilot");
                intent.putExtra("productPrice", "$20.12");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);
            }
        });
        buttonAddToCart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Pilot");
                intent.putExtra("productPrice", "$20.12");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);

            }
        });
        buttonAddToCart5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Product 5");
                intent.putExtra("productPrice", "$20.12");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);
            }
        });
        buttonAddToCart6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Product 6");
                intent.putExtra("productPrice", "$20.12");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);
            }
        });
        buttonAddToCart7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Product 7");
                intent.putExtra("productPrice", "$20.12");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);
            }
        });
        buttonAddToCart8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Product 8");
                intent.putExtra("productPrice", "$20.12");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);
            }
        });
        buttonAddToCart9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Product 9");
                intent.putExtra("productPrice", "$20.12");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);
            }
        });
        buttonAddToCart10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Product 10");
                intent.putExtra("productPrice", "$20.12");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);
            }
        });
        buttonAddToCart11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Product 11");
                intent.putExtra("productPrice", "$20.12");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);
            }
        });
        buttonAddToCart12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Product 12");
                intent.putExtra("productPrice", "$20.12");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);
            }
        });
        buttonAddToCart13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Product 13");
                intent.putExtra("productPrice", "$20.12");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);
            }
        });
        buttonAddToCart14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Product 14");
                intent.putExtra("productPrice", "$20.12");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);
            }
        });
        buttonAddToCart15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(product.this, Add.class);
                intent.putExtra("productName", "Product 15");
                intent.putExtra("productPrice", "$20.12");
                Toast.makeText(getApplicationContext(), "[Product name] added to cart", Toast.LENGTH_SHORT).show();
                // Add more code here to proceed to the cart page
                startActivity(intent);
            }
        });

    }

    public void proceedToCart(View view) {
        // Proceed to the cart page and pass the list of selected products
        Intent intent = new Intent(this, Add.class);
        intent.putStringArrayListExtra("selectedProducts", (ArrayList<String>) selectedProducts);
        startActivity(intent);
    }
}

