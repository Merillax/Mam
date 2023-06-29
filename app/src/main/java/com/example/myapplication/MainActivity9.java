package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity9 extends AppCompatActivity {
    ImageView analize;
    ImageView profile;
    ImageView podderjka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        analize =findViewById(R.id.imageView);
        analize .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity9.this, MainActivity8.class);
                startActivity(intent);
            }
        });
        profile=findViewById(R.id.imageView9);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity9.this, MainActivity10.class);
                startActivity(intent);
            }
        });
        podderjka=findViewById(R.id.imageView5);
        podderjka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity9.this, MainActivity11.class);
                startActivity(intent);
            }
        });
    }
}