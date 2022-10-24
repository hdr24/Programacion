package Ejercicios05;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        int num, suma = 0, cont = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número");
        num = s.nextInt();
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0) {
                suma += i;
                cont++;
            }
        }
        System.out.println("Hay " + cont + " múltiplos de 3 entre 1 y " + num + " y la suma de ellos es " + suma);
    }
}
