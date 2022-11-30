package Ejercicios08;

public class Ejercicio23 {
    public static float mediaArrayInt(int[] array) {
        float total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        total /= array.length;
        return total;
    }

    public static void main(String[] args) {
        int[] array = Ejercicio20.generaArrayInt(10,2,8);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(mediaArrayInt(array));
    }
}
