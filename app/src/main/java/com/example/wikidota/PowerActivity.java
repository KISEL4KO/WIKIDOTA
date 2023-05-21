package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class PowerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);
    }

    public void getalchemist(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "alchemist");
        startActivity(intent);
        Log.i("poweractivity","good");
    }

    public void getaxe(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "axe");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getbristleback(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "bristleback");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getcentaurwarrunner(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "centaur_warrunner");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getchaosknight(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "chaos_knight");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getdawnbreaker(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "dawnbreaker");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getdoom(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "doom");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getdragonknight(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "dragon_knight");
        startActivity(intent);
        Log.i("poweractivity","good");



    } public void getearthshaker(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "earthshaker");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getearthspirit(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "earth_spirit");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gethuskar(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "huskar");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getkunkka(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "kunkka");
        startActivity(intent);
        Log.i("poweractivity","good");

    }
    public void getlegioncommander(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "legion_commander");
        startActivity(intent);
        Log.i("poweractivity","good");

    }
    public void getlifestealer(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "lifestealer");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getmars(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "mars");
        startActivity(intent);
        Log.i("poweractivity","good");

    }

     public void getnightstalker(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
         intent.putExtra("name", "night_stalker");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getogremagi(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "ogre_magi");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getomniknight(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "omniknight");
        startActivity(intent);
        Log.i("poweractivity","good");
    }

     public void getprimalbeast(View view) {
         Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
         intent.putExtra("name", "primal_beast");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getpudge(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "pudge");
        startActivity(intent);
        Log.i("poweractivity","good");

    }
    public void getslardar(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "slardar");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getspiritbreaker(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "spirit_breaker");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getsven(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "sven");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gettidehunter(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "tidehunter");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gettiny(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "tiny");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gettreantprotector(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "treant_protector");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gettusk(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "tusk");
        startActivity(intent);
        Log.i("poweractivity","good");


    }
    public void getunderlord(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "underlord");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getundying(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "undying");
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getwraithking(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "wraith_king");
        startActivity(intent);
        Log.i("poweractivity","good");
    }
    public void geteldertitan(View view) {
        Intent intent = new Intent(PowerActivity.this, HeroActivity.class);
        intent.putExtra("name", "elder_titan");
        startActivity(intent);
        Log.i("poweractivity","good");
    }

    public void getCharacher(View view) {
        Intent intent = new Intent(PowerActivity.this, Character.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    public void getItem(View view) {
        Intent intent = new Intent(PowerActivity.this, Items.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    public void getHome(View view) {
        Intent intent = new Intent(PowerActivity.this , MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}



























