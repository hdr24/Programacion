package Ejercicios07b;

public class Ejercicio09 {

    public static void main(String[] args) {
        int[][] num = new int[12][12];
        int[][] numRot = new int[12][12];

        System.out.println("Array original");
        for (int i = 0; i < 12; i++) {
            System.out.println();
            for (int j = 0; j < 12; j++) {
                num[i][j] = (int) (Math.random() * 101);
                System.out.printf("%5s", num[i][j] + " ");
            }
        }

        // Rota el array

        numRot[0][0] = num[11][11];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (j != 0) {
                    numRot[i][j] = num[i][j - 1];
                } else {
                    if (i != 0) {
                        numRot[i][j] = num[i - 1][11];
                    }
                }
            }
        }

        // Imprime el array rotado

        System.out.println("\nArray rotado");
        for (int i = 0; i < 12; i++) {
            System.out.println();
            for (int j = 0; j < 12; j++) {
                System.out.printf("%5s", numRot[i][j] + " ");
            }
        }
    }
}