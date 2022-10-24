package Ejercicios05;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        int altura;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura: ");
        altura = s.nextInt();
        for (int i = 0; i < altura - 1; i++) {
            System.out.println('*');

        }
        for (int i = 0; i < (altura / 2 + 1); i++) {
            System.out.print("* ");
        }
    }
}
