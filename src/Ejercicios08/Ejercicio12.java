package Ejercicios08;

public class Ejercicio12 {
    public static int pegaPorDelante(int num, int dig) {
        num = Ejercicio06.voltea(num);
        num = Ejercicio11.pegaPorDetras(num, dig);
        num = Ejercicio06.voltea(num);
        return num;
    }
}