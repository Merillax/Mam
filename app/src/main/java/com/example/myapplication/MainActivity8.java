package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity8 extends AppCompatActivity {
    ImageView results;
    ImageView profile;
    ImageView podderjka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        results=findViewById(R.id.imageView3);
        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity8.this, MainActivity9.class);
                startActivity(intent);
            }
        });
        profile=findViewById(R.id.imageView9);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                startActivity(intent);
            }
        });
        podderjka=findViewById(R.id.imageView5);
        podderjka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity8.this, MainActivity11.class);
                startActivity(intent);
            }
        });
    }

}