package Ejercicios08;

public class Ejercicio31 {
    public static int[] columnaArrayBiInt(int[][] array, int colum) {
        int[] columArray = new int[array[0].length];
        for (int i = 0; i < array[1].length; i++) {
            columArray[i] = array[i][colum];
        }
        return columArray;
    }

    public static void main(String[] args) {
        int[][] array = Ejercicio29.generaArrayBiInt(5, 5, 0, 9);

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println("\n");
        int[] fila2 = columnaArrayBiInt(array, 4);

        for (int i = 0; i < 5; i++) {
            System.out.print(fila2[i] + " ");
        }
    }
}
