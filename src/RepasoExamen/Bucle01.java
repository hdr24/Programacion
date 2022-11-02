package RepasoExamen;

import java.util.Scanner;

public class Bucle01 {
    public static void main(String[] args) {
        int numEsc, altEsc;
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el número de escalones");
        numEsc = s.nextInt();
        System.out.println("Introduzca la altura del escalón");
        altEsc = s.nextInt();

        for (int i = 0; i <= numEsc; i++) {

            for (int j = 0; j < altEsc; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print("****");
                }
                System.out.println();
            }
        }
    }
}
