package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.wikidota.character.mobile.AbaddonActivity;
import com.example.wikidota.character.mobile.BaneActivity;
import com.example.wikidota.character.mobile.BatriderActivity;
import com.example.wikidota.character.mobile.BeastmasterActivity;
import com.example.wikidota.character.mobile.BrewmasterActivity;
import com.example.wikidota.character.mobile.BroodMotherActivity;
import com.example.wikidota.character.mobile.ChenActivity;
import com.example.wikidota.character.mobile.ClockwerkActivity;
import com.example.wikidota.character.mobile.DarkseerActivity;
import com.example.wikidota.character.mobile.DarkwillowActivity;
import com.example.wikidota.character.mobile.DazzleActivity;
import com.example.wikidota.character.mobile.EnigmaActivity;
import com.example.wikidota.character.mobile.LonedruidActivity;
import com.example.wikidota.character.mobile.LycanActivity;
import com.example.wikidota.character.mobile.MagusActivity;
import com.example.wikidota.character.mobile.MarciActivity;
import com.example.wikidota.character.mobile.MiranaActivity;
import com.example.wikidota.character.mobile.NyxAssasinActivity;
import com.example.wikidota.character.mobile.PangolierActivity;
import com.example.wikidota.character.mobile.PhoeinixActivity;
import com.example.wikidota.character.mobile.SandKingActivity;
import com.example.wikidota.character.mobile.SanpfireActivity;
import com.example.wikidota.character.mobile.TechiesActivity;
import com.example.wikidota.character.mobile.TimbersawActivity;
import com.example.wikidota.character.mobile.VengefullActivity;
import com.example.wikidota.character.mobile.VenomancerActivity;
import com.example.wikidota.character.mobile.VisageActivity;
import com.example.wikidota.character.mobile.VoidSpiritActivity;
import com.example.wikidota.character.mobile.WindrangerActivity;
import com.example.wikidota.character.mobile.WynterWyvernActivity;
import com.example.wikidota.character.mobile.ioActivity;
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

public class MobileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);

    }
    public void getAbbadon(View view) {
        Intent intent = new Intent(MobileActivity.this, AbaddonActivity.class);
        startActivity(intent);


    }
    public void getBane(View view) {
        Intent intent = new Intent(MobileActivity.this, BaneActivity.class);
        startActivity(intent);


    } public void getbatrider(View view) {
        Intent intent = new Intent(MobileActivity.this, BatriderActivity.class);
        startActivity(intent);


    } public void getbeastmaster(View view) {
        Intent intent = new Intent(MobileActivity.this, BeastmasterActivity.class);
        startActivity(intent);


    } public void getbrewmaster(View view) {
        Intent intent = new Intent(MobileActivity.this, BrewmasterActivity.class);
        startActivity(intent);


    } public void getbroodmother(View view) {
        Intent intent = new Intent(MobileActivity.this, BroodMotherActivity.class);
        startActivity(intent);


    } public void getchen(View view) {
        Intent intent = new Intent(MobileActivity.this, ChenActivity.class);
        startActivity(intent);


    } public void getclockwerk(View view) {
        Intent intent = new Intent(MobileActivity.this, ClockwerkActivity.class);
        startActivity(intent);




    } public void darkseer(View view) {
        Intent intent = new Intent(MobileActivity.this, DarkseerActivity.class);
        startActivity(intent);


    } public void getdarkwillow(View view) {
        Intent intent = new Intent(MobileActivity.this, DarkwillowActivity.class);
        startActivity(intent);


    } public void getdazzle(View view) {
        Intent intent = new Intent(MobileActivity.this, DazzleActivity.class);
        startActivity(intent);


    } public void getenigma(View view) {
        Intent intent = new Intent(MobileActivity.this, EnigmaActivity.class);
        startActivity(intent);


    }
    public void getio(View view) {
        Intent intent = new Intent(MobileActivity.this, ioActivity.class);
        startActivity(intent);


    }
    public void getlonedroid(View view) {
        Intent intent = new Intent(MobileActivity.this, LonedruidActivity.class);
        startActivity(intent);


    } public void getlycan(View view) {
        Intent intent = new Intent(MobileActivity.this, LycanActivity.class);
        startActivity(intent);


    }

    public void getmagus(View view) {
        Intent intent = new Intent(MobileActivity.this, MagusActivity.class);
        startActivity(intent);


    } public void getmarci(View view) {
        Intent intent = new Intent(MobileActivity.this, MarciActivity.class);
        startActivity(intent);

    } public void getmirana(View view) {
        Intent intent = new Intent(MobileActivity.this, MiranaActivity.class);
        startActivity(intent);
        Log.i("poweractivity","good");


    }

    public void getnyxassasin(View view) {
        Intent intent = new Intent(MobileActivity.this, NyxAssasinActivity.class);
        startActivity(intent);


    } public void getpangoler(View view) {
        Intent intent = new Intent(MobileActivity.this, PangolierActivity.class);
        startActivity(intent);


    }
    public void getphoenix(View view) {
        Intent intent = new Intent(MobileActivity.this, PhoeinixActivity.class);
        startActivity(intent);


    } public void getsandking(View view) {
        Intent intent = new Intent(MobileActivity.this, SandKingActivity.class);
        startActivity(intent);


    } public void getsnapfire(View view) {
        Intent intent = new Intent(MobileActivity.this, SanpfireActivity.class);
        startActivity(intent);


    } public void getteches(View view) {
        Intent intent = new Intent(MobileActivity.this, TechiesActivity.class);
        startActivity(intent);


    } public void gettimbersaw(View view) {
        Intent intent = new Intent(MobileActivity.this, TimbersawActivity.class);
        startActivity(intent);


    } public void getvenomancer(View view) {
        Intent intent = new Intent(MobileActivity.this, VenomancerActivity.class);
        startActivity(intent);


    } public void getvisage(View view) {
        Intent intent = new Intent(MobileActivity.this, VisageActivity.class);
        startActivity(intent);



    }
    public void getvoidspirit(View view) {
        Intent intent = new Intent(MobileActivity.this, VoidSpiritActivity.class);
        startActivity(intent);


    } public void getwinterwyvern(View view) {
        Intent intent = new Intent(MobileActivity.this, WynterWyvernActivity.class);
        startActivity(intent);


    } public void getwindranger(View view) {
        Intent intent = new Intent(MobileActivity.this, WindrangerActivity.class);
        startActivity(intent);


    }
    public void getvengevul(View view) {
        Intent intent = new Intent(MobileActivity.this, VengefullActivity.class);
        startActivity(intent);


    }
}