package Ejercicios07b;

public class Ejercicio05 {

    public static void main(String[] args) {


        int[][] num = new int[6][10];
        int min = 1000, max = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                num[i][j] = (int) (Math.random() * 1001);
                if (num[i][j] > max) {
                    max = num[i][j];
                }
                if (num[i][j] < min) {
                    min = num[i][j];
                }
            }
        }
        System.out.printf("%10s", "");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%10s", "Columna " + i);
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.printf("%10s", "Fila " + i);
            for (int j = 0; j < 10; j++) {
                System.out.printf("%10s", num[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (num[i][j] == min) {
                    System.out.println("El mínimo está en la posición " + i + "," + j);
                }
                if (num[i][j] == max) {
                    System.out.println("El máximo esta en la posición " + i + "," + j);
                }
            }
        }
    }
}
