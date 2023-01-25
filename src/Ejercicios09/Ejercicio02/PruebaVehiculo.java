package Ejercicios09.Ejercicio02;

import java.util.Scanner;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Bicicleta biciRoja = new Bicicleta("rojo", 2, 10);
        Coche cocheRojo = new Coche("Nissan", "Qashqai", "rojo", 1000);

        boolean entrada = true;
        while (entrada) {
            System.out.println("Vehiculos");
            System.out.println("==========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opcion (1-8):");

            int opt = s.nextInt();

            switch (opt) {
                case 1:
                    biciRoja.anda(10);
                    break;
                case 2:
                    biciRoja.caballito();
                    break;
                case 3:
                    cocheRojo.anda(100);
                    break;
                case 4:
                    cocheRojo.quemaRueda();
                    break;
                case 5:
                    System.out.println(biciRoja.kilometrosRecorridos);
                    break;
                case 6:
                    System.out.println(cocheRojo.kilometrosRecorridos);
                    break;
                case 7:
                    System.out.println(Vehiculo.getKilometrosTotales());
                    break;
                case 8:
                    entrada = false;
                    break;
                default:
                    System.out.println("No ha elegido una opcion correcta");
                    break;
            }
        }
    }
}
