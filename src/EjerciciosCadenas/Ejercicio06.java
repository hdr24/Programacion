package EjerciciosCadenas;

public class Ejercicio06 {
    public static String padLeft(String cad, int longitud) {
        cad = String.format("%10s", cad);
        return cad;
    }
    public static String padRight(String cad, int longitud) {

        while (cad.length() < longitud) {
            cad = cad.concat(" ");
        }
        return cad;
    }

    public static void main(String[] args) {
        System.out.println(padLeft("patata", 10));
        System.out.print(padRight("patata", 10));
    }
}
