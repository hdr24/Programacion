package Ejercicios10.Ejercicio07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Moneda> monedas = new ArrayList<>(6);
        int pos = (int) (Math.random()*2);
        int val = (int) (Math.random()*8);
        monedas.add(new Moneda(val, pos));

        for (int i = 0; i < 5; i++) {
            int n = (int) (Math.random()*2);

            if (n == 0) {
                int valAnt = val;
                do {
                val = (int) (Math.random()*8);
                } while (val == valAnt);
            } else {
                if (pos == 0) {
                    pos = 1;
                } else {
                    pos = 0;
                }
            }
            monedas.add(new Moneda(val, pos));
        }
        System.out.println(monedas);
    }
}
