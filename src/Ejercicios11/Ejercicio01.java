package Ejercicios11;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Ejercicio01 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

            for (int i = 2; i < 501; i++) {
                if (esPrimo(i)) {
                    bw.write(i + "\n");
                }
            }
            System.out.println("Fichero escrito con exito");
            bw.close();
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }

    public static boolean esPrimo(int num) {
        int div = 0;

        if (num < 2)
            return false;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                div++;
            }
        }
        return div <= 2;
    }
}
