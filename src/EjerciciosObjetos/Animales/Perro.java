package EjerciciosObjetos.Animales;

import java.time.LocalDate;

public class Perro extends Animal{


    public enum RazaPerro {
        PastorAleman, Husky, FoxTerrier, Dalmata, SanBernando
    }

    private String microChip;
    private RazaPerro raza;

    public String getMicroChip() {
        return microChip;
    }

    public RazaPerro getRaza() {
        return raza;
    }

    public Perro(String nombre, LocalDate fechaNacimiento, double peso, RazaPerro raza, String microChip) {
        super(nombre, fechaNacimiento, peso);
        this.raza = raza;
        this.microChip = microChip;
    }

    @Override
    public String toString() {
        return "Ficha de perro\n" +
                "Nombre: " + this.nombre +
                "\nRaza: " + this.raza +
                "\nFecha de nacimiento: " + this.fechaNacimiento +
                "\nPeso: " + this.peso +
                "\nMicrochip: " + this.microChip +
                "\nComentarios: " + this.comentarios;
    }
}
