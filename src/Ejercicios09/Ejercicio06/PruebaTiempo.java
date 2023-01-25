package Ejercicios09.Ejercicio06;

public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo(0, 62, 62);
        System.out.println(tiempo);

        tiempo.suma(2,30,58);
        System.out.println(tiempo);

        tiempo.resta(4,0,121);
        System.out.println(tiempo);
    }
}
