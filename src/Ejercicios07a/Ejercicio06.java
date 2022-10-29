package Ejercicios07a;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        int[] numerosDesp = new int[15];
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca 15 números: ");
        for (int i = 0; i < 15; i++) {
            numeros[i] = s.nextInt();
        }
        numerosDesp[0] = numeros[14];
        System.arraycopy(numeros, 0, numerosDesp, 1, 14);

        System.out.println("Los elementos del array desplazado son: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(numerosDesp[i] + " ");
        }
    }
}
