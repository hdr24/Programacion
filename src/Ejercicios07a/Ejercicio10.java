package Ejercicios07a;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] num = new int[20];
        int[] numOrden = new int[20];
        int j = 0, k = 19;
        System.out.println("Array original: ");
        for (int i = 0; i < 20; i++) {
            num[i] = (int) (Math.random() * 101);
            System.out.print(num[i] + " ");
        }


        for (int i = 0; i < 20; i++) {
            if (num[i] % 2 == 0) {
                numOrden[j]= num[i];
                j++;
            } else {
                numOrden[k] = num[i];
                k--;
            }
        }

        System.out.println("\nArray ordenado: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(numOrden[i] + " ");
        }
    }
}
