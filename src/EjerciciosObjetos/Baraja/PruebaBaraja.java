package EjerciciosObjetos.Baraja;

public class PruebaBaraja {
    public static void main(String[] args) {
        Carta carta = new Carta(1);

        Baraja baraja = new Baraja(2);

        System.out.println(baraja.cartas.get(39).nombreCarta());
        System.out.println(carta.nombreCarta());
    }
}
