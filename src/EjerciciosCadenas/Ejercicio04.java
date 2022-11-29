package EjerciciosCadenas;

public class Ejercicio04 {
    public static boolean contiene(String cad, char car) {
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == car)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(contiene("Casa", 's'));
    }
}
