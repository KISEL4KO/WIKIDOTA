package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MobileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);

    }
    public void getAbbadon(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "abaddon");
        startActivity(intent);


    }
    public void getBane(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "bane");
        startActivity(intent);


    } public void getbatrider(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "batrider");
        startActivity(intent);


    } public void getbeastmaster(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "beastmaster");
        startActivity(intent);


    } public void getbrewmaster(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "brewmaster");
        startActivity(intent);


    } public void getbroodmother(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "broodmother");
        startActivity(intent);


    } public void getchen(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "chen");
        startActivity(intent);


    } public void getclockwerk(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "clockwerk");
        startActivity(intent);

    } public void darkseer(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "dark_seer");
        startActivity(intent);


    } public void getdarkwillow(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "dark_willow");
        startActivity(intent);


    } public void getdazzle(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "dazzle");
        startActivity(intent);


    } public void getenigma(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "enigma");
        startActivity(intent);


    }
    public void getio(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "io");
        startActivity(intent);
    }
    public void getlonedroid(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "lone_druid");
        startActivity(intent);


    } public void getlycan(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "lycan");
        startActivity(intent);


    }

    public void getmagus(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "magnus");
        startActivity(intent);


    } public void getmarci(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "marci");
        startActivity(intent);

    } public void getmirana(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "mirana");
        startActivity(intent);
    }

    public void getnyxassasin(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "nyx_assassin");
        startActivity(intent);


    } public void getpangoler(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "pangolier");
        startActivity(intent);


    }
    public void getphoenix(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "phoenix");
        startActivity(intent);


    } public void getsandking(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "sand_king");
        startActivity(intent);


    } public void getsnapfire(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "snapfire");
        startActivity(intent);


    } public void getteches(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "techies");
        startActivity(intent);


    } public void gettimbersaw(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "timbersaw");
        startActivity(intent);


    } public void getvenomancer(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "venomancer");
        startActivity(intent);


    } public void getvisage(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "visage");
        startActivity(intent);



    }
    public void getvoidspirit(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "void_spirit");
        startActivity(intent);


    } public void getwinterwyvern(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "winter_wyvern");
        startActivity(intent);


    } public void getwindranger(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "windranger");
        startActivity(intent);


    }
    public void getvengevul(View view) {
        Intent intent = new Intent(MobileActivity.this, HeroActivity.class);
        intent.putExtra("name", "vengeful_spirit");
        startActivity(intent);
    }

    public void getCharacher(View view) {
        Intent intent = new Intent(MobileActivity.this, Character.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    public void getItem(View view) {
        Intent intent = new Intent(MobileActivity.this, Items.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    public void getHome(View view) {
        Intent intent = new Intent(MobileActivity.this , MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}