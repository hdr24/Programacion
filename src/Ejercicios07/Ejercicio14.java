package Ejercicios07;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        String[] palabraInic = new String[8];
        String[] palabraFinal = new String[8];
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        int k = 0, z = 0, y = 7;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca 10 palabras");
        for (int i = 0; i < 8; i++) {
            palabraInic[i] = s.next();
        }
        System.out.println("Array inicial");
        System.out.println("┌───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┬───────────────┐");
        for (int i = 0; i < 8; i++) {
            System.out.print("│");
            System.out.printf("%7d", i);
            System.out.print("        ");
        }
        System.out.println("│");
        System.out.println("├───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┼───────────────┤");
        for (int i = 0; i < 8; i++) {
            System.out.print("│");
            System.out.printf("%9s", palabraInic[i]);
            System.out.print("      ");
        }
        System.out.println("│");
        System.out.println("└───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┘");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                if (palabraInic[i].equals(colores[j])) {
                    System.arraycopy(palabraInic, i, palabraFinal, k, 1);
                    k++;
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(palabraFinal[i]);
        }
    }
}
