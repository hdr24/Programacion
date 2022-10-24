package Ejercicios05;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
       int num;
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        num = s.nextInt();
        System.out.println("Numero ----- Cuadrado ------ Cubo");
        for (int i = 0; i < 5; i++){
            System.out.println(num + "             " + (num*num) + "              " + (num*num*num));
            num++;
        }
    }
}
