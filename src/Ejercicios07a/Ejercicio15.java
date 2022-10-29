package Ejercicios07a;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        int[] ocupacion = new int[10];
        int grupo;
        boolean entrada = true, hay0, hayMesa;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            ocupacion[i] = (int) (Math.random() * 5);
        }
        System.out.println("┌──────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
        System.out.print("|");
        System.out.printf("%11s", "Mesa nº |");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3s", i + 1);
            System.out.print(" |");
        }
        System.out.println("\n├──────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
        System.out.print("|");
        System.out.printf("%11s", "Ocupación |");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3s", ocupacion[i]);
            System.out.print(" |");
        }
        System.out.println("\n└──────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");


        while (entrada) {

            System.out.println("¿Cuantos son? (Introduzca -1 para salir del programa): ");
            grupo = s.nextInt();

            if (grupo > 0) {

                if (grupo > 4) {
                    System.out.println("Lo siento, solo admitimos grupos de 4 personas máximo");
                } else {

                    hay0 = false;
                    hayMesa = false;

                    for (int i = 0; i < 10; i++) {
                        if (ocupacion[i] == 0) {
                            ocupacion[i] = grupo;
                            System.out.println("Siéntense en la mesa " + (i + 1));
                            hay0 = true;
                            break;
                        }
                    }
                    if (!hay0) {
                        for (int i = 0; i < 10; i++) {
                            if (ocupacion[i] + grupo < 5) {
                                ocupacion[i] += grupo;
                                System.out.println("Tendrán que compartir la mesa " + (i + 1));
                                hayMesa = true;
                                break;
                            }
                        }
                    }
                    if (!hay0 && !hayMesa) {
                        System.out.println("Lo sentimos, en este momento no tenemos mesa disponible");
                    }
                }
                System.out.println("┌──────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
                System.out.print("|");
                System.out.printf("%11s", "Mesa nº |");
                for (int i = 0; i < 10; i++) {
                    System.out.printf("%3s", i + 1);
                    System.out.print(" |");
                }
                System.out.println("\n├──────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
                System.out.print("|");
                System.out.printf("%11s", "Ocupación |");
                for (int i = 0; i < 10; i++) {
                    System.out.printf("%3s", ocupacion[i]);
                    System.out.print(" |");
                }
                System.out.println("\n└──────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
            } else {
                entrada = false;
            }
        }
    }
}
