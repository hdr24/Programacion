package Ejercicios07b;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        int[][] numeros = new int[4][5];
        int[] sumFilas = new int[4];
        int[] sumColum = new int[5];
        int total = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca 20 números: ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = s.nextInt();
            }
        }
        System.out.printf("%10s", "");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%10s", "Columna " + i);
            for (int j = 0; j < 4; j++) {
                sumColum[i] += numeros[j][i];
            }
        }

        System.out.printf("%10s", "Total\n");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%10s", "Fila " + (i));
            for (int j = 0; j < 5; j++) {
                System.out.printf("%10s", numeros[i][j] + " ");
                sumFilas[i] += numeros[i][j];
                total += numeros[i][j];
            }
            System.out.printf("%10s", sumFilas[i] + "\n");

        }
        System.out.printf("%10s", "Total");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%10s", sumColum[i] + " ");
        }
        System.out.printf("%10s", total);
    }
}