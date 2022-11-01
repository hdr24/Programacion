package Ejercicios07a;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] numerosFin = new int[10];
        int posInic, posFin;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = s.nextInt();
        }
        System.out.println("Array inicial");
        System.out.printf("%10s", "Indice |");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();
        System.out.printf("%10s", "Valor |");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%5s", numeros[i]);
        }

        System.out.print("\nIntroduzca la posicion inicial: ");
        posInic = s.nextInt();
        System.out.println("Introduzca la posición final: ");
        posFin = s.nextInt();

        if ((posInic < posFin) && (posFin >= 0 && posFin < 10) && (posInic >= 0)) {

            numerosFin[0] = numeros[9];

            for (int i = 1; i < 10; i++) {
                if (i > posInic && i <= posFin) {
                    numerosFin[i] = numeros[i];
                } else {
                    numerosFin[i] = numeros[i - 1];
                }
            }
            numerosFin[posFin] = numeros[posInic];


            System.out.println("Array final");
            System.out.printf("%10s", "Indice |");
            for (int j = 0; j < 10; j++) {
                System.out.printf("%5d", j);
            }
            System.out.println();
            System.out.printf("%10s", "Valor |");
            for (int j = 0; j < 10; j++) {
                System.out.printf("%5s", numerosFin[j]);
            }
        } else {
            System.out.println("Las posiciones introducidas no son válidas");
        }
    }
}
