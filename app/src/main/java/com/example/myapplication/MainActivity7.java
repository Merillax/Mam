package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity7 extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    String text1;
    String text2;
    String text3;
    String text4;
    Button but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Spinner spin=findViewById(R.id.spinner);
        spin.setPrompt("Пол");
        editText1=findViewById(R.id.editTextTextPersonName);
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                text1=editText1.getText().toString() ;
               text2=editText2.getText().toString() ;
                text3=editText3.getText().toString() ;
                text4=editText4.getText().toString();;
                if(!text1.equals("") & !text1.equals(null) & !text2.equals("") & !text2.equals(null) &!text3.equals("") & !text3.equals(null) &!text4.equals("") & !text4.equals(null)){
                    but1.setEnabled(true);
                    but1.setBackgroundColor(getResources().getColor(R.color.knopka2));
                }else{
                    but1.setEnabled(false);
                    but1.setBackgroundColor(getResources().getColor(R.color.knopka));
                }
            }
        });
        editText2=findViewById(R.id.editTextTextPersonName2);
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                text1=editText1.getText().toString() ;
                text2=editText2.getText().toString() ;
                text3=editText3.getText().toString() ;
                text4=editText4.getText().toString();;
                if(!text1.equals("") & !text1.equals(null) & !text2.equals("") & !text2.equals(null) &!text3.equals("") & !text3.equals(null) &!text4.equals("") & !text4.equals(null)){
                    but1.setEnabled(true);
                    but1.setBackgroundColor(getResources().getColor(R.color.knopka2));
                }else{
                    but1.setEnabled(false);
                    but1.setBackgroundColor(getResources().getColor(R.color.knopka));
                }
            }
        });
        editText3=findViewById(R.id.editTextTextPersonName3);
        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                text1=editText1.getText().toString() ;
                text2=editText2.getText().toString() ;
                text3=editText3.getText().toString() ;
                text4=editText4.getText().toString();;
                if(!text1.equals("") & !text1.equals(null) & !text2.equals("") & !text2.equals(null) &!text3.equals("") & !text3.equals(null) &!text4.equals("") & !text4.equals(null)){
                    but1.setEnabled(true);
                    but1.setBackgroundColor(getResources().getColor(R.color.knopka2));
                }else{
                    but1.setEnabled(false);
                    but1.setBackgroundColor(getResources().getColor(R.color.knopka));
                }
            }
        });
        editText4=findViewById(R.id.editTextTextPersonName4);
        editText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                text1=editText1.getText().toString() ;
                text2=editText2.getText().toString() ;
                text3=editText3.getText().toString() ;
                text4=editText4.getText().toString();;
                if(!text1.equals("") & !text1.equals(null) & !text2.equals("") & !text2.equals(null) &!text3.equals("") & !text3.equals(null) &!text4.equals("") & !text4.equals(null)){
                    but1.setEnabled(true);
                    but1.setBackgroundColor(getResources().getColor(R.color.knopka2));
                }else{
                    but1.setEnabled(false);
                    but1.setBackgroundColor(getResources().getColor(R.color.knopka));
                }
            }
        });
        but1=findViewById(R.id.button3);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this, MainActivity8.class);
                startActivity(intent);
            }
        });





    }
}