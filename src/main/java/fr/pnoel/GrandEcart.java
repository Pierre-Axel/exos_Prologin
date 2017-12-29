package fr.pnoel;

import java.util.Random;

public class GrandEcart {
    public static int printGrandEcart(int[] tableauEntier) {
        //int tableauEntier[] = {81,150,23,233,567,45,3};
        int maxDiff = 0;
        int valeurMax = 0;
        int valeurMin = 0;
        for (int i = 0; i < tableauEntier.length; i++) {
            if (tableauEntier[i]>valeurMax ) {
                valeurMax = tableauEntier[i];
            }
            if (tableauEntier[i]<valeurMax) {
                valeurMin = tableauEntier[i];
            }
            maxDiff = valeurMax - valeurMin;
            //System.out.println("Voici les valeurs du tableau: " + tableauEntier[i]);
        }
        //System.out.println("Valeur max: " + valeurMax);
        //System.out.println("Valeur max: " + valeurMin);
        //System.out.println("Difference max: " + maxDiff);
        return maxDiff;
    }
}
