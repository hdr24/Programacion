package RepasoExamen;

import java.util.Scanner;

public class Bucle02 {
    public static void main(String[] args) {
        int alt, espacios, centro, k;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura de la pirámide");
        alt = s.nextInt();

        for (int i = 0; i < alt; i++) {
            espacios = 1;
            centro = 0;
            k = 0;
            for (int j = 0; j < 2 * i + 5; j++) {

                while (alt - i > espacios) {
                    System.out.print(" ");
                    espacios++;
                }
                if (i % 2 == 0) {
                    System.out.print("*");
                } else {
                    if (j < (i + 1)) {
                        System.out.print("*");
                    } else {
                        while (centro < 3) {
                            centro++;
                            System.out.print(" ");

                        }
                        if (k < i + 1) {
                            System.out.print("*");
                            k++;
                        }
                    }
                }
            }
            System.out.println();
        }

    }
}