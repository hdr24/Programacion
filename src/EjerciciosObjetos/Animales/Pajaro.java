package EjerciciosObjetos.Animales;

import java.time.LocalDate;

public class Pajaro extends Animal{
    public enum EspeciePajaro {
        Canario, Periquito, Agaporni
    }

    private boolean cantor;
    private EspeciePajaro especie;

    public boolean isCantor() {
        return this.cantor;
    }

    public EspeciePajaro getEspecie() {
        return this.especie;
    }

    public Pajaro(String nombre, LocalDate fechaNacimiento, double peso, EspeciePajaro especie, boolean cantor) {
        super(nombre, fechaNacimiento, peso);
        this.especie = especie;
        this.cantor = cantor;
    }

    @Override
    public String toString() {
        return "Ficha de pajaro\n" +
                "Nombre: " + this.nombre +
                "\nEspecie: " + this.especie +
                "\nFecha de nacimiento: " + this.fechaNacimiento +
                "\nPeso: " + this.peso +
                "\nEs cantor: " + this.cantor +
                "\nComentarios: " + this.comentarios;
    }
}
