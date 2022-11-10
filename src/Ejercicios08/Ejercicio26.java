package Ejercicios08;

public class Ejercicio26 {
    public static int[] volteaArrayInt(int[] array) {
        int[] arrayVolt = new int[array.length];
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            arrayVolt[i] = array[j];
            j--;
        }
        return arrayVolt;
    }
}
