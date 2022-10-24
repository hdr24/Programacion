package Ejercicios05;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int base, exp;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la base: ");
        base = s.nextInt();
        System.out.println("Introduzca el exponente: ");
        exp = s.nextInt();
        int resultado = base;
        while (exp < 0) {
            System.out.println("El exponente debe ser entero y positivo, vuelva a introducirlo: ");
            exp = s.nextInt();
        }
        if (exp != 0) {
            for (int i = 0; i < exp - 1; i++) {
                resultado = resultado * base;
            }
            System.out.println(resultado);
        } else {
            System.out.println(1);
        }
    }
}
