package Ejercicios08;

public class Ejercicio02 {
    public static boolean esPrimo(int num) {
        int div = 0;

        if (num < 2)
            return false;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                div++;
            }
        }
        return div <= 2;
    }
}
