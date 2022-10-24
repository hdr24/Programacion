package Ejercicios05;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        int num, numReves = 0, dig, pos = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num = s.nextInt();
        System.out.println("Introduzca un dígito: ");
        dig = s.nextInt();

        while (num != 0) {
            numReves = numReves + (num % 10);
            num = num / 10;
            if (num != 0) {
                numReves = numReves * 10;
            }
        }
        while (numReves != 0) {
            if (numReves % 10 == dig) {
                System.out.println("El digito está en la posición " + pos);
            }
            pos++;
            numReves /= 10;
        }
    }
}
