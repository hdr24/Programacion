package Ejercicios10.Ejercicios8_9;

import java.util.ArrayList;

public class Ejercicio08 {

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
    }
}
