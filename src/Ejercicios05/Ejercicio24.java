package Ejercicios05;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        int filas;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura: ");
        filas = s.nextInt();

        for (int i = 1; i <= filas; ++i) {

            // reasignamos el valor de j y k en cada línea

            int j = 0;
            int k = i;

            // El numero de espacios antes del número lo calculamos restando el numero de la fila actual
            // al número de filas total

            for (int espacios = 1; espacios <= filas - i; ++espacios) {
                System.out.print("  ");
            }

            /*
            Finalmente imprimimos el caracter y calculamos cuantas veces lo imprimimos
            Mientras que j (las veces que se ha impreso el caracter) sea distinto al número de fila actual
            por dos (para que sea una piramide completa) - 1 (para que el número sea impar y se alinee),
            imprimiremos el caracter y un espacio para que se alinee
             */


            while (j != 2 * i - 1) {
                if (j >= i - 1) {
                    System.out.print(k + " ");
                    k--;
                } else {
                System.out.print((j+1) + " ");
                }
                j++;
            }
            // Imprimimos una línea vacía para saltar de línea
            System.out.println();
        }
    }
}