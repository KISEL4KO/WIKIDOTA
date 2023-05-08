package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IQActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqactivity);
    }
    public void getenc(View view){
        Intent intent = new Intent(IQActivity.this ,  EnchantressActivity.class);
        startActivity(intent);
    }
}

