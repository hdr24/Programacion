package EjerciciosObjetos.Moneda;

public class Moneda {

    public enum TipoMoneda {
        DOLAR, EURO, YEN, LIBRA, PESO
    }

    private TipoMoneda tmoneda;

    private int decimales;

    private String simbolo;

    private double cambioEuro;

    public Moneda(TipoMoneda tmoneda, int decimales, String simbolo, double cambioEuro) {
        this.tmoneda = tmoneda;
        if (decimales > -1 && decimales < 5) {
        this.decimales = decimales;
        }

        if (!(simbolo.equals(""))) {
            this.simbolo = simbolo;
        }

        if (cambioEuro > 0) {
            this.cambioEuro = cambioEuro;
        }
    }

    public int getDecimales() {
        return decimales;
    }

    public TipoMoneda getTmoneda() {
        return tmoneda;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getCambioEuro() {
        return cambioEuro;
    }

    public void setCambioEuro(double cambioEuro) {
        if (cambioEuro > 0) {
            this.cambioEuro = cambioEuro;
        }
    }


}
