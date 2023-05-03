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
    public void getPower(View view){
        Intent intent = new Intent(Character.this , PowerActivity.class);
        startActivity(intent);
    }
    public void getSpeed(View view){

        Intent intent = new Intent(Character.this , SpeedActivity.class);
        startActivity(intent);
    }
    public void getIQ(View view){
        Intent intent = new Intent(Character.this , IQActivity.class);
        startActivity(intent);
    }
    public void getMobile(View view){
        Intent intent = new Intent(Character.this , MobileActivity.class);
        startActivity(intent);

    }
}