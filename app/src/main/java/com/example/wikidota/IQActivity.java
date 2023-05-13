package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.wikidota.character.AncientApparatActivity;
import com.example.wikidota.character.DeathProphetActivity;
import com.example.wikidota.character.DisruptorActivity;
import com.example.wikidota.character.EnchantressActivity;
import com.example.wikidota.character.GrimstrokeActivity;
import com.example.wikidota.character.InvokerActivity;
import com.example.wikidota.character.JakiroActivity;
import com.example.wikidota.character.KeeperoftheLightActivity;
import com.example.wikidota.character.LIchActivity;
import com.example.wikidota.character.LesharcMainActivity;
import com.example.wikidota.character.LinaMainActivity;
import com.example.wikidota.character.LionActivity;
import com.example.wikidota.character.MuertaActivity;
import com.example.wikidota.character.NaturesProphetActivity;
import com.example.wikidota.character.NecrophosActivity;
import com.example.wikidota.character.OracleActivity;
import com.example.wikidota.character.OutworldDestroyerActivity;
import com.example.wikidota.character.PuckActivity;
import com.example.wikidota.character.QueenofPainActivity;
import com.example.wikidota.character.RubickActivity;
import com.example.wikidota.character.ShadowDemonActivity;
import com.example.wikidota.character.ShadowShamanActivity;
import com.example.wikidota.character.SilencerActivity;
import com.example.wikidota.character.SkywrathMagActivity;
import com.example.wikidota.character.StromSpiritActivity;
import com.example.wikidota.character.TinkerActivity;
import com.example.wikidota.character.WarlockActivity;
import com.example.wikidota.character.WithDoctorActivity;
import com.example.wikidota.character.ZeusActivity;

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
        Intent intent = new Intent(IQActivity.this, EnchantressActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");

    }


    public void getgrimstroke(View view) {
        Intent intent = new Intent(IQActivity.this, GrimstrokeActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }

    public void getapparat(View view) {
        Intent intent = new Intent(IQActivity.this, AncientApparatActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }

    public void getdeathpropet(View view) {
        Intent intent = new Intent(IQActivity.this, DeathProphetActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getinvoker(View view) {
        Intent intent = new Intent(IQActivity.this, InvokerActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getjakiro(View view) {
        Intent intent = new Intent(IQActivity.this, JakiroActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");

    }
    public void getkeeper(View view) {
        Intent intent = new Intent(IQActivity.this, KeeperoftheLightActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getwarlock(View view) {
        Intent intent = new Intent(IQActivity.this, WarlockActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getlich(View view) {
        Intent intent = new Intent(IQActivity.this, LIchActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getlina(View view) {
        Intent intent = new Intent(IQActivity.this, LinaMainActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getleon(View view) {
        Intent intent = new Intent(IQActivity.this, LionActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");

    }
    public void getmuerta(View view) {
        Intent intent = new Intent(IQActivity.this, MuertaActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getnaturestro(View view) {
        Intent intent = new Intent(IQActivity.this, NaturesProphetActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getnecrophos(View view) {
        Intent intent = new Intent(IQActivity.this, NecrophosActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getoracle(View view) {
        Intent intent = new Intent(IQActivity.this, OracleActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getoutworld(View view) {
        Intent intent = new Intent(IQActivity.this, OutworldDestroyerActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getpuck(View view) {
        Intent intent = new Intent(IQActivity.this, PuckActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getqueenofpain(View view) {
        Intent intent = new Intent(IQActivity.this, QueenofPainActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getrubick(View view) {
        Intent intent = new Intent(IQActivity.this, RubickActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getshadowdemon(View view) {
        Intent intent = new Intent(IQActivity.this, ShadowDemonActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getdisruptor(View view) {
        Intent intent = new Intent(IQActivity.this, DisruptorActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void gettinker(View view) {
        Intent intent = new Intent(IQActivity.this, TinkerActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getpetuhsara(View view) {
        Intent intent = new Intent(IQActivity.this, SkywrathMagActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getstromspirit(View view) {
        Intent intent = new Intent(IQActivity.this, StromSpiritActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getwithdoctor(View view) {
        Intent intent = new Intent(IQActivity.this, WithDoctorActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getzeus(View view) {
        Intent intent = new Intent(IQActivity.this, ZeusActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
    public void getleshark(View view) {
        Intent intent = new Intent(IQActivity.this, LesharcMainActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }

    public void getshadowshaman(View view) {
        Intent intent = new Intent(IQActivity.this, ShadowShamanActivity.class);
        startActivity(intent);
        Log.i("iqactivity","good");
    }
 public void getsilencer(View view){
     Intent intent = new Intent(IQActivity.this, SilencerActivity.class);
     startActivity(intent);
     Log.i("iqactivity","good");
 }
}
