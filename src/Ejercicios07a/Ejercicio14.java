package Ejercicios07a;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        String[] palabraInic = new String[8];
        String[] palabraFinal = new String[8];
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        int k = 0, l = 7;
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
            boolean color = false;
            for (int j = 0; j < 9; j++) {
                if (palabraInic[i].equals(colores[j])) {
                    color = true;
                    break;
                }
            }
            if (color) {
                palabraFinal[k] = palabraInic[i];
                k++;
            } else {
                palabraFinal[l] = palabraInic[i];
                l--;
            }
        }

        System.out.println("Array final");
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
            System.out.printf("%9s", palabraFinal[i]);
            System.out.print("      ");
        }
        System.out.println("│");
        System.out.println("└───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┴───────────────┘");
    }
}
