package EjerciciosObjetos.Animales;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner s = new Scanner(System.in);
        boolean entrada = true;
        String nombre;
        LocalDate fecha;
        double peso;
        String comentario;
        Perro.RazaPerro razaPerro;
        Gato.RazaGato razaGato;
        Pajaro.EspeciePajaro especiePajaro;
        Reptil.EspecieReptil especieReptil;
        boolean cantor;
        boolean venenoso;
        String microchip;
        ClinicaVeterinaria animalitos = new ClinicaVeterinaria();

        while (entrada) {

            System.out.println("Escoja una opcion del menu");
            System.out.println("1. Añadir perro");
            System.out.println("2. Añadir gato");
            System.out.println("3. Añadir Pajaro");
            System.out.println("4. Añadir Reptil");
            System.out.println("5. Modificar comentarios");
            System.out.println("6. Mostrar listado");
            System.out.println("7. Salir");
            opcion = s.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduzca el nombre");
                    nombre = s.nextLine();
                    System.out.println("Introduzca la fecha de nacimiento");
                    fecha = LocalDate.ofEpochDay(s.nextInt());
                    System.out.println("Introduzca el peso");
                    peso = s.nextDouble();
                    System.out.println("Introduzca la raza");
                    razaPerro = Perro.RazaPerro.valueOf(s.nextLine());
                    System.out.println("Introduzca el microchip");
                    microchip = s.nextLine();

                    animalitos.insertaAnimal(new Perro(nombre, fecha, peso, razaPerro, microchip));
                }

                case 2 -> {
                    System.out.println("Introduzca el nombre");
                    nombre = s.nextLine();
                    System.out.println("Introduzca la fecha de nacimiento");
                    fecha = LocalDate.ofEpochDay(s.nextInt());
                    System.out.println("Introduzca el peso");
                    peso = s.nextDouble();
                    System.out.println("Introduzca la raza");
                    razaGato = Gato.RazaGato.valueOf(s.nextLine());
                    System.out.println("Introduzca el microchip");
                    microchip = s.nextLine();

                    animalitos.insertaAnimal(new Gato(nombre, fecha, peso, razaGato, microchip));
                }

                case 3 -> {
                    System.out.println("Introduzca el nombre");
                    nombre = s.nextLine();
                    System.out.println("Introduzca la fecha de nacimiento");
                    fecha = LocalDate.ofEpochDay(s.nextInt());
                    System.out.println("Introduzca el peso");
                    peso = s.nextDouble();
                    System.out.println("Introduzca la raza");
                    especiePajaro = Pajaro.EspeciePajaro.valueOf(s.nextLine());
                    System.out.println("Introduzca si es cantor");
                    cantor = Boolean.parseBoolean(s.nextLine());

                    animalitos.insertaAnimal(new Pajaro(nombre, fecha, peso, especiePajaro, cantor));
                }

                case 4 -> {
                    System.out.println("Introduzca el nombre");
                    nombre = s.nextLine();
                    System.out.println("Introduzca la fecha de nacimiento");
                    fecha = LocalDate.ofEpochDay(s.nextInt());
                    System.out.println("Introduzca el peso");
                    peso = s.nextDouble();
                    System.out.println("Introduzca la raza");
                    especieReptil = Reptil.EspecieReptil.valueOf(s.nextLine());
                    System.out.println("Introduzca el microchip");
                    venenoso = Boolean.parseBoolean(s.nextLine());

                    animalitos.insertaAnimal(new Reptil(nombre, fecha, peso, especieReptil, venenoso));
                }
                case 5 -> {
                    System.out.println("Introduzca el nombre del animal");
                    nombre = s.nextLine();
                    System.out.println("Introduca el comentario");
                    comentario = s.nextLine();
                    animalitos.modificaComentarioAnimal(nombre, comentario);
                }
                case 6 -> {
                    System.out.println(animalitos);
                }
                case 7 -> {
                    entrada = false;
                }
                default -> {
                    System.out.println("Opcion incorrecta");
                }
            }
        }
    }
}
