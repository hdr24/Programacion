package Ejercicios08;

public class Ejercicio29 {
    public static int[][] generaArrayBiInt(int tamY, int tamX, int min, int max) {
        int[][] array = new int[tamY][tamX];
        for (int i = 0; i < tamY; i++) {
            for (int j = 0; j < tamX; j++) {
                array[i][j] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = generaArrayBiInt(20,20,0,1);
        for (int i = 0; i < 20; i++) {
            System.out.println();
            for (int j = 0; j < 20; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
