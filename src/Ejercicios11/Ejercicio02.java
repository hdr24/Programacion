package Ejercicios11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio02 {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("primos.dat"));

            String linea = "";

            while (linea != null){
                System.out.println(linea);
                linea = bf.readLine();
            }

            bf.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero primos.dat");
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo primos.dat");
        }
    }
}
