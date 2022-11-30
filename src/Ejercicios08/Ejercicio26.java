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

    public static void main(String[] args) {
        int[] array = Ejercicio20.generaArrayInt(10,1, 10);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        array = volteaArrayInt(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
