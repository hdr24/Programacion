package Ejercicios08;

public class Ejercicio30 {
    public static int[] filaDeArrayBiInt(int[][] array, int fila) {
        int[]filaArray = new int[array[1].length];
        for (int i = 0; i < array[1].length; i++) {
            filaArray[i] = array[fila][i];
        }
        return filaArray;
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
        int[] fila2 = filaDeArrayBiInt(array, 1);

        for (int i = 0; i < 5; i++) {
            System.out.print(fila2[i] + " ");
        }
    }
}
