package EjerciciosObjetos.Animales;

import java.time.LocalDate;

public abstract class Animal {

    protected String nombre;

    protected LocalDate fechaNacimiento;

    protected double peso;

    protected String comentarios;

    public Animal(String nombre, LocalDate fechaNacimiento, double peso) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.comentarios = "";
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
