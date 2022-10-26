package Ejercicios07;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        //  int[] numeros = new int[15];
        int[] numerosCop;
        Scanner s = new Scanner(System.in);
        //               15 1  2  3  4  5  6  7  8  9   10  11  12  13  14
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        // System.out.print("Introduzca 15 números");
        // for (int i = 0; i < 15; i++) {
        //     numeros[i] = s.nextInt();
        // }
        numerosCop = numeros;
        numeros[0] = numerosCop[14];
        System.arraycopy(numerosCop, 2, numeros, 1, 13);
        System.out.println("Los elementos del array desplazado son: ");
        for (int i = 0; i < 15; i++) {
            System.out.println(numeros[i]);
        }
    }
}
