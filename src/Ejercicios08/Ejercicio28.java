package Ejercicios08;

public class Ejercicio28 {
    public static int[] rotaIzquierdaArrayInt(int[] array, int desp) {
        int[] arrayAux = new int[array.length];
        for (int i = 0; i < array.length - desp; i++) {
            arrayAux[i] = array[i + desp];
        }
        for (int i = 0; i < desp; i++) {
            arrayAux[array.length - 1 - i] = array[i];
        }
        return arrayAux;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        array = rotaIzquierdaArrayInt(array, 3);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
