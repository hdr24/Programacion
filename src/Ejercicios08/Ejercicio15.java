package Ejercicios08;

public class Ejercicio15 {
    public static void main(String[] args) {
        int prim = 0;

        for (int i = 1; i <= 1000; i++) {
            if (Ejercicio02.esPrimo(i)) {
                System.out.print(i + " ");
                prim++;
            }
            if (prim % 25 == 0 && prim != 0) {
                System.out.println();
                prim++;
            }
        }
    }
}
