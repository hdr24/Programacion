package Ejercicios08;

public class Ejercicio05 {
    public static int digitos(int x) {
        int dig = 0;
        while (x != 0) {
            dig++;
            x /= 10;
        }
        return dig;
    }
}
