package Ejercicios05;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        int num, total = 0, cont = 0;
        boolean entrada = true;
        Scanner s = new Scanner(System.in);
        System.out.println("Vaya introduciendo números hasta que su suma exceda 10000");
        while (entrada) {
            num = s.nextInt();
            if ((total + num) >= 10000) {
                entrada = false;
            } else {
                total += num;
                cont++;
            }
        }
        System.out.println("El total acumulado es " + total);
        System.out.println("Ha introducido " + cont + " números");
        System.out.println("La media de los números introducidos es " + total/cont);
    }
}
