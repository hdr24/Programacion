package EjerciciosObjetos.Animales;

import java.time.LocalDate;

public class Gato extends Animal {
    public enum RazaGato {
        Comun, Siames, Persa, Angora, ScottishFold
    }

    private String microChip;
    private RazaGato raza;

    public String getMicroChip() {
        return microChip;
    }

    public RazaGato getRaza() {
        return raza;
    }

    public Gato(String nombre, LocalDate fechaNacimiento, double peso, RazaGato raza, String microChip) {
        super(nombre, fechaNacimiento, peso);
        this.raza = raza;
        this.microChip = microChip;
    }

    @Override
    public String toString() {
        return "Ficha de Gato\n" +
                "Nombre: " + this.nombre +
                "\nRaza: " + this.raza +
                "\nFecha de nacimiento: " + this.fechaNacimiento +
                "\nPeso: " + this.peso +
                "\nMicrochip: " + this.microChip +
                "\nComentarios: " + this.comentarios;
    }
}
