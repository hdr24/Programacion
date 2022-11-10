package Ejercicios08;

import java.util.Scanner;

public class Pruebas {

    /*
    TODO Ex13
    TODO Ex14
    TODO Ex17
    TODO Ex18
    TODO Ex19
    TODO Ex23
    TODO Ex27
    TODO Ex28
    TODO Ex29
    TODO Ex30
    TODO Ex31
    TODO Ex32
    TODO Ex33
    TODO Ex34
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = {1, 2, 3, 24, -4, 5, 6, 5, 2, 0, 8, 3, 9, 4, 10};
        array = (Ejercicio26.volteaArrayInt(array));
        for (int j : array) {
            System.out.println(j);
        }

    }
}
