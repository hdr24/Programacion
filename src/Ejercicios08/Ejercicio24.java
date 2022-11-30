package Ejercicios08;

public class Ejercicio24 {
    public static boolean estaEnArrayInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = Ejercicio20.generaArrayInt(10,1,10);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        };
        System.out.println(estaEnArrayInt(array, 10));
    }
}
