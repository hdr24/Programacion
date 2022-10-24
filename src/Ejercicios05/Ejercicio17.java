package Ejercicios05;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        int num, total = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número ");
        num = s.nextInt();
        if (num >= 0) {
            num++;
            for (int i = 0; i < 100; i++) {
            total = total + num;
            num++;
            }
            System.out.println("La suma de los 100 siguientes números al número introducido es: " + total);
        } else {
            System.out.println("El número introducido debe ser positivo");
        }
    }
}
