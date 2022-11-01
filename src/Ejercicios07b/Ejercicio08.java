package Ejercicios07b;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        String[][] tablero = new String[8][8];
        int k = 8, x = 0, y = 0, z, w;
        String posAlfil;
        boolean posCorrecta = false;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                switch (j) {
                    case 0:
                        tablero[i][j] = "a" + k;
                        break;
                    case 1:
                        tablero[i][j] = "b" + k;
                        break;
                    case 2:
                        tablero[i][j] = "c" + k;
                        break;
                    case 3:
                        tablero[i][j] = "d" + k;
                        break;
                    case 4:
                        tablero[i][j] = "e" + k;
                        break;
                    case 5:
                        tablero[i][j] = "f" + k;
                        break;
                    case 6:
                        tablero[i][j] = "g" + k;
                        break;
                    case 7:
                        tablero[i][j] = "h" + k;
                        break;

                }

            }
            k--;
        }


        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
        }
        System.out.print("\nIntroduzca la posición del alfil: ");
        posAlfil = s.next();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (posAlfil.equals(tablero[i][j])) {
                    posCorrecta = true;
                    x = i;
                    y = j;
                    break;

                }
            }
        }

        if (posCorrecta) {
            System.out.println("El alfil se puede mover a las siguientes posiciones: ");

            z = x;
            w = y;
            while ((z + 1 < 8) && (w + 1 < 8)) {
                z++;
                w++;
                System.out.print(tablero[z][w] + " ");
            }

            z = x;
            w = y;
            while ((z - 1 >= 0) && (w - 1 >= 0)) {
                z--; w--;
                System.out.print(tablero[z][w] + " ");
            }

            z = x;
            w = y;

            while ((z + 1 < 8) && (w - 1 >= 0)) {
                z++; w--;
                System.out.print(tablero[z][w] + " ");
            }
            z = x;
            w = y;
            while ((z - 1 >= 0) && (w + 1 < 8)) {
                z--; w++;
                System.out.print(tablero[z][w] + " ");
            }

        } else {
            System.out.println("No ha introducido una posición correcta)");
        }
    }
}
