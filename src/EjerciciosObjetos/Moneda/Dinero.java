package EjerciciosObjetos.Moneda;

import java.util.ArrayList;

public class Dinero {

    private static ArrayList<Moneda> listaMonedas = new ArrayList<>();

    static {
        listaMonedas.add(new Moneda(Moneda.TipoMoneda.EURO, 2, "€", 1));
        listaMonedas.add(new Moneda(Moneda.TipoMoneda.DOLAR, 2, "$", 1.07));
        listaMonedas.add(new Moneda(Moneda.TipoMoneda.YEN, 0, "¥", 142.92));
        listaMonedas.add(new Moneda(Moneda.TipoMoneda.LIBRA, 2, "£", 0.88));
    }

    public static Moneda buscaMoneda(Moneda.TipoMoneda t) {
        for (Moneda moneda : listaMonedas) {
            if (moneda.getTmoneda() == t) {
                return moneda;
            }
        }
        return new Moneda(Moneda.TipoMoneda.LIBRA, 0, "null", 100);
    }

    public static void actualizaCambio(Moneda.TipoMoneda t, double cambio) {
        Moneda moneda = buscaMoneda(t);
        moneda.setCambioEuro(cambio);
    }

    private Moneda.TipoMoneda tMoneda;

    private double cantidad;

    public Dinero(Moneda.TipoMoneda t, double cantidad) {
        this.cantidad = cantidad;
        this.tMoneda = t;
    }

    public Dinero(Moneda.TipoMoneda t, int cantidad) {
        this.cantidad = cantidad;
        this.tMoneda = t;
    }

    public double getCantidad() {
        return cantidad;
    }

    public Moneda.TipoMoneda gettMoneda() {
        return tMoneda;
    }

    @Override
    public String toString() {
        // Redondeamos multiplicando la cantidad por el numero de decimales, a esto le quitamos los decimales y finalmente volvemos
        // a dividir por el numero de decimales quedando asi el numero deseado
        return Math.round(this.cantidad * Math.pow(10, buscaMoneda(this.tMoneda).getDecimales())) / Math.pow(10, buscaMoneda(this.tMoneda).getDecimales()) + buscaMoneda(this.tMoneda).getSimbolo();
    }

    public double valorEn(Moneda.TipoMoneda t) {
        // Multiplicamos la cantidad por su cambio a euro para pasarla a euro, luego la multiplicamos por
        // el nuevo tipo de moneda
        return this.cantidad * buscaMoneda(this.tMoneda).getCambioEuro() * buscaMoneda(t).getCambioEuro();
    }

    public Dinero convierteEn(Moneda.TipoMoneda t) {
        cantidad = this.cantidad * buscaMoneda(this.tMoneda).getCambioEuro() / buscaMoneda(t).getCambioEuro();
        return new Dinero(t, cantidad);
    }

    public String toString(Moneda.TipoMoneda t) {
        cantidad = convierteEn(t).getCantidad();
        return Math.round(cantidad * Math.pow(10, buscaMoneda(t).getDecimales())) / Math.pow(10, buscaMoneda(t).getDecimales()) + buscaMoneda(t).getSimbolo();
    }

    public Dinero add(Dinero dineroOtro) {
        dineroOtro.convierteEn(this.tMoneda);
        return new Dinero(this.tMoneda, dineroOtro.getCantidad() + this.cantidad);
    }

    public Dinero substract(Dinero dineroOtro) {
        dineroOtro.convierteEn(this.tMoneda);
        return new Dinero(this.tMoneda, dineroOtro.getCantidad() - this.cantidad);
    }

    public Dinero multiply(double num) {
        return new Dinero(this.tMoneda, this.getCantidad() * num);
    }

    public Dinero divide(double num) {
        return new Dinero(this.tMoneda, this.getCantidad() / num);
    }

    public Dinero negate() {
        return new Dinero(this.tMoneda, this.getCantidad() * -1);
    }

    public boolean equals(Dinero dineroOtro) {
        dineroOtro.convierteEn(this.tMoneda);
        return dineroOtro.getCantidad() == this.cantidad;
    }

    public int compareTo(Dinero dineroOtro) {
        dineroOtro.convierteEn(this.tMoneda);
        if (this.cantidad > dineroOtro.cantidad) {
            return 1;
        } else if (this.cantidad < dineroOtro.cantidad) {
            return -1;
        } else {
            return 0;
        }
    }

}
