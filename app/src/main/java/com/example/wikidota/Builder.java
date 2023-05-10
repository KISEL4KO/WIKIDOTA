package com.example.wikidota;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Builder {

    public static void items(String hero, Document html) {
        try {
            String[] heroName = hero.toLowerCase().split(" ");
            StringJoiner joinedName = new StringJoiner("-");
            for (String e: heroName){
                joinedName.add(e);
            }
            String title = html.title();
            System.out.println(title + '\n');
            System.out.println("Top-12 most used items this week:" + "\n");
            System.out.println("Item - Matches - Wins - Winrate\n");
            Elements listItems = html.select("a[href]");
            for (Element link : listItems) {
                String linkText = link.text();
                String linkHref = link.attr("href");
                if (!linkText.equals("") &&
                        linkHref.contains("/items/") &&
                        !linkHref.contains("winning") &&
                        !linkHref.contains("economy") && !linkHref.contains("impact")){
                    String ask = "tr[data-link-to=" + linkHref + "] > td";
                    String[] params = html.select(ask).text().split(" ");
                    String[] slice = Arrays.copyOfRange(params, params.length - 3, params.length);
                    StringJoiner joined = new StringJoiner(" - ");
                    for (String e: slice){
                        joined.add(e);
                    }
                    System.out.println(linkText + " - " + joined);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean check(String[] arr, String name) {
        for (String id : arr) {
            if (name.equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<String[]> statisticWins(Document html) {
        Elements listsecs = html.select("section.home-hero-pulse").select("a.link-type-hero");
        String[] listWinHeroesNames = new String[6];
        ArrayList<String[]> listWinHeroes = new ArrayList<>();
        int pos = 0;
        for (Element e : listsecs) {
            String name = e.text();
            String[] forEveryHero = new String[3];
            forEveryHero[0] = name;
            Elements rates = html.select("tr[data-link-to=" + e.attr("href") + "] > td");
            int i = 0;
            for (Element k : rates) {
                k.select("i");
                if (i != 0 && i != 1) {
                    if (i == 3) {
                        if (k.select("i").toString().contains("Increased"))
                            forEveryHero[i - 1] = '+' + k.text();
                        else forEveryHero[i - 1] = '-' + k.text();
                    } else if (i == 2) {
                        forEveryHero[i - 1] = k.text();
                    }
                }
                i++;
            }
            listWinHeroes.add(forEveryHero);
            listWinHeroesNames[pos] = name;
            if (pos < 5) pos++;
            else break;
        }
        return listWinHeroes;
        // НУЖНО ПОМНИТЬ, ЧТО ПРИ СОЗДАНИИ ТАБЛИЦЫ НА ГЛАВНОМ ЭКРАНЕ НЕОБХОДИМО ОТСЕИВАТЬ NULL-СТРОКИ !!!
    }
    public static ArrayList<String[]> statisticsPicks(Document html) {
        Elements listsecs = html.select("section.home-hero-pulse").select("a.link-type-hero");
        String[] listPickHeroesNames = new String[6];
        ArrayList<String[]> listPickHeroes = new ArrayList<>();
        int poss = 0;
        for (Element e: listsecs) {
            if (poss >= listsecs.size() / 2) {
                String name = e.text();
                String[] forEveryHeroP = new String[3];
                forEveryHeroP[0] = name;
                Elements rates = html.select("tr[data-link-to=" + e.attr("href") + "] > td");
                int i = 0;
                for (Element k : rates) {
                    if (i != rates.size() - 4 && i != rates.size() - 3) {
                        if (i == rates.size() - 1) {
                            if (k.select("i").toString().contains("Increased"))
                                forEveryHeroP[i - rates.size() + 3] = '+' + k.text();
                            else forEveryHeroP[i - rates.size() + 3] = '-' + k.text();
                        } else if (i == rates.size() - 2) {
                            forEveryHeroP[i - rates.size() + 3] = k.text();
                        }
                    }
                    i++;
                }
                listPickHeroes.add(forEveryHeroP);
                listPickHeroesNames[poss - listsecs.size()/2] = name;
                if (poss == listsecs.size() - 1) {
                    break;
                }
            }
            poss++;
        }
        for (String[] e: listPickHeroes) {
            for(String j: e) {
                System.out.println(j);
            }
        }
        return listPickHeroes;
    }
}