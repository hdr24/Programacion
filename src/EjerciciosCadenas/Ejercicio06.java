package EjerciciosCadenas;

public class Ejercicio06 {
    public static String padLeft(String cad) {
        cad = String.format("%10s", cad);
        return cad;
    }
    public static String padRight(String cad) {
        while (cad.length() < 10) {
            cad = cad.concat(" ");
        }
        return cad;
    }

    public static void main(String[] args) {
        System.out.println(padLeft("patata"));
        System.out.print(padRight("patata"));
    }
}
