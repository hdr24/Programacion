package Ejercicios09.Disco;

import java.util.Scanner;


public class ColeccionDeDiscosPrincipal {
    public static void main(String[] args) {
        // N determina el tamaño del array
        final int N = 4;

        //Crea el array de discos
        Disco[] discos = new Disco[N];

        // Crea todos los discos que van en cada una de las celdas del array
        for (int i = 0; i < N; i++) {
            discos[i] = new Disco();
        }

        // Carga varios discos
        discos[0] = new Disco(
                "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        discos[1] = new Disco(
                "FGHQ64", "Metallica", "Black album", "hard rock", 46);
        discos[2] = new Disco(
                "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

        int opcion;
        Scanner s = new Scanner(System.in);
        String codigoIntroducido;
        String autorIntroducido;
        String tituloIntroducido;
        String generoIntroducido;
        int duracionIntroducida;
        boolean repetido;
        int vecesImprime = 0;

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
                case 1:
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
                            for (int i = 0; i < N; i++) {
                                if (!discos[i].getCodigo().equals("LIBRE")) {
                                    if (discos[i].getAutor().equals(autorIntroducido)) {
                                        System.out.println(discos[i]);
                                        vecesImprime++;
                                    }
                                }
                            }
                            if (vecesImprime == 0) {System.out.println("No coincide ningun disco con el criterio de busqueda");}
                        }
                        case 3 -> {
                            System.out.println("Introduzca el genero");
                            generoIntroducido = s.next();
                            for (int i = 0; i < N; i++) {
                                if (!discos[i].getCodigo().equals("LIBRE")) {
                                    if (discos[i].getGenero().equals(generoIntroducido)) {
                                        System.out.println(discos[i]);
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

                            for (int i = 0; i < N; i++) {
                                if (!discos[i].getCodigo().equals("LIBRE")) {
                                    if (discos[i].getDuracion() >= inicRango && discos[i].getDuracion() <= finRango) {
                                        System.out.println(discos[i]);
                                        vecesImprime++;
                                    }
                                }
                            }
                            if (vecesImprime == 0) {
                                System.out.println("No coincide ningun disco con el criterio de busqueda");
                            }
                        }
                    }


                    break;

                case 2:
                    System.out.println("\nNUEVO DISCO");
                    System.out.println("===========");

                    // Busca la primera posición libre del array
                    int primeraLibre = -1;

                    for (int i = 0; i < N; i++) {
                        if (discos[i].getCodigo().equals("LIBRE")) {
                            primeraLibre = i;
                        }
                    }
                    if (primeraLibre != -1) {
                        System.out.println("Por favor, introduzca los datos del disco.");
                        System.out.print("Código: ");
                        do {
                            repetido = false;

                            codigoIntroducido = s.next();

                            for (int i = 0; i < N; i++) {
                                if (discos[i].getCodigo().equals(codigoIntroducido)) {
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
                        discos[primeraLibre] = new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida);
                    } else {
                        System.out.println("La lista de discos está llena, borre un disco antes de introducir otro");
                    }
                    break;

                case 3:
                    System.out.println("\nMODIFICAR");
                    System.out.println("===========");

                    System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
                    codigoIntroducido = s.next();

                    int i = -1;
                    do {
                        i++;
                    } while (!((discos[i].getCodigo()).equals(codigoIntroducido)));

                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                    System.out.println("Código: " + discos[i].getCodigo());
                    System.out.print("Nuevo código: ");

                    do {
                        repetido = false;

                        codigoIntroducido = s.next();

                        for (int j = 0; j < N; j++) {
                            if (discos[j].getCodigo().equals(codigoIntroducido)) {
                                repetido = true;
                                System.out.println("El codigo introducido ya existe");
                                System.out.print("Introduzca otro codigo: ");
                                break;
                            }
                        }
                    } while (repetido);

                    if (!codigoIntroducido.equals("")) {
                        discos[i].setCodigo(codigoIntroducido);
                    }

                    System.out.println("Autor: " + discos[i].getAutor());
                    System.out.print("Nuevo autor: ");
                    autorIntroducido = s.next();
                    if (!autorIntroducido.equals("")) {
                        discos[i].setAutor(autorIntroducido);
                    }

                    System.out.println("Título: " + discos[i].getTitulo());
                    System.out.print("Nuevo título: ");
                    tituloIntroducido = s.next();
                    if (!tituloIntroducido.equals("")) {
                        discos[i].setTitulo(tituloIntroducido);
                    }

                    System.out.println("Género: " + discos[i].getGenero());
                    System.out.print("Nuevo género: ");
                    generoIntroducido = s.next();
                    if (!generoIntroducido.equals("")) {
                        discos[i].setGenero(generoIntroducido);
                    }

                    System.out.println("Duración: " + discos[i].getDuracion());
                    System.out.print("Duración: ");
                    final String duracionIntroducidaString = s.nextLine();
                    if (!duracionIntroducidaString.equals("")) {
                        discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
                    }

                    break;

                case 4:
                    System.out.println("\nBORRAR");
                    System.out.println("======");

                    System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
                    codigoIntroducido = s.next();

                    for (int j = 0; j < N; j++) {
                        if (discos[j].getCodigo().equals(codigoIntroducido)) {
                            discos[j].setCodigo("LIBRE");
                            borrado = true;
                            System.out.println("Album borrado con exito");
                            break;
                        }
                    }
                    if (!borrado) {
                        System.out.println("El codigo de disco introducido no existe");
                    }
                    break;

                default:

            }
        } while (opcion != 5);
    }
}
