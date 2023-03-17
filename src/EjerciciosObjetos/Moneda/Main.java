package EjerciciosObjetos.Moneda;

public class Main {
    public static void main(String[] args) {
        Dinero monedero = new Dinero(Moneda.TipoMoneda.YEN, 4.56);
        Dinero monedas = monedero.convierteEn(Moneda.TipoMoneda.LIBRA);
        System.out.println(monedas.toString(Moneda.TipoMoneda.YEN));
        System.out.println(monedas.gettMoneda());
    }
}
