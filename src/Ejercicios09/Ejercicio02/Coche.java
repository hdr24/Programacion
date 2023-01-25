package Ejercicios09.Ejercicio02;

public class Coche extends Vehiculo{
    private String marca;
    private String modelo;

    public Coche(String ma, String mo, String col, int k) {
        super(col, k);
        marca = ma;
        modelo = mo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void quemaRueda() {
        System.out.println("Estoy quemando rueda");
    }
}
