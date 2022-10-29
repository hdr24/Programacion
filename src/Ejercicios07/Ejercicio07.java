package Ejercicios07;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int valAnt, valNew;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) (Math.random() * 21);
            System.out.print(numeros[i] + " ");
            if (i % 25 == 0 && i != 0) {
                System.out.println();
            }
        }
        System.out.println("\nIntroduzca el valor que desea cambiar: ");
        valAnt = s.nextInt();
        System.out.println("Introduzca el valor por el que lo desea cambiar: ");
        valNew = s.nextInt();

        for (int i = 0; i < 100; i++) {
            if (numeros[i] == valAnt) {
                numeros[i] = valNew;
                System.out.print("'" + numeros[i] + "'" + " ");
            } else {
                System.out.print(numeros[i] + " ");
            }
            if (i % 25 == 0 && i != 0) {
                System.out.println();
            }
        }
    }
}
