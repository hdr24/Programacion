package Ejercicios08;

public class Ejercicio25 {
    public static int posicionEnArray(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return i;
        }
        return -1;
    }
}
