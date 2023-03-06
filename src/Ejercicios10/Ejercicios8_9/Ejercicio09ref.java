package Ejercicios10.Ejercicios8_9;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio09ref {
    public static void main(String[] args) {

        int num;
        boolean repetido;
        ArrayList<Carta> cartas = new ArrayList<>(10);
        int[] val = new int[10];

        for (int i = 0; i < 10; i++) {
            do {
                repetido = false;
                num = ((int) (Math.random() * 41));
                for (int valor : val) {
                    if (num == valor) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            val[i] = num;
        }

        Arrays.sort(val);

        for (int i = 0; i < 10; i++) {
            cartas.add(new Carta(val[i]));
        }

        for (Carta carta : cartas) {
            System.out.println(carta.nombreCarta());
        }
    }
}
