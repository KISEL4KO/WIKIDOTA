package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.wikidota.HeroActivity;

public class PowerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);
    }

    public void getalchemist(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "alchemist");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");
    }

    public void getaxe(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "axe");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getbristleback(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "bristleback");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getcentaurwarrunner(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "centaur_warrunner");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getchaosknight(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "chaos_knight");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getdawnbreaker(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "dawnbreaker");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getdoom(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "doom");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getdragonknight(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "dragon_knight");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");



    } public void getearthshaker(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "earthshaker");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getearthspirit(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "earth_spirit");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gethuskar(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "huskar");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getkunkka(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "kunkka");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    }
    public void getlegioncommander(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "legion_commander");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    }
    public void getlifestealer(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "lifestealer");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getmars(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "mars");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    }

     public void getnightstalker(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
         intent.putExtra("name", "night_stalker");
         intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getogremagi(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "ogre_magi");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getomniknight(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "omniknight");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");
    }

     public void getprimalbeast(View view) {
         Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
         intent.putExtra("name", "primal_beast");
         intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getpudge(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "pudge");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    }
    public void getslardar(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "slardar");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getspiritbreaker(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "spirit_breaker");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getsven(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "sven");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gettidehunter(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "tidehunter");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gettiny(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "tiny");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gettreantprotector(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "treant_protector");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gettusk(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "tusk");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");


    }
    public void getunderlord(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "underlord");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getundying(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "undying");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getwraithking(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "wraith_king");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");
    }
    public void geteldertitan(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "elder_titan");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        Log.i("poweractivity","good");
    }
}



























