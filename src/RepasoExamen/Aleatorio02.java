package RepasoExamen;

import java.util.Scanner;

public class Aleatorio02 {
    public static void main(String[] args) throws InterruptedException {
        final String PIEDRA = "| *|";
        final String PLANTA = "|$ |";
        final String CAMINO = "|  |";
        int longitud, eleccion;
        int giro = (int) (Math.random() * 10) + 10;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la longitud del sendero: ");
        longitud = s.nextInt();
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < giro; j++) {
                System.out.print(" ");
            }
            eleccion = (int) (Math.random() * 10);
            if (eleccion == 1) {
                System.out.println(PIEDRA);
            } else if (eleccion == 2) {
                System.out.println(PLANTA);
            } else {
                System.out.println(CAMINO);
            }
            giro += (int) (Math.random() * 3) - 1;
            Thread.sleep(400);
        }
    }
}
