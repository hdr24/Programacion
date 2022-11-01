package Ejercicios07b;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws InterruptedException {
        String[][] tablero = new String[3][3];
        boolean turno1 = true, turno2 = false, entrada = true, empate = false;
        int elecC, elecF, modoJuego;
        Scanner s = new Scanner(System.in);

        System.out.print("Seleccione un modo de juego (1 - vs cpu, 2 - 2 jugadores): ");
        modoJuego = s.nextInt();

        if (modoJuego == 1) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tablero[i][j] = "";
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

                    if ((elecC >= 0 && elecC <= 2) && (elecF >= 0 && elecF <= 2)) {


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

                if (((tablero[0][0].equals(tablero[0][1])) && (tablero[0][0].equals(tablero[0][2])) && (tablero[0][0].equals("X")))
                        || ((tablero[0][0].equals(tablero[1][0])) && (tablero[0][0].equals(tablero[2][0])) && (tablero[0][0].equals("X")))
                        || ((tablero[0][1].equals(tablero[1][1])) && (tablero[0][1].equals(tablero[2][1])) && (tablero[0][1].equals("X")))
                        || ((tablero[0][2].equals(tablero[1][2])) && (tablero[0][2].equals(tablero[2][2])) && (tablero[0][2].equals("X")))
                        || ((tablero[1][0].equals(tablero[1][1])) && (tablero[1][0].equals(tablero[1][2])) && (tablero[1][0].equals("X")))
                        || ((tablero[2][0].equals(tablero[2][1])) && (tablero[2][0].equals(tablero[2][2])) && (tablero[2][0].equals("X")))
                        || ((tablero[2][0].equals(tablero[1][1])) && (tablero[1][1].equals(tablero[0][2])) && (tablero[2][0].equals("X")))
                        || ((tablero[0][0].equals(tablero[1][1])) && (tablero[0][0].equals(tablero[2][2])) && (tablero[0][0].equals("X")))
                ) {
                    System.out.println("Jugador 1 ha ganado");
                    entrada = false;
                } else {
                    empate = true;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (tablero[i][j].equals("")) {
                                empate = false;
                                break;
                            }
                        }
                    }
                    if (empate) {
                        System.out.println("Empate");
                        entrada = false;
                    } else {
                        turno2 = true;
                    }
                }

                while (turno2) {
                    elecC = (int) (Math.random() * 3);
                    elecF = (int) (Math.random() * 3);


                    if (tablero[elecF][elecC].equals("")) {

                        System.out.println("Turno Ordenador");
                        System.out.print("Fila: ");
                        Thread.sleep(500);
                        System.out.println(elecF);
                        Thread.sleep(200);
                        System.out.print("Columna: ");
                        Thread.sleep(500);
                        System.out.println(elecC);
                        Thread.sleep(500);
                        tablero[elecF][elecC] = "◯";
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

                        turno2 = false;
                    }

                }
                if (((tablero[0][0].equals(tablero[0][1])) && (tablero[0][0].equals(tablero[0][2])) && (tablero[0][0].equals("◯")))
                        || ((tablero[0][0].equals(tablero[1][0])) && (tablero[0][0].equals(tablero[2][0])) && (tablero[0][0].equals("◯")))
                        || ((tablero[0][1].equals(tablero[1][1])) && (tablero[0][1].equals(tablero[2][1])) && (tablero[0][1].equals("◯")))
                        || ((tablero[0][2].equals(tablero[1][2])) && (tablero[0][2].equals(tablero[2][2])) && (tablero[0][2].equals("◯")))
                        || ((tablero[1][0].equals(tablero[1][1])) && (tablero[1][0].equals(tablero[1][2])) && (tablero[1][0].equals("◯")))
                        || ((tablero[2][0].equals(tablero[2][1])) && (tablero[2][0].equals(tablero[2][2])) && (tablero[2][0].equals("◯")))
                        || ((tablero[2][0].equals(tablero[1][1])) && (tablero[1][1].equals(tablero[0][2])) && (tablero[2][0].equals("◯")))
                        || ((tablero[0][0].equals(tablero[1][1])) && (tablero[0][0].equals(tablero[2][2])) && (tablero[0][0].equals("◯")))
                ) {
                    System.out.println("El ordenador ha ganado");
                    entrada = false;
                } else {
                    if (!empate)
                        turno1 = true;
                }
            }

        }
        if (modoJuego == 2) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tablero[i][j] = "";
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

                    if ((elecC >= 0 && elecC <= 2) && (elecF >= 0 && elecF <= 2)) {


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

                if (((tablero[0][0].equals(tablero[0][1])) && (tablero[0][0].equals(tablero[0][2])) && (tablero[0][0].equals("X")))
                        || ((tablero[0][0].equals(tablero[1][0])) && (tablero[0][0].equals(tablero[2][0])) && (tablero[0][0].equals("X")))
                        || ((tablero[0][1].equals(tablero[1][1])) && (tablero[0][1].equals(tablero[2][1])) && (tablero[0][1].equals("X")))
                        || ((tablero[0][2].equals(tablero[1][2])) && (tablero[0][2].equals(tablero[2][2])) && (tablero[0][2].equals("X")))
                        || ((tablero[1][0].equals(tablero[1][1])) && (tablero[1][0].equals(tablero[1][2])) && (tablero[1][0].equals("X")))
                        || ((tablero[2][0].equals(tablero[2][1])) && (tablero[2][0].equals(tablero[2][2])) && (tablero[2][0].equals("X")))
                        || ((tablero[2][0].equals(tablero[1][1])) && (tablero[1][1].equals(tablero[0][2])) && (tablero[2][0].equals("X")))
                        || ((tablero[0][0].equals(tablero[1][1])) && (tablero[0][0].equals(tablero[2][2])) && (tablero[0][0].equals("X")))
                ) {
                    System.out.println("Jugador 1 ha ganado");
                    entrada = false;
                } else {
                    empate = true;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (tablero[i][j].equals("")) {
                                empate = false;
                                break;
                            }
                        }
                    }
                    if (empate) {
                        System.out.println("Empate");
                        entrada = false;
                    } else {
                        turno2 = true;
                    }
                }

                while (turno2) {
                    System.out.println("Turno jugador 2");
                    System.out.print("Fila: ");
                    elecF = s.nextInt();
                    System.out.print("Columna:");
                    elecC = s.nextInt();

                    if ((elecC >= 0 && elecC <= 2) && (elecF >= 0 && elecF <= 2)) {


                        if (tablero[elecF][elecC].equals("")) {
                            tablero[elecF][elecC] = "◯";
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

                            turno2 = false;
                        } else {
                            System.out.println("Esta posición ya está ocupada");
                        }
                    } else {
                        System.out.println("Por favor, introduzca un número entre el 0 y el 2");
                    }

                }
                if (((tablero[0][0].equals(tablero[0][1])) && (tablero[0][0].equals(tablero[0][2])) && (tablero[0][0].equals("◯")))
                        || ((tablero[0][0].equals(tablero[1][0])) && (tablero[0][0].equals(tablero[2][0])) && (tablero[0][0].equals("◯")))
                        || ((tablero[0][1].equals(tablero[1][1])) && (tablero[0][1].equals(tablero[2][1])) && (tablero[0][1].equals("◯")))
                        || ((tablero[0][2].equals(tablero[1][2])) && (tablero[0][2].equals(tablero[2][2])) && (tablero[0][2].equals("◯")))
                        || ((tablero[1][0].equals(tablero[1][1])) && (tablero[1][0].equals(tablero[1][2])) && (tablero[1][0].equals("◯")))
                        || ((tablero[2][0].equals(tablero[2][1])) && (tablero[2][0].equals(tablero[2][2])) && (tablero[2][0].equals("◯")))
                        || ((tablero[2][0].equals(tablero[1][1])) && (tablero[1][1].equals(tablero[0][2])) && (tablero[2][0].equals("◯")))
                        || ((tablero[0][0].equals(tablero[1][1])) && (tablero[0][0].equals(tablero[2][2])) && (tablero[0][0].equals("◯")))
                ) {
                    System.out.println("Jugador 2 ha ganado");
                    entrada = false;
                } else {
                    if (!empate)
                        turno1 = true;
                }
            }
        }
    }
}