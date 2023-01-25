package Ejercicios09.Ejercicio02;

public abstract class Vehiculo {
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;

    public int kilometrosRecorridos;
    public String color;


    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }
    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public void anda(int k) {
        System.out.println("Recorro " + k + " kilometros");
        kilometrosRecorridos += k;
        kilometrosTotales += k;
    }
    public Vehiculo(String col, int k) {
        vehiculosCreados++;
        color = col;
        kilometrosRecorridos = k;
        kilometrosTotales += k;
    }


}
