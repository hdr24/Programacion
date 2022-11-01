package Ejercicios07a;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] num = new int[100];
        int min = 500, max = 0, select;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            num[i] = (int) (Math.random() * 501);
            System.out.print(num[i] + " ");
            if (i % 25 == 0 && i != 0) {
                System.out.println();
            }
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }

        System.out.println("\n¿Qué desea destacar? (1 - mínimo, 2 - máximo)");
        select = s.nextInt();
        for (int i = 0; i < 100; i++) {
            if (select == 1) {
                if (num[i] == min) {
                    System.out.print("**" + num[i] + "** ");
                } else {
                    System.out.print(num[i] + " ");
                }
                if (i % 25 == 0 && i != 0) {
                    System.out.println();
                }
            }
            if (select == 2) {
                if (num[i] == max) {
                    System.out.print("**" + num[i] + "** ");
                } else {
                    System.out.print(num[i] + " ");
                }
                if (i % 25 == 0 && i != 0) {
                    System.out.println();
                }
            }
        }
    }
}
