package Ejercicios05;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        float num = 0;
        float totalImpar = 0;
        int contImpar = 0;
        float mayorPar = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca los números: ");
        while (num >= 0) {
            num = s.nextFloat();

            if (num >= 0) {
                if ((num % 2 == 0) && (num > mayorPar)) {
                    mayorPar = num;
                } else {
                    totalImpar += num;
                    contImpar++;
                }
            }
        }
        System.out.println("El par mayor es " + mayorPar + " y la media de los impares es " + (totalImpar/contImpar));
    }
}
