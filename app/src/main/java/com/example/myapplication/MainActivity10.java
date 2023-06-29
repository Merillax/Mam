package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity10 extends AppCompatActivity {
    ImageView analize;
    ImageView results;
    ImageView podderjka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        analize =findViewById(R.id.imageView);
        analize .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity10.this, MainActivity8.class);
                startActivity(intent);
            }
        });
        results=findViewById(R.id.imageView3);
        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity10.this, MainActivity9.class);
                startActivity(intent);
            }
        });
        podderjka=findViewById(R.id.imageView5);
        podderjka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity10.this, MainActivity11.class);
                startActivity(intent);
            }
        });
    }
}