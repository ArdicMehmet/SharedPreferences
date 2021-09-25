package com.ardic.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //OLUŞTURMA
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.ardic.sharedpreferences",MODE_PRIVATE);

        //VERİ EKLEME
        sharedPreferences.edit().putString("name","Mehmet").apply();
        sharedPreferences.edit().putInt("age",25).apply();
        sharedPreferences.edit().putString("job","Computer Engineer").apply();

        //VERİ SİLME
        sharedPreferences.edit().remove("age").apply();

        //VERİ ÇAĞIRMA

        SharedPreferences sharedPreferences1= this.getSharedPreferences("com.ardic.sharedpreferences",MODE_PRIVATE);
        String isim =sharedPreferences1.getString("name","Veri Bulunamadı");
        String surname = sharedPreferences1.getString("surname", "Veri Bulunamadı");
        System.out.println("name : "+isim);
        System.out.println("surname : "+surname);















    }
}