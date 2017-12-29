package fr.pnoel;

import java.util.regex.Pattern;

public class MotLePlusLong {
    public static  String printMotLePlusLong(String phrase) {
        //String phrase = "Voici un pharse avec dedant un mot qui est plus long que les autres comme anticonstitutionnellement";
        String MotLongMax = "";
        Pattern patern = Pattern.compile(" ");
        String[] sousChaines = patern.split(phrase);
        for (int i = 0; i < sousChaines.length; i++) {
            String ch2 = sousChaines[i].substring(0);
            if(MotLongMax.length()< ch2.length()){
                MotLongMax = ch2;
            }
        }
        return MotLongMax;
    }
}
