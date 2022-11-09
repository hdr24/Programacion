package Ejercicios08;

public class Ejercicio10 {
    public static int quitaPorDelante(int num, int dig) {
        num = Ejercicio06.voltea(num);
        num = Ejercicio09.quitaPorDetras(num, dig);
        num = Ejercicio06.voltea(num);
        return num;
    }
}
