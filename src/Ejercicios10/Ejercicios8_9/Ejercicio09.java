package Ejercicios10.Ejercicios8_9;

import java.util.ArrayList;

public class Ejercicio09 {
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

            cartas.add(new Carta(num));
            val[i] = num;
        }
        for (Carta carta : cartas) {
            System.out.println(carta.nombreCarta());
        }

        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                for (int l = 0; l < 10; l++) {
                    if (cartas.get(l).getPalo() == i && cartas.get(l).getNumero() == j) {

                        Carta aux = new Carta(cartas.get(l).getNumero(), cartas.get(l).getPalo());
                        cartas.remove(l);
                        cartas.add(k, aux);
                        k++;
                    }
                }

            }
        }

        System.out.println("\nOrdenado por palo");
        for (Carta carta : cartas) {
            System.out.println(carta.nombreCarta());
        }
    }
}

