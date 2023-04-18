package Ejercicios11;

import java.io.*;

public class Ejercicio05 {
    public static void main(String[] args) {
        if (args.length != 2)
            System.exit(1);

        try {
            BufferedReader bf = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

            String linea = " ";

            while (linea != null) {
                if (linea.charAt(0) != '/' && linea.charAt(0) != '*') {
                    if (linea.contains("//")) {
                        for (int i = 0; i < linea.indexOf("//"); i++) {
                            bw.write(linea.charAt(i));
                        }
                        bw.write("\n");
                    } else {
                        bw.write(linea + "\n");
                    }
                }
                linea = bf.readLine();
            }
            bf.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            System.err.println(e.getMessage());
        }
    }
}

/*
*
*
*
*
*
*
*/
