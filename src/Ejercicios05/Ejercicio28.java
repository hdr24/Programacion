package Ejercicios05;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        int num, fact = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
