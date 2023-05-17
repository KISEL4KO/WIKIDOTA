package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.wikidota.HeroActivity;

/**
 * @KISEL4KO
 * */


public class SpeedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
    }
    /**
     * переход на активности героев
     * */
    public void getantimage(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "antimage");
        startActivity(intent);

    }
    public void getarcwarden(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "arcwarden");
        startActivity(intent);

    }public void getbloodseeker(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "bloodseeker");
        startActivity(intent);

    }public void getbountyhunter(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "bountyhunter");
        startActivity(intent);

    }public void getclinkz (View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "clinkz");
        startActivity(intent);

    }public void getdrowranger(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "drowranger");
        startActivity(intent);

    }public void getemberspirit(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "emberspirit");
        startActivity(intent);

    }public void getfaclessvoid(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "facelessvoid");
        startActivity(intent);

    }public void getgyrocopter(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "gyrocopter");
        startActivity(intent);

    }public void gethoodwink(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "hoodwink");
        startActivity(intent);

    }public void gerjuggernaut(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "juggernaut");
        startActivity(intent);

    }public void getluna(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "luna");
        startActivity(intent);

    }public void getmedusa(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "medusa");
        startActivity(intent);

    }public void getmeepo(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "meepo");
        startActivity(intent);

    }public void getmonkeyking(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "monkeyking");
        startActivity(intent);

    }public void getmorphling(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "morphling");
        startActivity(intent);

    }public void getnagasiren(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "nagasiren");
        startActivity(intent);

    }public void getphatomassasin(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "phantomassasin");
        startActivity(intent);

    }

    public void getrazor(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "razor");
        startActivity(intent);

    }public void getriki(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "riki");
        startActivity(intent);
    }

    public void getphatomlancer(View view) {
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "phantomlancer");
        startActivity(intent);
    }
    public void getshadowfiend(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "shadowfiend");
        startActivity(intent);

    }public void getslark(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "slark");
        startActivity(intent);

    }public void getsniper(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "sniper");
        startActivity(intent);

    }public void getspectre(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "spectre");
        startActivity(intent);

    }public void gettemplarassasin(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "templarassasin");
        startActivity(intent);

    }public void getterrorblade(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "terrorblade");
        startActivity(intent);

    }public void gettrollwarlord(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "trollwarlord");
        startActivity(intent);

    }public void getursa(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "ursa");
        startActivity(intent);

    }public void getviper(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "viper");
        startActivity(intent);

    }public void getweaver(View view){
        Intent intent = new Intent(SpeedActivity.this, HeroActivity.class);
        intent.putExtra("name", "weaver");
        startActivity(intent);

    }



}
