package Ejercicios09.Gestisimal;

import java.util.Scanner;

public class Gestisimal {
    public static void main(String[] args) throws InterruptedException {

        int cod, precCompra, precVenta, cantidad;
        String descripcion;

        boolean entrada = true;
        Scanner s = new Scanner(System.in);
        int n = 3;
        Articulo[] articulos = new Articulo[n];

        for (int i = 0; i < n; i++) {
            articulos[i] = new Articulo();
        }
        articulos[0] = new Articulo(12, 10, 12, 3, "Silla");
        articulos[1] = new Articulo(212, 310, 132, 33, "Mesa");

        while (entrada) {
            boolean borrado = false;
            int posLibre = -1;

            System.out.println("Escoja una opcion del menu");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");

            int opc = s.nextInt();
            switch (opc) {
                case 1 -> {
                    for (int i = 0; i < n; i++) {
                        if (articulos[i].getCod() != -1) {
                            System.out.println(articulos[i]);
                        }
                    }
                    Thread.sleep(1000);
                }
                case 2 -> {
                    for (int i = 0; i < n; i++) {
                        if (articulos[i].getCod() == -1) {
                            posLibre = i;
                            break;
                        }
                    }
                    if (posLibre == -1) {
                        System.out.println("No hay espacio libre para nuevos productos");
                        Thread.sleep(1000);
                    } else {
                        System.out.println("Introduzca el codigo del producto: ");
                        cod = s.nextInt();
                        System.out.println("Introduzca el precio de compra del producto:");
                        precCompra = s.nextInt();
                        System.out.println("Introduzca el precio de venta del producto:");
                        precVenta = s.nextInt();
                        System.out.println("Introduzca el stock del producto:");
                        cantidad = s.nextInt();
                        System.out.println("Introduzca la descripcion del producto");
                        descripcion = s.next();

                        articulos[posLibre] = new Articulo(cod, precCompra, precVenta, cantidad, descripcion);
                    }
                }
                case 3 -> {
                    System.out.println("Introduzca el código del producto que quiere dar de baja");
                    cod = s.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (articulos[i].getCod() == cod) {
                            articulos[i] = new Articulo();
                            borrado = true;
                            break;
                        }
                    }
                    if (borrado) {
                        System.out.println("Articulo borrado con exito");
                    } else {
                        System.out.println("El código de articulo que ha introducido no corresponde con ningun articulo");
                    }
                }
                case 4 -> {
                    System.out.println("Introduzca el código del articulo que desea modificar");
                    cod = s.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (articulos[i].getCod() == cod ) {
                            System.out.println("Introduzca lo que desea modificar");
                            System.out.println("1. Código");
                            System.out.println("2. Precio de compra");
                            System.out.println("3. Precio de venta");
                            System.out.println("4. Stock");
                            System.out.println("5. Descripción");
                            opc = s.nextInt();

                            switch (opc) {
                                case 1 -> {
                                    System.out.println("Introduzca el nuevo código");
                                    cod = s.nextInt();
                                    articulos[i].setCod(cod);
                                }
                                case 2 -> {
                                    System.out.println("Introduzca el nuevo precio de compra");
                                    precCompra = s.nextInt();
                                    articulos[i].setPrecCompra(precCompra);
                                }
                                case 3 -> {
                                    System.out.println("Introduzca el nuevo precio de venta");
                                    precVenta = s.nextInt();
                                    articulos[i].setPrecVenta(precVenta);
                                }
                                case 4 -> {
                                    System.out.println("Introduzca el nuevo stock");
                                    cantidad = s.nextInt();
                                    articulos[i].setStock(cantidad);
                                }
                                case 5 -> {
                                    System.out.println("Introduzca la nueva descripcion");
                                    descripcion = s.next();
                                    articulos[i].setDesc(descripcion);
                                }
                            }
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Introduzca el código del producto al que añadir la mercancía");
                    cod = s.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (articulos[i].getCod() == cod) {
                            System.out.println("Introduzca cuanto stock desea añadir al producto");
                            cantidad = s.nextInt();
                            articulos[i].setStock(articulos[i].getStock() + cantidad);
                        }
                    }
                }
                case 6 -> {
                    System.out.println("Introduzca el código del producto al que desea quitar mercancía");
                    cod = s.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (articulos[i].getCod() == cod) {
                            System.out.println("Introduzca cuanto stock desea quitar al producto");
                            cantidad = s.nextInt();
                            if (articulos[i].getStock() - cantidad >= 0) {
                                articulos[i].setStock(articulos[i].getStock() - cantidad);
                            } else {
                                System.out.println("No puede quitar más stock del que hay");
                            }
                        }
                    }
                }
                case 7 -> entrada = false;
            }
        }
    }
}
