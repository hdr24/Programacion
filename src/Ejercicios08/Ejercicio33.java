package Ejercicios08;

public class Ejercicio33 {
    public static boolean esPuntodeSilla(int[][]array, int num) {
        int[] coor = Ejercicio32.coordenadasEnArrayBiInt(array, num);
        int[] fila = Ejercicio30.filaDeArrayBiInt(array, coor[0]);
        int[] colum = Ejercicio31.columnaArrayBiInt(array, coor[1]);

        return num == Ejercicio21.minimoArrayInt(fila) && num == Ejercicio22.maximoArrayInt(colum);
    }

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 10;
        array[0][1] = 12;
        array[0][2] = 23;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
        System.out.println(esPuntodeSilla(array, 10));
    }
}
