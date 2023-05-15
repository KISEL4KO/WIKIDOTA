package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.wikidota.character.speed.AntiMageActivity;
import com.example.wikidota.character.speed.ArcWardenActivity;
import com.example.wikidota.character.speed.BloodseekerActivity;
import com.example.wikidota.character.speed.BountyHunterActivity;
import com.example.wikidota.character.speed.ClinkzActivity;
import com.example.wikidota.character.speed.DrowRangerActivity;
import com.example.wikidota.character.speed.EmberSpiritActivity;
import com.example.wikidota.character.speed.FacelessVoidActivity;
import com.example.wikidota.character.speed.GyrocopterActivity;
import com.example.wikidota.character.speed.HoodwinkActivity;
import com.example.wikidota.character.speed.JuggernautActivity;
import com.example.wikidota.character.speed.LunaActivity;
import com.example.wikidota.character.speed.MedusaActivity;
import com.example.wikidota.character.speed.MeepoActivity;
import com.example.wikidota.character.speed.MonkeyKingActivity;
import com.example.wikidota.character.speed.MorphlingActivity;
import com.example.wikidota.character.speed.NagaSirenActivity;
import com.example.wikidota.character.speed.PhatomAssasinActivity;
import com.example.wikidota.character.speed.PhatomLancerActivity;
import com.example.wikidota.character.speed.RazorActivity;
import com.example.wikidota.character.speed.RikiActivity;
import com.example.wikidota.character.speed.ShadowFiendActivity;
import com.example.wikidota.character.speed.SlarkActivity;
import com.example.wikidota.character.speed.SniperActivity;
import com.example.wikidota.character.speed.SpectreActivity;
import com.example.wikidota.character.speed.TempllarAssasinActivity;
import com.example.wikidota.character.speed.TerrorbladeActivity;
import com.example.wikidota.character.speed.TrollWarlordActivity;
import com.example.wikidota.character.speed.UrsaActivity;
import com.example.wikidota.character.speed.ViperActivity;
import com.example.wikidota.character.speed.WeaverActivity;

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
        Intent intent = new Intent(SpeedActivity.this, AntiMageActivity.class);
        startActivity(intent);

    }
    public void getarcwarden(View view){
        Intent intent = new Intent(SpeedActivity.this, ArcWardenActivity.class);
        startActivity(intent);

    }public void getbloodseeker(View view){
        Intent intent = new Intent(SpeedActivity.this, BloodseekerActivity.class);
        startActivity(intent);

    }public void getbountyhunter(View view){
        Intent intent = new Intent(SpeedActivity.this, BountyHunterActivity.class);
        startActivity(intent);

    }public void getclinkz (View view){
        Intent intent = new Intent(SpeedActivity.this, ClinkzActivity.class);
        startActivity(intent);

    }public void getdrowranger(View view){
        Intent intent = new Intent(SpeedActivity.this, DrowRangerActivity.class);
        startActivity(intent);

    }public void getemberspirit(View view){
        Intent intent = new Intent(SpeedActivity.this, EmberSpiritActivity.class);
        startActivity(intent);

    }public void getfaclessvoid(View view){
        Intent intent = new Intent(SpeedActivity.this, FacelessVoidActivity.class);
        startActivity(intent);

    }public void getgyrocopter(View view){
        Intent intent = new Intent(SpeedActivity.this, GyrocopterActivity.class);
        startActivity(intent);

    }public void gethoodwink(View view){
        Intent intent = new Intent(SpeedActivity.this, HoodwinkActivity.class);
        startActivity(intent);

    }public void gerjuggernaut(View view){
        Intent intent = new Intent(SpeedActivity.this, JuggernautActivity.class);
        startActivity(intent);

    }public void getluna(View view){
        Intent intent = new Intent(SpeedActivity.this, LunaActivity.class);
        startActivity(intent);

    }public void getmedusa(View view){
        Intent intent = new Intent(SpeedActivity.this, MedusaActivity.class);
        startActivity(intent);

    }public void getmeepo(View view){
        Intent intent = new Intent(SpeedActivity.this, MeepoActivity.class);
        startActivity(intent);

    }public void getmonkeyking(View view){
        Intent intent = new Intent(SpeedActivity.this, MonkeyKingActivity.class);
        startActivity(intent);

    }public void getmorphling(View view){
        Intent intent = new Intent(SpeedActivity.this, MorphlingActivity.class);
        startActivity(intent);

    }public void getnagasiren(View view){
        Intent intent = new Intent(SpeedActivity.this, NagaSirenActivity.class);
        startActivity(intent);

    }public void getphatomassasin(View view){
        Intent intent = new Intent(SpeedActivity.this, PhatomAssasinActivity.class);
        startActivity(intent);

    }

    public void getrazor(View view){
        Intent intent = new Intent(SpeedActivity.this, RazorActivity.class);
        startActivity(intent);

    }public void getriki(View view){
        Intent intent = new Intent(SpeedActivity.this, RikiActivity.class);
        startActivity(intent);

    }

    public void getphatomlancer(View view) {
    Intent intent = new Intent(SpeedActivity.this, PhatomLancerActivity.class);
    startActivity(intent);
    }
    public void getshadowfiend(View view){
        Intent intent = new Intent(SpeedActivity.this, ShadowFiendActivity.class);
        startActivity(intent);

    }public void getslark(View view){
        Intent intent = new Intent(SpeedActivity.this, SlarkActivity.class);
        startActivity(intent);

    }public void getsniper(View view){
        Intent intent = new Intent(SpeedActivity.this, SniperActivity.class);
        startActivity(intent);

    }public void getspectre(View view){
        Intent intent = new Intent(SpeedActivity.this, SpectreActivity.class);
        startActivity(intent);

    }public void gettemplarassasin(View view){
        Intent intent = new Intent(SpeedActivity.this, TempllarAssasinActivity.class);
        startActivity(intent);

    }public void getterrorblade(View view){
        Intent intent = new Intent(SpeedActivity.this, TerrorbladeActivity.class);
        startActivity(intent);

    }public void gettrollwarlord(View view){
        Intent intent = new Intent(SpeedActivity.this,  TrollWarlordActivity.class);
        startActivity(intent);

    }public void getursa(View view){
        Intent intent = new Intent(SpeedActivity.this, UrsaActivity.class);
        startActivity(intent);

    }public void getviper(View view){
        Intent intent = new Intent(SpeedActivity.this, ViperActivity.class);
        startActivity(intent);

    }public void getweaver(View view){
        Intent intent = new Intent(SpeedActivity.this, WeaverActivity.class);
        startActivity(intent);

    }



}
