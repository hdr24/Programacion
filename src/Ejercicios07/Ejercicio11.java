package Ejercicios07;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] numInic = new int[10];
        int[] numFinal = new int[10];
        int k = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca 10 números");
        for (int i = 0; i < 10; i++) {
            numInic[i] = s.nextInt();
        }
        System.out.println("Array inicial");
        System.out.printf("%10s", "Índice |");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d", i);
        }
        System.out.println();
        System.out.printf("%10s", "Valor |");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d", numInic[i]);
        }
        for (int i = 0; i < 10; i++) {
            int div = 0;
            for (int j = 1; j <= numInic[i]; j++) {
                if (numInic[i] % j == 0) {
                    div++;
                }
            }
            if (div <= 2) {
                System.arraycopy(numInic, i, numFinal, k, 1);
                k++;
            }
        }

        for (int i = 0; i < 10; i++) {
            int div = 0;
            for (int j = 1; j <= numInic[i]; j++) {
                if (numInic[i] % j == 0) {
                    div++;
                }
            }
            if (!(div <= 2)) {
                System.arraycopy(numInic, i, numFinal, k, 1);
                k++;
            }
        }

        System.out.println("\n\nArray final");
        System.out.printf("%10s", "Índice |");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d", i);
        }
        System.out.println();
        System.out.printf("%10s", "Valor |");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d", numFinal[i]);
        }
    }
}
