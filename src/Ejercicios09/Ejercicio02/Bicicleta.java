package Ejercicios09.Ejercicio02;

public class Bicicleta extends Vehiculo {

    private int radioRueda;

    public Bicicleta(String col, int rad, int k) {
        super(col, k);
        radioRueda = rad;
    }

    public int getRadioRueda() {
        return radioRueda;
    }

    public void caballito() {
        System.out.println("Hago el caballito");
    }


}
