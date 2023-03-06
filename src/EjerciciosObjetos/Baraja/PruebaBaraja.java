package EjerciciosObjetos.Baraja;

public class PruebaBaraja {
    public static void main(String[] args) {

        Baraja baraja = new Baraja(1);

        System.out.println(baraja.cartas.get(39).nombreCarta());
        System.out.println();



        baraja.cortar(20);

        for (int i = 0; i < 40; i++) {
            System.out.println(baraja.robar().nombreCarta());
        }

    }
}
