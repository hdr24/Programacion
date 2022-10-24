package Ejercicios05;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número");
        num1 = s.nextInt();
        System.out.println("Introduzca otro número");
        num2 = s.nextInt();
        System.out.println("Los numeros menores de " + num1 + " que no son divisibles entre " + num2 + " son:");
        for (int i = 1; i < num1; i++) {
            if (i % num2 != 0) {
                System.out.println(i);
            }
        }
    }
}
