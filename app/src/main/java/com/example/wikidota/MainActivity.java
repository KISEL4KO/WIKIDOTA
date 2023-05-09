package com.example.wikidota;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {
//    public TextView hero1, hero11, hero111, hero2, hero22, hero222, hero3, hero33, hero333, hero4, hero44, hero444;
//    public TextView heroes1, heroes11, heroes111, heroes2, heroes22, heroes222, heroes3, heroes33, heroes333, heroes4, heroes44, heroes444;
    public String request;
    public String response;
    public HttpsURLConnection connection;
    public Document html;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            html = new MyParser().execute("https://www.dotabuff.com").get();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String[] listAfterParse = new String[36];
        int pos = 0;
        ArrayList<String[]> list = Builder.statisticWins(html);
        for (String[] e : list) {
            for (String k : e) {
                if (k != null) {
                    listAfterParse[pos] = k;
                    pos++;
                }
            }
        }
        int poss = 18;
        for (String[] e : Builder.statisticsPicks(html)) {
            for (String k : e) {
                if (k != null) {
                    listAfterParse[poss] = k;
                    poss++;
                }
            }
        }
        int p = 0;
        ArrayList<String> finalList = new ArrayList<>();
        for (String e: listAfterParse) {
            String[] sp = new String[] {"0", "1", "2", "3", "4", "5", "9", "10", "11", "12", "13",
                    "14", "18", "19", "20", "21", "22", "23", "27", "28", "29", "30", "31",
                    "32"};
            if (Builder.check(sp, String.valueOf(p))) finalList.add(e);
            p++;
        }
        System.out.println(finalList);
        int convenientPos = 0;
        for (int i = 1; i < 3; i++) {
            String base;
            if (i == 1) {base = "hero";}
            else {base = "heroes";}
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 4; k++) {
                    String bebra = "bebra!!!";
                    switch (k){
                        case 1:
                            bebra = String.valueOf(j);
                            break;
                        case 2:
                            bebra = String.valueOf(j) + String.valueOf(j);
                            break;
                        case 3:
                            bebra = String.valueOf(j) + String.valueOf(j) + String.valueOf(j);
                            break;
                    }
                    TextView view = findViewById(getResources().getIdentifier(base + bebra, "id", getPackageName()));
                    view.setText(finalList.get(convenientPos));
                    convenientPos++;
                }
            }
        }

    }

    public void getCharacher(View view) {
        Intent intent = new Intent(MainActivity.this, Character.class);
        startActivity(intent);
    }

    public void getItem(View view) {

        Intent intent = new Intent(MainActivity.this, Items.class);
        startActivity(intent);

    }
    public class MyParser extends AsyncTask<String, Void, Document> {
        @Override
        protected Document doInBackground(String... links) {
            Document htmll = null;
            try {
                request = links[0];
                URL url = new URL(request);
                connection = (HttpsURLConnection) url.openConnection();
                connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
                connection.connect();
                InputStream stream = connection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
                String line = "";
                StringBuffer buffer = new StringBuffer();
                while ((line = reader.readLine()) != null) {
                    buffer.append(line).append("\n");
                }
                response = buffer.toString();
                htmll = Jsoup.parse(response);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return htmll;
        }

    }
}