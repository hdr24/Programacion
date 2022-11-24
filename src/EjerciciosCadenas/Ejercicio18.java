package EjerciciosCadenas;

public class Ejercicio18 {
    public static String sustituyePalabra(String cad, String palabraInic, String palabraFin) {
        cad = cad.replace(palabraInic, palabraFin);
        return cad;
    }

    public static void main(String[] args) {
        System.out.println(sustituyePalabra("Una casa", "casa", "manzana"));
    }
}
