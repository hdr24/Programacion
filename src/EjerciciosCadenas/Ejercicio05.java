package EjerciciosCadenas;

import java.util.Scanner;

public class Ejercicio05 {
    public static String repiteCaracter(char car, int rep) {
        String cadFinal = "";
        for (int i = 0; i < rep; i++) {
            cadFinal = cadFinal.concat(String.valueOf(car));
        }
        return cadFinal;
    }

    public static void main(String[] args) {
        System.out.println(repiteCaracter('c',5));
    }
}
