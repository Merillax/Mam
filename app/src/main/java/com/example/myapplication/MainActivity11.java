package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity11 extends AppCompatActivity {
    ImageView results;
    ImageView analize;
    ImageView profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        results=findViewById(R.id.imageView3);
        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity11.this, MainActivity9.class);
                startActivity(intent);
            }
        });
        analize =findViewById(R.id.imageView);
        analize .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity11.this, MainActivity8.class);
                startActivity(intent);
            }
        });
        profile=findViewById(R.id.imageView9);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity11.this, MainActivity10.class);
                startActivity(intent);
            }
        });
    }
}