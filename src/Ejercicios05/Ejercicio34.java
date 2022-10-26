package Ejercicios05;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        long num1, num2, numPar = 0, numImpar = 0, numReves1 = 0, numReves2 = 0;
        int digActual;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num1 = s.nextLong();
        System.out.print("Introduzca otro número: ");
        num2 = s.nextLong();

        while (num1 != 0) {
            numReves1 = numReves1 + (num1 % 10);
            num1 = num1 / 10;
            if (num1 != 0) {
                numReves1 = numReves1 * 10;
            }
        }
        while (num2 != 0) {
            numReves2 = numReves2 + (num2 % 10);
            num2 = num2 / 10;
            if (num2 != 0) {
                numReves2 = numReves2 * 10;
            }
        }

        // num 1

        while (numReves1 != 0 && numReves2 != 0) {
            digActual = (int) numReves1 % 10;

            if (digActual % 2 == 0) {
                numPar += digActual;
                numReves1 /= 10;
                numPar *= 10;
            } else {
                numImpar += digActual;
                numReves1 /= 10;
                numImpar *= 10;
            }

            // num2

            digActual = (int) numReves2 % 10;

            if (digActual % 2 == 0) {
                numPar += digActual;
                numReves2 /= 10;
                numPar *= 10;
            } else {
                numImpar += digActual;
                numReves2 /= 10;
                numImpar *= 10;
            }
        }
        System.out.println(numPar/10 + " " + numImpar/10);
    }
}
