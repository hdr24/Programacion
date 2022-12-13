package Ejercicios08;

public class Ejercicio34 {
    public static int[] diagonal (int[][] array, int fila, int col, String dir) {
        // Comprobamos que el string pedido es correcto o si la fila o columna estan out of bounds
        if (!(dir.equals("nose") || dir.equals("neso")) || fila > array.length || col > array.length) {
            return new int[]{-1};
        }
        return new int[]{-2};
    }

    public static void main(String[] args) {

    }
}
