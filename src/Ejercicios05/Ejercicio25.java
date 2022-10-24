package Ejercicios05;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        int num, numReves = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num = s.nextInt();
        while (num != 0) {
            numReves = numReves + (num % 10);
            num = num / 10;
            if (num != 0) {
                numReves = numReves * 10;
            }
        }
        System.out.println("El número al revés es " + numReves);
    }
}
