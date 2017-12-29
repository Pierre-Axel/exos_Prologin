package fr.pnoel;

import java.util.regex.Pattern;

public class Initiales {
    public String printInitiales(String phrase) {
        //String phrase = "Je suis le plus beau";
        String chaine2 = "";
        System.out.println(phrase);
        Pattern patern = Pattern.compile(" ");
        String[] sousChaines = patern.split(phrase);
        for (int i = 0; i < sousChaines.length; i++) {
            if (!sousChaines[i].equals("")) {
                String ch2 = sousChaines[i].substring(0, 1);
                ch2 = ch2.toUpperCase();
                chaine2 += ch2;
                System.out.print(ch2);
            }
        }
        return chaine2;
    }
}
