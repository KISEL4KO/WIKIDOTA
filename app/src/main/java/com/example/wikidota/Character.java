package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Character extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
    }

    public void  getHome2(View view){
        Intent intent = new Intent(Character.this , MainActivity.class);
        startActivity(intent);
    }
    public void getItem2(View view){
        Intent intent = new Intent(Character.this , Items.class);
        startActivity(intent);

    }
}