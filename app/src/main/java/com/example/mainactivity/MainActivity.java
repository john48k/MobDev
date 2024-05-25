package com.example.mainactivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8;

//    ConstraintLayout b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btnSignUp);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, signup.class);
                startActivity(intent1);
            }
        });

        b2 = findViewById(R.id.btnLogin);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, login.class);
                startActivity(intent1);
            }
        });

        b3 = findViewById(R.id.btnprofile);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, ProfilePage.class);
                startActivity(intent3);
            }
        });


        b4 = findViewById(R.id.btnBrowser);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, Browser.class);
                startActivity(intent4);
            }
        });
        b5 = findViewById(R.id.btnMessage);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, Direct.class);
                startActivity(intent5);
            }
        });

        b6 = findViewById(R.id.btnProduct);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(MainActivity.this, product.class);
                startActivity(intent6);
            }
        });

        b7 = findViewById(R.id.btnAdd);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(MainActivity.this, Add.class);
                startActivity(intent7);
            }
        });


        b8 = findViewById(R.id.btnOrder);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(MainActivity.this, Order.class);
                startActivity(intent8);
            }
        });
    }
}
