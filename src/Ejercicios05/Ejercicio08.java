package Ejercicios05;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num = s.nextInt();
        System.out.println("La tabla de multiplicar del " + num + " es:");
        for (int i = 0; i < 11; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }

        s.close();
    }
}
