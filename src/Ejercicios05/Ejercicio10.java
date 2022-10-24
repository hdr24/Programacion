package Ejercicios05;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        float num = 0;
        float total = 0;
        int contadorNum = -1;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca los números: ");
        while (num >= 0) {
            total += num;
            contadorNum++;
            num = s.nextFloat();

        }
        System.out.println(total);
        System.out.println(contadorNum);
        System.out.println("La media de los numeros es : " + (total/contadorNum));

        s.close();
    }
}
