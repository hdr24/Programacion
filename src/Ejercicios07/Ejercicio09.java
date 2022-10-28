package Ejercicios07;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        int[] num = new int[8];
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca 8 números: ");
        for (int i = 0; i < 8; i++) {
            num[i] = s.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i] + " par");
            } else {
                System.out.println(num[i] + " impar");
            }
        }
    }
}
