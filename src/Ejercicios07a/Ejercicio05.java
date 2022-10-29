package Ejercicios07a;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int max, min;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = s.nextInt();
        }
        max = numeros[1];
        min = numeros[1];
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if (max == numeros[i]) {
                System.out.print(numeros[i]);
                System.out.println(" Máximo");
            } else {
                if (min == numeros[i]) {
                    System.out.print(numeros[i]);
                    System.out.println(" Mínimo");
                } else {
                    System.out.println(numeros[i]);
                }
            }
        }
    }
}
