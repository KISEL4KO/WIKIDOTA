package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.wikidota.character.iq.EnchantressActivity;
import com.example.wikidota.character.power.AlchemistActivity;
import com.example.wikidota.character.power.AxeActivity;
import com.example.wikidota.character.power.BristlebackActivity;
import com.example.wikidota.character.power.CentaurWarrunnerActivity;
import com.example.wikidota.character.power.ChaosKnightActivity;
import com.example.wikidota.character.power.DawnbreakerActivity;
import com.example.wikidota.character.power.DoomActivity;
import com.example.wikidota.character.power.DragonKnightActivity;
import com.example.wikidota.character.power.EarthSpiritActivity;
import com.example.wikidota.character.power.EarthsheakerActivity;
import com.example.wikidota.character.power.ElderTitanActivity;
import com.example.wikidota.character.power.HuskarActivity;
import com.example.wikidota.character.power.KunkkaActivity;
import com.example.wikidota.character.power.LegionCommanderActivity;
import com.example.wikidota.character.power.LifestealerActivity;
import com.example.wikidota.character.power.MarsActivity;
import com.example.wikidota.character.power.NightStalkerActivity;
import com.example.wikidota.character.power.OgreMagiActivity;
import com.example.wikidota.character.power.OmniknightActivity;
import com.example.wikidota.character.power.PrimalBeastActivity;
import com.example.wikidota.character.power.PudgeActivity;
import com.example.wikidota.character.power.SlardarActivity;
import com.example.wikidota.character.power.SpiritBreakerActivity;
import com.example.wikidota.character.power.SvenActivity;
import com.example.wikidota.character.power.TideHunterActivity;
import com.example.wikidota.character.power.TinyActivity;
import com.example.wikidota.character.power.TreantProtectorActivity;
import com.example.wikidota.character.power.TuskActivity;
import com.example.wikidota.character.power.UnderLordActivity;
import com.example.wikidota.character.power.UndyingActivity;
import com.example.wikidota.character.power.WraithKingActivity;

public class PowerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);
    }

    public void getalchemist(View view) {
        Intent intent = new Intent(PowerActivity.this, AlchemistActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    }
    public void getaxe(View view) {
        Intent intent = new Intent(PowerActivity.this, AxeActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getbristleback(View view) {
        Intent intent = new Intent(PowerActivity.this, BristlebackActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getcentaurwarrunner(View view) {
        Intent intent = new Intent(PowerActivity.this, CentaurWarrunnerActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getchaosknight(View view) {
        Intent intent = new Intent(PowerActivity.this, ChaosKnightActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getdawnbreaker(View view) {
        Intent intent = new Intent(PowerActivity.this, DawnbreakerActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getdoom(View view) {
        Intent intent = new Intent(PowerActivity.this, DoomActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getdragonknight(View view) {
        Intent intent = new Intent(PowerActivity.this, DragonKnightActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");



    } public void getearthshaker(View view) {
        Intent intent = new Intent(PowerActivity.this, EarthsheakerActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getearthspirit(View view) {
        Intent intent = new Intent(PowerActivity.this, EarthSpiritActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gethuskar(View view) {
        Intent intent = new Intent(PowerActivity.this, HuskarActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getkunkka(View view) {
        Intent intent = new Intent(PowerActivity.this, KunkkaActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    }
    public void getlegioncommander(View view) {
        Intent intent = new Intent(PowerActivity.this, LegionCommanderActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    }
    public void getlifestealer(View view) {
        Intent intent = new Intent(PowerActivity.this, LifestealerActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getmars(View view) {
        Intent intent = new Intent(PowerActivity.this, MarsActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    }

     public void getnightstalker(View view) {
        Intent intent = new Intent(PowerActivity.this, NightStalkerActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getogremagi(View view) {
        Intent intent = new Intent(PowerActivity.this, OgreMagiActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getomniknight(View view) {
        Intent intent = new Intent(PowerActivity.this, OmniknightActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");


    }

     public void getprimalbeast(View view) {
        Intent intent = new Intent(PowerActivity.this, PrimalBeastActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getpudge(View view) {
        Intent intent = new Intent(PowerActivity.this, PudgeActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    }
    public void getslardar(View view) {
        Intent intent = new Intent(PowerActivity.this, SlardarActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getspiritbreaker(View view) {
        Intent intent = new Intent(PowerActivity.this, SpiritBreakerActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getsven(View view) {
        Intent intent = new Intent(PowerActivity.this, SvenActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gettidehunter(View view) {
        Intent intent = new Intent(PowerActivity.this, TideHunterActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gettiny(View view) {
        Intent intent = new Intent(PowerActivity.this, TinyActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gettreantprotector(View view) {
        Intent intent = new Intent(PowerActivity.this, TreantProtectorActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void gettusk(View view) {
        Intent intent = new Intent(PowerActivity.this, TuskActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");


    }
    public void getunderlord(View view) {
        Intent intent = new Intent(PowerActivity.this, UnderLordActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getundying(View view) {
        Intent intent = new Intent(PowerActivity.this, UndyingActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    } public void getwraithking(View view) {
        Intent intent = new Intent(PowerActivity.this, WraithKingActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");


    }
    public void geteldertitan(View view) {
        Intent intent = new Intent(PowerActivity.this, ElderTitanActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");

    }
}



























