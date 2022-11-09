package Ejercicios08;

public class Ejercicio08 {
    public static int posicionDeDigito (int num, int dig) {
        int pos = 1;
        num = Ejercicio06.voltea(num);
        while (num !=0) {
            if (num % 10 == dig) {
                return pos;
            }
            pos++;
            num /= 10;
        }
        return -1;
    }
}
