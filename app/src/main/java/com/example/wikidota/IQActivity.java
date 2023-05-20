package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.wikidota.HeroActivity;

/**
 * @KISEL4KO
 * */

public class IQActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqactivity);
    }
    /**
     * Навешивание метода перехода на активность слушателем персонажем
     * */
    public void getenc(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "enchantress");
        startActivity(intent);
        Log.i("iqactivity","good");

    }


    public void getgrimstroke(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "grimstroke");
        startActivity(intent);
        Log.i("iqactivity","good");
    }

    public void getapparat(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "ancient_apparation");
        startActivity(intent);
        Log.i("iqactivity","good");
    }

    public void getdeathpropet(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "death_prophet");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getinvoker(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "invoker");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getjakiro(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "jakiro");
        startActivity(intent);
        Log.i("iqactivity","good");

    }
    public void getkeeper(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "keeper_of_the_light");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getwarlock(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "warlock");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getlich(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "lich");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getlina(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "lina");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getleon(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "lion");
        startActivity(intent);
        Log.i("iqactivity","good");

    }
    public void getmuerta(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "muerta");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getnaturestro(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "natures_prophet");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getnecrophos(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "necrophos");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getoracle(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "oracle");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getoutworld(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "outworld_destroyer");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getpuck(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "puck");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getqueenofpain(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "queen_of_pain");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getrubick(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "rubick");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getshadowdemon(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "shadow_demon");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getdisruptor(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "disruptor");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void gettinker(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "tinker");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getpetuhsara(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "skywrath_mage");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getstromspirit(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "storm_spirit");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getwithdoctor(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "witch_doctor");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getzeus(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "zeus");
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getleshark(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "leshrac");
        startActivity(intent);
        Log.i("iqactivity","good");
    }

    public void getshadowshaman(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "shadow_shaman");
        startActivity(intent);
        Log.i("iqactivity", "good");
    }

    public void getsilencer(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "silencer");
        startActivity(intent);
        Log.i("iqactivity", "good");

    }

    public void getpugna(View view) {
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "pugna");
        startActivity(intent);
        Log.i("iqactivity", "good");

    }
    public void getcrystal(View view){
        Intent intent = new Intent(IQActivity.this, HeroActivity.class);
        intent.putExtra("name", "crystal_maiden");
        startActivity(intent);
        Log.i("iqactivity","good");

    }

}
