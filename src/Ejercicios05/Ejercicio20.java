package Ejercicios05;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        int filas;
        String caracter;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura: ");
        filas = s.nextInt();
        System.out.println("Introduzca un carácter: ");
        caracter = s.next();


        for (int i = 1; i <= filas - 1 ; ++i) {

            // reasignamos la variable j a 0 en cada vuelta

            int j = 0;

            // El numero de espacios antes del número lo calculamos restando el numero de la fila actual
            // al número de filas total

            for (int espacios = 1; espacios <= filas - i; ++espacios) {
                System.out.print("  ");
            }

            while (j != 2 * i - 1) {

                // Imprime el caracter si es la primera o la ultima vuelta

                if ((j == 0) || ( j == 2 * i - 2)) {
                    System.out.print(caracter + " ");
                    ++j;

                // Para una vuelta distinta a la primera o la última imprime un espacio para que sea hueca

                } else {
                    System.out.print("  ");
                    ++j;
                }
            }

            // Imprimimos una línea vacía para saltar de línea
            System.out.println();
        }

        // Finalmente imprimimos la última línea

        for (int j = 0; j < 2 * filas - 1; j++) {
            System.out.print(caracter + " ");
        }
    }
}