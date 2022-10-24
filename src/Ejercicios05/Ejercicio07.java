package Ejercicios05;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        int combinacion = 3532;
        int combIntroducida;
        int intentos = 0;
        Scanner s = new Scanner(System.in);
        boolean abierto = false;

        while (!abierto && intentos < 4) {
            System.out.print("Introduzca la combinación de la caja fuerte: ");
            combIntroducida = s.nextInt();

            if (combIntroducida == combinacion) {
                System.out.println("La caja se ha abierto satisfactoriamente");
                abierto = true;

            } else {
                System.out.println("Lo siento, esa no es la combinación");
                intentos++;
            }
        }
        s.close();
    }
}
