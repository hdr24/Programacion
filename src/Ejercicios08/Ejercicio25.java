package Ejercicios08;

public class Ejercicio25 {
    public static int posicionEnArray(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = Ejercicio20.generaArrayInt(10, 1, 10);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(posicionEnArray(array, 2));
    }
}
