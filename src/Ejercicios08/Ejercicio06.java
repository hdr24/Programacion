package Ejercicios08;

public class Ejercicio06 {
    public static int voltea(int x) {
        int numReves = 0;
        while (x != 0) {
            numReves += x % 10;
            numReves *= 10;
            x /= 10;
        }
        numReves /= 10;
        return numReves;
    }
}
