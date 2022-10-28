package Ejercicios07;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        int[] temp = new int[12];
        String[] mes = new String[12];
        Scanner s = new Scanner(System.in);
        mes[0] = "enero";
        mes[1] = "febrero";
        mes[2] = "marzo";
        mes[3] = "abril";
        mes[4] = "mayo";
        mes[5] = "junio";
        mes[6] = "julio";
        mes[7] = "agosto";
        mes[8] = "septiembre";
        mes[9] = "octubre";
        mes[10] = "noviembre";
        mes[11] = "diciembre";

        for (int i = 0; i < 12; i++) {
            System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
            temp[i] = s.nextInt();
        }
        for (int i = 0; i < 12; i++) {
            System.out.printf("%10s ", mes[i]);
            System.out.print(" |");
            for (int j = 0; j < temp[i]; j++) {
                System.out.print("=");
            }
            System.out.println("");
        }
        System.out.println("            |----------------------------------------------");
        System.out.println("                      10         20        30        40");
    }
}
