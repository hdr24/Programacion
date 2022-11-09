package Ejercicios08;

public class Ejercicio07 {
    public static int digitoN(int num, int pos) {
        int digito = 0;
        num = Ejercicio06.voltea(num);
        num /= Ejercicio04.potencia(10, (pos));
        digito = num % 10;
        return digito;
    }
}
