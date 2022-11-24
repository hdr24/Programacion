package EjerciciosCadenas;

public class Ejercicio09 {
    public static String sustituyeCaracter(String cad, char carInic, char carFin ){
        cad = cad.replace(carInic, carFin);
        return cad;
    }

    public static void main(String[] args) {
        System.out.println(sustituyeCaracter("Una casa", 'a', 'o'));
    }
}
