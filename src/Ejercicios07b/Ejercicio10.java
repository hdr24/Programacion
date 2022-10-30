package Ejercicios07b;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        String[][] tablero = new String[3][3];
        boolean turno1 = true, turno2, entrada = true;
        int elecC, elecF;
        Scanner s = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = "X";
            }
        }

        System.out.printf("%4s", "");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%4s", i + " ");
        }
        System.out.println();
        System.out.printf("%4s", "");
        System.out.println("┌───┬───┬───┐");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%4s", i + " ");
            System.out.print("│");
            for (int j = 0; j < 3; j++) {

                System.out.printf("%4s", tablero[i][j] + " │");
            }
            if (i != 2) {
                System.out.println();
                System.out.printf("%4s", "");
                System.out.println("├───┼───┼───┤");
            }

        }
        System.out.println();
        System.out.printf("%4s", "");
        System.out.println("└───┴───┴───┘");


        while (entrada) {


            while (turno1) {
                System.out.println("Turno jugador 1");
                System.out.print("Fila: ");
                elecF = s.nextInt();
                System.out.print("Columna:");
                elecC = s.nextInt();

                if ((elecC >= 0 && elecC < 2) && (elecF >= 0 && elecF < 2) ) {


                    if (tablero[elecF][elecC].equals("")) {
                        tablero[elecF][elecC] = "X";
                        System.out.printf("%4s", "");

                        for (int i = 0; i < 3; i++) {
                            System.out.printf("%4s", i + " ");
                        }
                        System.out.println();
                        System.out.printf("%4s", "");
                        System.out.println("┌───┬───┬───┐");
                        for (int i = 0; i < 3; i++) {
                            System.out.printf("%4s", i + " ");
                            System.out.print("│");
                            for (int j = 0; j < 3; j++) {

                                System.out.printf("%4s", tablero[i][j] + " │");
                            }
                            if (i != 2) {
                                System.out.println();
                                System.out.printf("%4s", "");
                                System.out.println("├───┼───┼───┤");
                            }

                        }
                        System.out.println();
                        System.out.printf("%4s", "");
                        System.out.println("└───┴───┴───┘");

                        turno1 = false;
                    } else {
                        System.out.println("Esta posición ya está ocupada");
                    }
                } else {
                    System.out.println("Por favor, introduzca un número entre el 0 y el 2");
                }

            }
        }
    }
}

