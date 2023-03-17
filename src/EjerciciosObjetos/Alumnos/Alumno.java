package EjerciciosObjetos.Alumnos;

public class Alumno {

    private String nombre;

    private int edad;

    private double calificacion;

    public void setCalificacion(double calificacion) {
        if (calificacion > -1 && calificacion < 11) {
            this.calificacion = calificacion;
        }
    }

    public void setEdad(int edad) {
        if (edad > 17 && edad < 101) {
            this.edad = edad;
        }
    }

    public void setNombre(String nombre) {
        if (!(nombre.equals(""))) {
            this.nombre = nombre;
        }
    }

    public Alumno(String nombre, int edad, double calificacion) {
        setNombre(nombre);
        setCalificacion(calificacion);
        setEdad(edad);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nEdad: " + edad + "\nCalificación: " + this.calificacion;
    }

}
