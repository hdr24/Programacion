package Ejercicios11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Debe pasar un argumento enla linea de comandos");
            System.exit(1);
        }

        ArrayList<String> palabras = new ArrayList<>();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[0] + "_sorted.txt"));

            String linea = "";

            while (linea != null) {
                palabras.add(linea);
                linea = bf.readLine();
            }

            Collections.sort(palabras);

            for (String palabra : palabras) {
                bw.write(palabra + "\n");
            }

            bf.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error de lectura/escritura");
            System.err.println(e.getMessage());
        }
    }
}
