package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
public void getCharacher(View view){
        Intent intent = new Intent(MainActivity.this ,  Character.class);
        startActivity(intent);
    }
  public void getItem(View view){

        Intent intent = new Intent(MainActivity.this ,  Items.class);
        startActivity(intent);

    }
}