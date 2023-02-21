package Ejercicios09.Ejercicio07;

import java.util.Scanner;

public class ExpoCochesCampanillas {
    public static void main(String[] args) {
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        Scanner s = new Scanner(System.in);
        int numEntradas;
        boolean entrada = true;

        while (entrada) {
            System.out.println("\n1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");

            int opcion = s.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Zona principal: " + principal.getEntradasPorVender());
                    System.out.println("Zona compra-venta: " + compraVenta.getEntradasPorVender());
                    System.out.println("Zona VIP: " + vip.getEntradasPorVender());
                }
                case 2 -> {
                    System.out.println("Indique la zona para la que desea vender: ");
                    System.out.println("1. Zona principal");
                    System.out.println("2. Zona compra-venta");
                    System.out.println("3. Zona VIP");
                    opcion = s.nextInt();
                    System.out.println("Indique el numero de entradas que desea vender: ");
                    numEntradas = s.nextInt();
                    switch (opcion) {
                        case 1 -> principal.vender(numEntradas);
                        case 2 -> compraVenta.vender(numEntradas);
                        case 3 -> vip.vender(numEntradas);
                        default -> System.out.println("No ha elegido una zona correcta");
                    }
                }
                case 3 -> entrada = false;
                default -> System.out.println("No ha elegido una opción correcta");
            }
        }
        s.close();
    }
}
