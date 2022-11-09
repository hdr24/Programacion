package Ejercicios08;


public class Ejercicio01 {
    public static boolean esCapicua(int x) {
        int numReves = Ejercicio06.voltea(x);
        int num = x;
        while (num != 0) {
            if (num % 10 != numReves % 10) {
                return false;
            }
            num /= 10;
            numReves /= 10;
        }
        return true;
    }
}
