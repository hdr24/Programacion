package EjerciciosObjetos.Alumnos;

import java.util.ArrayList;

public class Grupo {
    private ArrayList<Alumno> listaAlumnos;

    public Grupo() {
        this.listaAlumnos = new ArrayList<>();
    }

    public void insertaAlumnoLista(Alumno a) {
        listaAlumnos.add(a);
    }

    public void insertaAlumnoLista(String nombre, int edad, double calificacion) {
        listaAlumnos.add(new Alumno(nombre, edad, calificacion));
    }

    @Override
    public String toString() {
        String alumnos = "";
        for (Alumno alum : listaAlumnos) {
            alumnos = alumnos.concat(alum + "\n\n");
        }
        return alumnos;
    }
}
