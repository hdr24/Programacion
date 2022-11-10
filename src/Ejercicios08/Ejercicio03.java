package Ejercicios08;

public class Ejercicio03 {
    public static int siguientePrimo(int num) {
        while (true) {
            num++;
            if (Ejercicio02.esPrimo(num)) {
                return num;
            }
        }
    }
}
