package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Items extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
    }

    public void getCharacher1(View view) {
        Intent intent = new Intent(Items.this, Character.class);
        startActivity(intent);
    }

    public void getHome1(View view) {
        Intent intent = new Intent(Items.this , MainActivity.class);
        startActivity(intent);
    }
}

