package fr.pnoel;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class NombreImpair {

    public static String printNombreImpair(int petitNombre, int grandNombre) {
        return String.join(" ", doPrintNombreImpair(petitNombre, grandNombre).stream().map(i -> "" + i).collect(Collectors.toList()));
    }

    public static List<Integer> doPrintNombreImpair(int petitNombre, int grandNombre) {
        List<Integer> result = new LinkedList<>();
        if (petitNombre % 2 == 0) {
            petitNombre++;
        }
        if (petitNombre == grandNombre && petitNombre %2 !=0)  {
            result.add(petitNombre);
        }
        if (petitNombre < grandNombre) {
            result.add(petitNombre);
            result.addAll(doPrintNombreImpair(petitNombre+2, grandNombre));
        }
        return result;
    }
}


