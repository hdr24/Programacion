package Ejercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        String dia;
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el día");
        dia = s.next().toLowerCase(Locale.ROOT);

        switch (dia) {
            case "lunes":
                System.out.println("El " + dia + " a primera hay programación");
                break;
                case "martes":
                System.out.println("El " + dia + " a primera hay entornos");
                    break;
            case "miercoles":
                System.out.println("El " + dia + " a primera hay fol");
                break;
            case "jueves":
                System.out.println("El " + dia + " a primera hay Sistemas");
                break;
            case "viernes":
                System.out.println("El " + dia + " a primera hay Lenguaje de Marcas");
                break;
        }
    }
}
