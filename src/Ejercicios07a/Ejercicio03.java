package Ejercicios07a;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca 10 números: ");

        for (int i = 0; i < 10; i++) {
            num[i] = s.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}