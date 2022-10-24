package Ejercicios05;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el primer número");
        num1 = s.nextInt();
        System.out.println("Introduzca el segundo número");
        num2 = s.nextInt();
        if (num1 != num2) {
            if (num1 < num2) {
                System.out.println("Los numeros comprendidos entre " + num1 + " y " + num2 + " de 7 en 7 son:");
                while (num2 >= num1) {
                    System.out.println(num1);
                    num1 += 7;
                }
            } else {
                System.out.println("Los numeros comprendidos entre " + num2 + " y " + num1 + " de 7 en 7 son:");
                while (num1 >= num2) {
                    System.out.println(num2);
                    num2 += 7;
                }
            }
        } else {
            System.out.println("Los números deben ser distintos");
        }
    }
}
