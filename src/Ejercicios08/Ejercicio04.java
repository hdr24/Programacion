package Ejercicios08;

public class Ejercicio04 {
    public static int potencia(int base, int exp) {
        int resultado = 1;
        for (int i = 0; i < exp; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
