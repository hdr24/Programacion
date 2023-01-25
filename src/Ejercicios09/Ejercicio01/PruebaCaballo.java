package Ejercicios09.Ejercicio01;

public class PruebaCaballo {
    public static void main(String[] args) {
        Caballo rocinante = new Caballo("macho");

        rocinante.cabalga();
        rocinante.relincha();
        rocinante.trota();
        System.out.println(rocinante.getSexo());

    }
}
