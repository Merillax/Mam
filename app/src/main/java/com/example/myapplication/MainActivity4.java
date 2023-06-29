package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity4 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button but1 = findViewById(R.id.button2);
        EditText edit = findViewById(R.id.editTextTextEmailAddress2);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code();
            }
        });
        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String email=edit.getText().toString();
                if (email.contains("@") & email.contains(".")){
                    but1.setBackgroundColor(getResources().getColor(R.color.knopka2));
                    but1.setEnabled(true);
                }else{
                    but1.setBackgroundColor(getResources().getColor(R.color.knopka));
                    but1.setEnabled(false);
                }
            }
        });
    }
    public void code()
    {
        EditText edit = findViewById(R.id.editTextTextEmailAddress2);
        SessionManager sessionManager = new SessionManager(this);
        String emаil = edit.getText().toString();
        sessionManager.saveEmail(emаil);
        ApiClient apiClient = new ApiClient();
        apiClient.getApiService(this).sendCode(emаil)
                .enqueue(new Callback<SendCodeResponse>() {
                    @Override
                    public void onResponse(Call<SendCodeResponse> call, Response<SendCodeResponse> response) {
                        if(!response.isSuccessful())
                        {
                            Random random=new Random();
                            int code=random.nextInt(8999)+1000;
                            sessionManager.saveCode("ofline",String.valueOf(code));
                            Toast toast=Toast.makeText(MainActivity4.this, "Ошибка", Toast.LENGTH_LONG);
                            Log.i("Check code",String.valueOf(code));

                            Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
                            startActivity(intent);
                            return;
                        }
                        Random random=new Random();
                        int code=random.nextInt(8999)+1000;
                        sessionManager.saveCode("ofline",String.valueOf(code));
                        Toast toast=Toast.makeText(MainActivity4.this, "Ошибка", Toast.LENGTH_LONG);
                        Log.i("Check code",String.valueOf(code));

                        Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
                        startActivity(intent);
                        return;
                    }

                    @Override
                    public void onFailure(Call<SendCodeResponse> call, Throwable t) {
                        Random random=new Random();
                        int code=random.nextInt(8999)+1000;
                        sessionManager.saveCode("ofline",String.valueOf(code));
                        Toast toast=Toast.makeText(MainActivity4.this, "Ошибка", Toast.LENGTH_LONG);
                        Log.i("Check code",String.valueOf(code));
                        toast.show();
                        Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
                        startActivity(intent);
                    }
                });
    }
}


