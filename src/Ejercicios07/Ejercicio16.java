package Ejercicios07;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int[] num = new int[20];
        int eleccion;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            num[i] = (int) (Math.random() * 401);
            System.out.print(num[i] + " ");
            if ( i == 10)
                System.out.println();
        }
        System.out.println("\n¿Qué quieres resaltar? (1- Los múltiplos de 5, 2- Los múltiplos de 7)");
        eleccion = s.nextInt();

        if (eleccion == 1) {
            for (int i = 0; i < 20; i++) {
                if (num[i] % 5 == 0) {
                    System.out.print("[" + num[i] + "] ");
                } else  {
                    System.out.print(num[i] + " ");
                }
            }
        }
        if (eleccion == 2) {
            for (int i = 0; i < 20; i++) {
                if (num[i] % 7 == 0) {
                    System.out.print("[" + num[i] + "] ");
                } else  {
                    System.out.print(num[i] + " ");
                }
            }
        }
        if (eleccion != 2 && eleccion != 1) {
            System.out.println("No ha elegido una opción correcta");
        }
    }
}
