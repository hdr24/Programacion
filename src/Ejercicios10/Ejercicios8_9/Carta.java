package Ejercicios10.Ejercicios8_9;

public class Carta {
    public int numero;
    public int palo;

    public Carta(int numero, int palo) {
        if (numero > 0 && numero < 11 && palo >= 0 && palo < 4) {
            this.numero = numero;
            this.palo = palo;
        } else {
            this.numero = 0;
            this.palo = 0;
        }

    }

    public Carta(int id) {
        id -= 1;

        this.numero = (id % 10) + 1;
        this.palo = id / 10;
    }

    public int getNumero() {
        return numero;
    }

    public int getPalo() {
        return palo;
    }

    public String nombreNumero() {
        String[] nums = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
        return nums[this.numero-1];
    }

    public String nombrePalo() {
        String[] palos = {"bastos", "copas", "espadas", "oros"};
        return palos[this.palo];
    }

    public String nombreCarta() {
        return this.nombreNumero() + " de " + this.nombrePalo();
    }

    public int valorTute() {
        int[] valores = {11, 0, 10, 0, 0, 0, 0, 2, 3, 4};
        return valores[this.numero-1];
    }

    public int valorMus() {
        int[] valores = {1, 1, 10, 4, 5, 6, 7, 10, 10, 10};
        return valores[this.numero-1];
    }

    public double valor7ymedia() {
        if (this.numero < 8) {
            return this.numero;
        } else {
            return 0.5;
        }
    }
}
