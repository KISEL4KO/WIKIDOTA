package com.example.wikidota;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MyParser extends AsyncTask<String, Void, Document> {
    public String request;
    public String response;
    public HttpsURLConnection connection;

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