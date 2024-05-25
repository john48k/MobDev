package com.example.mainactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class Browser extends AppCompatActivity {



    private EditText searchEditText;
    private Button searchButton;
    private ListView productsListView;
    private ArrayAdapter<String> adapter;
    private List<String> productList;

    // Define your product names and prices here
    private String[] productNames = {"Product 1", "Product 2", "Product 3", "Product 4", "Product 5"};
    private String[] productPrices = {"$50", "$60", "$70", "$80", "$90"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        searchEditText = findViewById(R.id.searchEditText);
        searchButton = findViewById(R.id.searchButton);
        productsListView = findViewById(R.id.productsListView);

        // Initialize product list
        productList = new ArrayList<>();

        // Add product names to the list
        for (String productName : productNames) {
            productList.add(productName);
        }

        // Initialize adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, productList);

        // Set adapter to ListView
        productsListView.setAdapter(adapter);

        // Set onClickListener for searchButton
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchProduct();
            }
        });

        // Set onClickListener for ListView items
        productsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedProduct = productList.get(position);
                Toast.makeText(Browser.this, "Selected product: " + selectedProduct, Toast.LENGTH_SHORT).show();
                // Add your logic to handle item click, like opening a product detail page
            }
        });
    }

    private void searchProduct() {
        String query = searchEditText.getText().toString().trim();
        // Perform search logic here, e.g., filtering the product list based on the query
        // For demonstration purposes, let's just add the query to the list
        productList.add(query);
        adapter.notifyDataSetChanged(); // Notify the adapter of the change in data
    }
}
