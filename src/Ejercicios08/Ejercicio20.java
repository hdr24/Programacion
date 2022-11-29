package Ejercicios08;

public class Ejercicio20 {
    public static int[] generaArrayInt(int tam, int min, int max) {
        int[] array = new int[tam];
        for (int i = 0; i < tam; i++) {
            array[i] = (int ) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = generaArrayInt(20, 1, 100);
        for (int i = 0; i < 20; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n" + Ejercicio21.minimoArrayInt(array));
        System.out.println(Ejercicio22.maximoArrayInt(array));
    }
}
