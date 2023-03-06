package EjerciciosObjetos.Baraja;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    public ArrayList<Carta> cartas = new ArrayList<>();

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

    public Baraja(int tipoBaraja, boolean barajar) {
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

        this.barajar();
    }

    public void barajar() {
        Collections.shuffle(this.cartas);
    }

    public void cortar(int numeroCartas) {
        for (int i = 0; i < numeroCartas; i++) {
            Carta aux = this.cartas.get(0);
            this.cartas.remove(0);
            this.cartas.add(aux);
        }
    }

    public Carta robar() {
        Carta aux = this.cartas.get(0);
        this.cartas.remove(0);
        return aux;
    }

    public void insertaCartaFinal(int idCarta) {
        this.cartas.add(new Carta(idCarta));
    }

    public void insertaCartaPrincipio(int idCarta) {
        this.cartas.add(0, new Carta(idCarta));
    }

    public void insertaCartaFinal(Carta c) {
        this.cartas.add(c);
    }

    public void insertaCartaPrincipio(Carta c) {
        this.cartas.add(0, c);
    }

    public int numeroCartas() {
        return this.cartas.size();
    }

    public boolean vacia() {
        return this.cartas.isEmpty();
    }
}
