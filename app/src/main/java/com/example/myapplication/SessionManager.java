package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Objects;

public class SessionManager {
    static SharedPreferences sharedPreferences;
    public SessionManager(Context context)
    {
        sharedPreferences = context.getSharedPreferences("Medic", Context.MODE_PRIVATE);
    }
    public void saveFinishActivity()
    {
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString("finish_Activity", "Вы успешно завершили экран приветствия");
        editor.apply();
    }
    public boolean getFinishActivity()
    {
        String finish = sharedPreferences.getString("finish_Activity", null);
        if(Objects.equals(finish, "Вы успешно завершили экран приветствия"))
        {
            return true;
        }
        else
        {return false;}
    }
    public void saveEmail(String email)
    {
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString("email", email);
        editor.apply();
    }
    public void savePerexod(String perexod)
    {
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString("perexod", perexod);
        editor.apply();
    }
    public void saveLastName(String lastName)
    {
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString("familia", lastName);
        editor.apply();
    }
    public void saveAdres(String adress)
    {
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString("adress", adress);
        editor.apply();
    }
    public String getAdress()
    {
        return sharedPreferences.getString("adress", null);
    }
    public String getLastName()
    {
        return sharedPreferences.getString("familia", null);
    }
    public String getPerexod()
    {
        return sharedPreferences.getString("perexod", null);
    }
    public void saveToken(String token)
    {
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString("token", token);
        editor.apply();
    }
    public void saveRecord(String record)
    {
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString("record", record);
        editor.apply();
    }
    public String getRecord()
    {
        return sharedPreferences.getString("record", null);
    }
    public String getEmail()
    {
        return sharedPreferences.getString("email", null);
    }
    public void saveCode(String discription, String code)
    {
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString(discription, code);
        editor.apply();
    }
    public void savePassword( String pass)
    {
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString("password",pass);
        editor.apply();
    }
    public String getPassword()
    {
        return sharedPreferences.getString("password", null);
    }
    public String getToken()
    {
        return sharedPreferences.getString("token", null);
    }
    public String getOnlineCode()
    {
        return sharedPreferences.getString("online", null);
    }
    public String getOflineCode()
    {
        return sharedPreferences.getString("ofline", null);
    }


}
