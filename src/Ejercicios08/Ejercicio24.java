package Ejercicios08;

public class Ejercicio24 {
    public static boolean estaEnArrayInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return true;
        }
        return false;
    }
}
