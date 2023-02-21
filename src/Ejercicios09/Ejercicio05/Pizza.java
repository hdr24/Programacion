package Ejercicios09.Ejercicio05;

public class Pizza {
    private String tipo, tamano;
    private boolean servida;
    private static int TotalPedidas, TotalServidas;

    Pizza(String tip, String tam) {
        tipo = tip;
        tamano = tam;
        servida = false;
        TotalPedidas++;
    }

    public static int getTotalPedidas() {
        return TotalPedidas;
    }

    public static int getTotalServidas() {
        return TotalServidas;
    }

    public void sirve() {
        if (!servida) {
            TotalServidas++;
            this.servida = true;
        } else {
            System.out.println("Esa pizza ya se ha servido");
        }
    }

    public String toString() {
        if (this.servida)
            return "Pizza " + this.tipo + " " + this.tamano + ", servida";
        else
            return "Pizza " + this.tipo + " " + this.tamano + ", pedida";
    }
}
