package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.wikidota.R;

public class HeroActivity extends AppCompatActivity {
    public ImageView img;
    public String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);
        Bundle bundleIntent = getIntent().getExtras();
        img = findViewById(R.id.image);
        name = bundleIntent.get("name").toString();
        img.setImageResource(getResources().getIdentifier(name, "drawable", getPackageName()));
    }
}