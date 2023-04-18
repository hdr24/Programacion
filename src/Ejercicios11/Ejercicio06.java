package Ejercicios11;

import java.io.*;

public class Ejercicio06 {
    public static void main(String[] args) {

        int ocurrencias = 0;

        if (args.length != 2) {
            System.out.println("Debe pasar 2 argumentos en la línea de comandos");
            System.exit(1);
        }

        try {
            BufferedReader bf = new BufferedReader(new FileReader(args[0]));

            String linea = " ";
            while ((linea!=null)) {
                while (linea.contains(args[1])) {
                    ocurrencias++;
                    linea = linea.replaceFirst(args[1], "");
                }
                linea = bf.readLine();
            }
            bf.close();
            System.out.println("La palabra " + args[1] + " aparece " + ocurrencias + " veces");
        } catch (IOException e) {
            System.out.println("Se ha producido un error");
            System.err.println(e.getMessage());
        }
    }
}
