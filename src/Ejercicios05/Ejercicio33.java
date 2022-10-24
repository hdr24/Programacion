package Ejercicios05;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        int altura;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura: ");
        altura = s.nextInt();
        for (int i = 0; i < altura - 1; i++) {
            System.out.print("* ");
            for (int j = 0; j < altura - 2; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        System.out.print("  ");
        for (int i = 0; i < altura - 2; i++) {
            System.out.print("* ");
        }
        System.out.println("  ");
    }
}
