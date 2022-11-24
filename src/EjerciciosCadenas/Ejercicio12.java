package EjerciciosCadenas;

public class Ejercicio12 {
    public static String quitaCaracter(String cad, char car) {
        String carString = "" + car;
        cad = cad.replace(carString, "");
        return cad;
    }

    public static void main(String[] args) {
        System.out.println(quitaCaracter("Una cadena", 'a'));
    }
}
