package Ejercicios05;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        int total = 0, digActual;
        long num, numReves = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        num = s.nextLong();

        while (num != 0) {
            numReves = numReves + (num % 10);
            num = num / 10;
            if (num != 0) {
                numReves = numReves * 10;
            }
        }
        System.out.print("Los dígitos pares son: ");
        while ( numReves != 0 ){
            digActual = (int) (numReves % 10);
            if (digActual % 2 == 0) {
                System.out.print(digActual + " ");
                total += digActual;
            }
            numReves /= 10;
        }
        System.out.println("\n" + "La suma de los digitos pares es: " + total);
    }
}
