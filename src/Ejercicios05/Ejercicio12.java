package Ejercicios05;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int num;
        int sucesion = 1;
        int sucesionAnterior = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        num = s.nextInt();
        System.out.println(0);
        System.out.println(1);
        for (int i = 0; i < num-2; i++) {
            System.out.println(sucesion);
            sucesionAnterior = sucesion - sucesionAnterior;
            sucesion += sucesionAnterior;
        }
    }
}
