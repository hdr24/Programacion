package Ejercicios05;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        int num, cont = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num = s.nextInt();
        while (num > 0) {
            // Al dividir entre diez le estamos quitando el ultimo digito de nuestro numero
            num = num / 10;
            cont++;
        }
        System.out.println("Tiene " + cont + " dígitos");
    }
}