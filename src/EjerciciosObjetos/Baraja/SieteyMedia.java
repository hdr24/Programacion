package EjerciciosObjetos.Baraja;

import java.util.Scanner;

public class SieteyMedia {
    public static void main(String[] args) {

        Baraja baraja = new Baraja(1, true);

        boolean entrada = true;
        double puntuacion = 0;
        Scanner s = new Scanner(System.in);
        int opcion;



        do {
            Carta cartaActual = baraja.robar();
            System.out.println("Carta: " + cartaActual.nombreCarta());
            puntuacion += cartaActual.valor7ymedia();
            System.out.println("Puntuacion: " + puntuacion);

            if (puntuacion > 7.5) {
                System.out.println("Te has pasado");
                break;
            }

            System.out.println("Te plantas?");
            System.out.println("1. Si");
            System.out.println("2. No");
            opcion = s.nextInt();

            if (opcion == 1) {
                System.out.println("Tu puntacion final es: " + puntuacion);
                entrada = false;
            } else if (opcion != 2) {
                System.out.println("Opcion incorrecta, sigues jugando");
            }
            System.out.println();
        } while (entrada);
    }
}
