package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wikidota.R;

import org.jsoup.nodes.Document;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class HeroActivity extends AppCompatActivity {
    public ImageView img;
    public String name;
    public Document html;
    public Document haha;

    @Override
    protected void onCreate(Bundle savedInstanceState) throws NullPointerException {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);
        Bundle bundleIntent = getIntent().getExtras();
        img = findViewById(R.id.image);
        name = bundleIntent.get("name").toString();
        fill();
        fillImages();
    }

    public void fillImages() {
        if (name.equals("anti-mage")) name = "antimage";
        img.setImageResource(getResources().getIdentifier(name, "drawable", getPackageName()));
        for (int i = 1; i <= 14; i++) {
            ImageView view = findViewById(getResources().getIdentifier("s" + i, "id", getPackageName()));
            if (getResources().getIdentifier(name + "skill" + i, "drawable", getPackageName()) != 0) {
                view.setImageResource(getResources().getIdentifier(name + "skill" + i, "drawable", getPackageName()));
            }
            else {
                view.setVisibility(View.GONE);
            }
        }
        ImageView tal = findViewById(R.id.t);
        tal.setImageResource(getResources().getIdentifier(name + "talants", "drawable", getPackageName()));
    }

    public void fill() throws NullPointerException {
        try {
            TextView nameHero = findViewById(R.id.name);
            TextView dHero = findViewById(R.id.desc);
            TextView styleHero = findViewById(R.id.style);
            TextView styleHer = findViewById(R.id.s);
            TextView plusHero = findViewById(R.id.plus);
            TextView plusHer = findViewById(R.id.p);
            TextView minusHero = findViewById(R.id.minus);
            TextView minusHer = findViewById(R.id.m);
            html = new MyParser().execute("https://dota2.fandom.com/ru/wiki/" +
                    formatName(name) + "/Руководство").get();
            haha = new MyParser().execute("https://dota2.fandom.com/ru/wiki/" +
                    formatName(name)).get();
            if (html != null && haha != null) {
                String[] listD = Builder.description(haha);
                nameHero.setText(listD[0]);
                dHero.setText(listD[1].split(" Сложность:")[0]);
                String[] listH = Builder.info(html);
                if (listH[0].split(" ").length >= 5) styleHero.setText(listH[0]);
                else {
                    styleHero.setHeight(0);
                    styleHer.setHeight(0);
                }
                if (listH[1].split(" ").length >= 5) {
                    String itog = "";
                    String[] sp = listH[1].split("\\.");
                    for(String e: sp) {
                        itog += "• " + e.trim();
                        if (!e.equals(sp[sp.length - 1])) itog += "\n";
                    }
                    plusHero.setText(itog);
                }
                else {
                    plusHero.setHeight(0);
                    plusHer.setHeight(0);
                }
                if (listH[2].split(" ").length >= 5) {
                    String itog = "";
                    String[] sp = listH[2].split("\\.");
                    for(String e: sp) {
                        itog += "• " + e.trim();
                        if (!e.equals(sp[sp.length - 1])) itog += "\n";
                    }
                    minusHero.setText(itog);
                }
                else {
                    minusHero.setHeight(0);
                    minusHer.setHeight(0);
                }}
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

    public String formatName(String name) {
        String[] list = name.split("_");
        StringBuilder itog = new StringBuilder();
        for (String e: list) {
            if (e.equals(list[0]) || e.equals(list[list.length - 1])) {
                itog.append(e.substring(0, 1).toUpperCase()).append(e.substring(1));
            }
            else {
                itog.append(e);
            }
            itog.append("_");
        }
        if (name.equals("natures_prophet")) return "Nature%27s_Prophet";
        else if (name.equals("anti-mage")) return "Anti-Mage";
        else return itog.substring(0, itog.length()-1);
    }

    public void getCharacher(View view) {
        Intent intent = new Intent(HeroActivity.this, Character.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }

    public void getItem(View view) {
        Intent intent = new Intent(HeroActivity.this, Items.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }

    public void getHome(View view) {
        Intent intent = new Intent(HeroActivity.this , MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }
}