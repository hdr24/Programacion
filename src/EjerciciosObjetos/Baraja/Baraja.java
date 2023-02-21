package EjerciciosObjetos.Baraja;

import java.util.ArrayList;

public class Baraja {

    public ArrayList<Carta> cartas;

    public Baraja() {}

    public Baraja(int tipoBaraja) {
        if (tipoBaraja == 1) {
            for (int i = 0; i < 40; i++) {
                cartas.add(new Carta(i + 1));
            }
        } else if (tipoBaraja == 2) {
            for (int i = 0; i < 80; i++) {
                if (i < 40) {
                    cartas.add(new Carta(i+1));
                } else {
                    cartas.add(new Carta(i-39));
                }
            }
        } else {
            System.out.println("Opcion invalida, baraja vacía");
        }
    }

    public Baraja(int tipoBaraja, boolean barajar) {}

    public void barajar() {
        ArrayList <Carta> cartas = new ArrayList<>();
    }
}
