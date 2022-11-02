package RepasoExamen;

import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Aleatorio01 {
    public static void main(String[] args) throws InterruptedException, IOException {
        int dado1, dado2, apuesta, suma, sumaInic;
        Scanner s = new Scanner(System.in);
        boolean entrada = false;

        System.out.print("¿Cuánto dinero quieres apostar? ");
        apuesta = s.nextInt();
        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;
        suma = dado1 + dado2;
        sumaInic = suma;

        System.out.print("Dado 1: ");
        Thread.sleep(700);
        System.out.println(dado1);
        System.out.print("Dado 2: ");
        Thread.sleep(700);
        System.out.println(dado2);
        System.out.println("Suma: " + suma);
        if (suma == 7) {
            System.out.println("Enhorabuena, ha doblado su dinero");
            System.out.println("Ahora tiene " + apuesta * 2);
        } else if (suma == 3) {
            System.out.println("Lo siento, ha perdido todo su dinero");
        } else {
            entrada = true;
        }

        if (entrada) {
            System.out.println("Tiene que seguir tirando, debe conseguir un " + sumaInic + " para ganar");
            System.out.println("Si obtiene un 7 perderá la partida");
            System.out.println("Presione INTRO para continuar");
            System.in.read();
        }

        while (entrada) {
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            suma = dado1 + dado2;
            System.out.print("Dado 1: ");
            Thread.sleep(700);
            System.out.println(dado1);
            System.out.print("Dado 2: ");
            Thread.sleep(700);
            System.out.println(dado2);
            System.out.println("Suma: " + suma);

            if (suma == sumaInic) {
                System.out.println("Enhorabuena, ha doblado su dinero");
                System.out.println("Ahora tiene " + apuesta * 2);
                entrada = false;
            } else if (suma == 7) {
                System.out.println("Lo siento, ha perdido todo su dinero");
                entrada = false;
            } else {
                System.out.println("Debe seguir jugando");
                System.out.println("Presione INTRO para continuar");
                System.in.read();
            }
        }
    }
}