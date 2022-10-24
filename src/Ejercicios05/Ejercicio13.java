package Ejercicios05;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        int pos = 0, neg = 0, num;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca 10 numeros: ");

        for (int i = 0; i < 10; i++) {
            num = s.nextInt();
            if (num >= 0) {
                pos++;
            } else {
                neg++;
            }

        }
        System.out.println("Hay " + pos + " números positivos y " + neg + " negativos.");

    }
}


