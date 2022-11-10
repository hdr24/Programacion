package Ejercicios08;

public class Ejercicio20 {
    public static int[] generaArrayInt(int tam, int min, int max) {
        int[] array = new int[tam];
        for (int i = 0; i < tam; i++) {
            array[i] = (int ) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }
}
