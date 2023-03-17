package EjerciciosObjetos.Alumnos;

public class Main {
    public static void main(String[] args) {
        Grupo DAW1 = new Grupo();
        Alumno priscila = new Alumno("Priscila", 20, 7);

        DAW1.insertaAlumnoLista("Ana", 19, 9.2);
        DAW1.insertaAlumnoLista("Pepe", 18, 4.7);
        DAW1.insertaAlumnoLista("Maria", 17, 5.2);
        DAW1.insertaAlumnoLista("Juan", 21, 4.5);
        DAW1.insertaAlumnoLista(priscila);

        System.out.println(DAW1);
    }
}
