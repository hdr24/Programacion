package EjerciciosObjetos.Animales;

import java.time.LocalDate;

public class Reptil extends Animal{
    public enum EspecieReptil {
        Tortuga, Iguana, DragonDeComodo,
    }

    private boolean venenoso;
    private EspecieReptil especie;

    public boolean isVenenoso() {
        return venenoso;
    }

    public EspecieReptil getEspecie() {
        return especie;
    }

    public Reptil(String nombre, LocalDate fechaNacimiento, double peso, EspecieReptil especie, boolean venenoso) {
        super(nombre, fechaNacimiento, peso);
        this.especie = especie;
        this.venenoso = venenoso;
    }

    @Override
    public String toString() {
        return "Ficha de Reptil\n" +
                "Nombre: " + this.nombre +
                "\nEspecie: " + this.especie +
                "\nFecha de nacimiento: " + this.fechaNacimiento +
                "\nPeso: " + this.peso +
                "\nEs venenoso: " + this.venenoso +
                "\nComentarios: " + this.comentarios;
    }
}
