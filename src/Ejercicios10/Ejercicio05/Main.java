package Ejercicios10.Ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion;
        Scanner s = new Scanner(System.in);
        String codigoIntroducido;
        String autorIntroducido;
        String tituloIntroducido;
        String generoIntroducido;
        int duracionIntroducida;
        boolean repetido;
        int vecesImprime;

        ArrayList<Disco> discos = new ArrayList<>();

        discos.add(new Disco("GASA48", "Mozart", "Eine Kleine Nachtmusik", "Clasica", 6));
        discos.add(new Disco("GASA49", "Lady Gaga", "Born this way", "Pop", 53));

        System.out.println("Elija una opcion");

        do {
            boolean borrado = false;

            System.out.println("\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = s.nextInt();

            switch (opcion) {
                case 1 -> {
                    vecesImprime = 0;
                    System.out.println("\nLISTADO");
                    System.out.println("=======");
                    System.out.println("Introduzca que listado desea ver");
                    System.out.println("1. Listado completo");
                    System.out.println("2. Listado por autor");
                    System.out.println("3. Listado por genero");
                    System.out.println("4. Listado por rango de duracion");
                    opcion = s.nextInt();
                    switch (opcion) {
                        case 1 -> {
                            for (Disco d : discos) {
                                if (!d.getCodigo().equals("LIBRE")) {
                                    System.out.println(d);
                                    vecesImprime++;
                                }
                            }
                        }
                        case 2 -> {

                            System.out.println("Introduzca el autor");
                            autorIntroducido = s.next();
                            for (Disco disco : discos) {
                                if (!disco.getCodigo().equals("LIBRE")) {
                                    if (disco.getAutor().equals(autorIntroducido)) {
                                        System.out.println(disco);
                                        vecesImprime++;
                                    }
                                }
                            }
                            if (vecesImprime == 0) {
                                System.out.println("No coincide ningun disco con el criterio de busqueda");
                            }
                        }
                        case 3 -> {
                            System.out.println("Introduzca el genero");
                            generoIntroducido = s.next();
                            for (Disco disco : discos) {
                                if (!disco.getCodigo().equals("LIBRE")) {
                                    if (disco.getGenero().equals(generoIntroducido)) {
                                        System.out.println(disco);
                                        vecesImprime++;
                                    }
                                }
                            }
                            if (vecesImprime == 0) {
                                System.out.println("No coincide ningun disco con el criterio de busqueda");
                            }
                        }
                        case 4 -> {
                            System.out.println("Introduzca el principio del rango");
                            int inicRango = s.nextInt();
                            System.out.println("Introduzca el final del rango");
                            int finRango = s.nextInt();

                            for (Disco disco : discos) {
                                if (!disco.getCodigo().equals("LIBRE")) {
                                    if (disco.getDuracion() >= inicRango && disco.getDuracion() <= finRango) {
                                        System.out.println(disco);
                                        vecesImprime++;
                                    }
                                }
                            }
                            if (vecesImprime == 0) {
                                System.out.println("No coincide ningun disco con el criterio de busqueda");
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("\nNUEVO DISCO");
                    System.out.println("===========");

                    System.out.println("Por favor, introduzca los datos del disco.");
                    System.out.print("Código: ");
                    do {
                        repetido = false;

                        codigoIntroducido = s.next();

                        for (Disco disco : discos) {
                            if (disco.getCodigo().equals(codigoIntroducido)) {
                                repetido = true;
                                System.out.println("El codigo introducido ya existe");
                                System.out.print("Introduzca otro codigo: ");
                                break;
                            }
                        }
                    } while (repetido);

                    System.out.print("Autor: ");
                    autorIntroducido = s.next();
                    System.out.print("Título: ");
                    tituloIntroducido = s.next();
                    System.out.print("Género: ");
                    generoIntroducido = s.next();
                    System.out.print("Duración: ");
                    duracionIntroducida = s.nextInt();
                    discos.add(new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida));

                }
                case 3 -> {
                    System.out.println("\nMODIFICAR");
                    System.out.println("===========");
                    System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
                    codigoIntroducido = s.next();
                    int i = -1;

                    do {
                        i++;
                    } while (!((discos.get(i).getCodigo()).equals(codigoIntroducido)));
                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
                    System.out.println("Código: " + discos.get(i).getCodigo());
                    System.out.print("Nuevo código: ");
                    do {
                        repetido = false;

                        codigoIntroducido = s.next();

                        for (Disco disco : discos) {
                            if (disco.getCodigo().equals(codigoIntroducido)) {
                                repetido = true;
                                System.out.println("El codigo introducido ya existe");
                                System.out.print("Introduzca otro codigo: ");
                                break;
                            }
                        }
                    } while (repetido);
                    if (!codigoIntroducido.equals("")) {
                        discos.get(i).setCodigo(codigoIntroducido);
                    }
                    System.out.println("Autor: " + discos.get(i).getAutor());
                    System.out.print("Nuevo autor: ");
                    autorIntroducido = s.next();
                    if (!autorIntroducido.equals("")) {
                        discos.get(i).setAutor(autorIntroducido);
                    }
                    System.out.println("Título: " + discos.get(i).getTitulo());
                    System.out.print("Nuevo título: ");
                    tituloIntroducido = s.next();
                    if (!tituloIntroducido.equals("")) {
                        discos.get(i).setTitulo(tituloIntroducido);
                    }
                    System.out.println("Género: " + discos.get(i).getGenero());
                    System.out.print("Nuevo género: ");
                    generoIntroducido = s.next();
                    if (!generoIntroducido.equals("")) {
                        discos.get(i).setGenero(generoIntroducido);
                    }
                    System.out.println("Duración: " + discos.get(i).getDuracion());
                    System.out.print("Duración: ");
                    final String duracionIntroducidaString = s.nextLine();
                    if (!duracionIntroducidaString.equals("")) {
                        discos.get(i).setDuracion(Integer.parseInt(duracionIntroducidaString));
                    }
                }
                case 4 -> {
                    System.out.println("\nBORRAR");
                    System.out.println("======");
                    System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
                    codigoIntroducido = s.next();
                    for (int j = 0; j < discos.size(); j++) {
                        if (discos.get(j).getCodigo().equals(codigoIntroducido)) {
                            discos.remove(j);
                            borrado = true;
                            System.out.println("Album borrado con exito");
                            break;
                        }
                    }
                    if (!borrado) {
                        System.out.println("El codigo de disco introducido no existe");
                    }
                }
                default -> {
                }
            }
        } while (opcion != 5);
    }
}
