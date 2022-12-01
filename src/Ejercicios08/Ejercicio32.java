package Ejercicios08;

import java.util.Arrays;

public class Ejercicio32 {
    public static int[] coordenadasEnArrayBiInt(int[][]array, int num) {
        int[] coor;
        for (int i = 0; i < array[0].length ; i++) {
            for (int j = 0; j < array[1].length; j++) {
                if (array[i][j] == num) {
                    coor = new int[]{i, j};
                    return coor;
                }
            }
        }
        coor = new int[]{-1, -1};
        return coor;
    }

    public static void main(String[] args) {
        int[][] array = Ejercicio29.generaArrayBiInt(2, 2, 0, 9);
        for (int i = 0; i < 2; i++) {
            System.out.println();
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println(Arrays.toString(coordenadasEnArrayBiInt(array, 2)));
    }
}
