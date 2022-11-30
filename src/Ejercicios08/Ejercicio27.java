package Ejercicios08;

public class Ejercicio27 {
    public static int[] rotaDerechaArrayInt(int[] array, int desp) {
        int[] arrayAux = new int[array.length];
        for (int i = desp; i < array.length; i++) {
            arrayAux[i] = array[i - desp];
        }
        int j = 0;
        for (int i = desp; i > 0; i--) {
            arrayAux[desp - i] = array[array.length - 1 - j];
            j++;
        }
        return arrayAux;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        array = rotaDerechaArrayInt(array, 4);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
