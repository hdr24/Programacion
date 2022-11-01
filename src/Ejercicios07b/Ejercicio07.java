package Ejercicios07b;

import java.util.Scanner;

public class Ejercicio07 {
    /**
     * Minijuego "Busca el tesoro"
     * <p>
     * Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
     * cuatro filas por cinco columnas. El usuario intentará averiguar dónde
     * está el tesoro.
     */
    // se definen constantes para representar el
// contenido de las celdas
    static final int VACIO = 0;
    static final int MINA = 1;
    static final int TESORO = 2;
    static final int INTENTO = 3;

    public static void main(String[] args) {
        int x;
        int y;
        int[][] cuadrante = new int[5][4];

        Scanner s = new Scanner(System.in);
// inicializa el array
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 3; y++) {
                cuadrante[x][y] = VACIO;
            }
        }
// coloca la mina
        int minaX = (int) (Math.random() * 4);
        int minaY = (int) (Math.random() * 3);
        cuadrante[minaX][minaY] = MINA;
// coloca el tesoro
        int tesoroX;

        int tesoroY;
        do {
            tesoroX = (int) (Math.random() * 4);
            tesoroY = (int) (Math.random() * 3);
        } while ((minaX == tesoroX) && (minaY == tesoroY));
        cuadrante[tesoroX][tesoroY] = TESORO;
// juego
        System.out.println("¡BUSCA EL TESORO!");
        boolean salir = false;
        String c = "";
        do {
// pinta el cuadrante
            for (y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for (x = 0; x < 5; x++) {
                    if (cuadrante[x][y] == INTENTO)
                        System.out.print("X ");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println(" ----------\n 0 1 2 3 4\n");
// pide las coordenadas
            System.out.print("Coordenada x: ");
            x = s.nextInt();
            System.out.print("Coordenada y: ");
            y = s.nextInt();
// mira lo que hay en las coordenadas indicadas por el usuario
            switch (cuadrante[x][y]) {
                case VACIO:
                    cuadrante[x][y] = INTENTO;
                    break;
                case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                    break;
                case TESORO:
                    System.out.println("Enhorabuena, has encontrado el tesoro.");
                    salir = true;
                    break;
                default:
            }
            // Comprueba si hay mina cerca

            if (x != 0 && y != 0 && x != 4 && y != 3) {
                if (
                        cuadrante[x - 1][y - 1] == MINA ||
                                cuadrante[x][y - 1] == MINA ||
                                cuadrante[x][y + 1] == MINA ||
                                cuadrante[x + 1][y + 1] == MINA ||
                                cuadrante[x + 1][y] == MINA ||
                                cuadrante[x + 1][y - 1] == MINA ||
                                cuadrante[x - 1][y] == MINA ||
                                cuadrante[x - 1][y + 1] == MINA
                ) {
                    System.out.println("Cuidado, hay una mina cerca");
                }

            }
            if (x == 0) {
                if (y == 0) {
                    if (
                            cuadrante[1][1] == MINA ||
                                    cuadrante[1][0] == MINA ||
                                    cuadrante[0][1] == MINA
                    ) {
                        System.out.println("Cuidado, hay una mina cerca");
                    }
                } else {
                    if (y == 3) {
                        if (cuadrante[0][2] == MINA ||
                                cuadrante[1][2] == MINA ||
                                cuadrante[1][3] == MINA) {
                            System.out.println("Cuidado, hay una mina cerca");
                        }
                    } else {
                        if (
                                cuadrante[x][y - 1] == MINA ||
                                        cuadrante[x][y + 1] == MINA ||
                                        cuadrante[x + 1][y + 1] == MINA ||
                                        cuadrante[x + 1][y] == MINA ||
                                        cuadrante[x + 1][y - 1] == MINA
                        ) {
                            System.out.println("Cuidado, hay una mina cerca");
                        }
                    }
                }
            }
            if (x == 4) {
                if (y == 3) {
                    if (cuadrante[4][2] == MINA ||
                            cuadrante[3][3] == MINA ||
                            cuadrante[3][2] == MINA) {
                        System.out.println("Cuidado, hay una mina cerca");

                    }
                } else {
                    if (y != 0) {
                        if (
                                cuadrante[x - 1][y - 1] == MINA ||
                                        cuadrante[x][y - 1] == MINA ||
                                        cuadrante[x][y + 1] == MINA ||
                                        cuadrante[x - 1][y] == MINA ||
                                        cuadrante[x - 1][y + 1] == MINA
                        ) {
                            System.out.println("Cuidado, hay una mina cerca");
                        } else {
                            if (
                                    cuadrante[3][0] == MINA ||
                                            cuadrante[3][1] == MINA ||
                                            cuadrante[4][1] == MINA
                            ) {
                                System.out.println("Cuidado, hay una mina cerca");
                            }

                        }
                    }
                }
            }
            if ((y == 0) && (x == 1 || x == 2 || x == 3)) {
                if (
                        cuadrante[x][y + 1] == MINA ||
                                cuadrante[x + 1][y + 1] == MINA ||
                                cuadrante[x + 1][y] == MINA ||
                                cuadrante[x - 1][y] == MINA ||
                                cuadrante[x - 1][y + 1] == MINA
                ) {
                    System.out.println("Cuidado, hay una mina cerca");
                }
            }
            if ((y == 3) && (x == 1 || x == 2 || x == 3)) {
                if (
                        cuadrante[x - 1][y - 1] == MINA ||
                                cuadrante[x][y - 1] == MINA ||
                                cuadrante[x + 1][y] == MINA ||
                                cuadrante[x + 1][y - 1] == MINA ||
                                cuadrante[x - 1][y] == MINA
                ) {
                    System.out.println("Cuidado, hay una mina cerca");
                }
            }
        } while (!salir);
// pinta el cuadrante
        for (y = 3; y >= 0; y--) {
            System.out.print(y + " ");
            for (x = 0; x < 5; x++) {
                switch (cuadrante[x][y]) {
                    case VACIO:
                        c = " ";
                        break;
                    case MINA:
                        c = "* ";
                        break;
                    case TESORO:
                        c = "€ ";
                        break;
                    case INTENTO:
                        c = "x ";
                        break;
                    default:
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println(" ----------\n 0 1 2 3 4\n");
    }
}
