package Ejercicios05;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int num, divisores = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        num = s.nextInt();
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if ((num % i) == 0) {
                    divisores++;
                }
            }
            if (divisores > 2) {
                System.out.println(num + " no es primo.");
            } else {
                System.out.println(num + " es primo.");
            }
        } else {
            System.out.println(num + " no es primo.");
        }
    }
}
