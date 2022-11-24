package EjerciciosCadenas;

import java.util.Locale;

public class Ejercicio17 {
    public static String mayusculasPrimera(String cad) {
        String cadMayus = "";
        if (cad.charAt(0) != ' ')
            cadMayus = String.valueOf(cad.charAt(0)).toUpperCase();
        for (int i = 1; i < cad.length(); i++) {
            if (cad.charAt(i-1) == ' ')
                cadMayus = cadMayus.concat(String.valueOf(cad.charAt(i)).toUpperCase());
            else cadMayus = cadMayus.concat(String.valueOf(cad.charAt(i)));
        }
        return cadMayus;
    }

    public static void main(String[] args) {
        System.out.println(mayusculasPrimera("una   casa     azul    "));
    }
}
