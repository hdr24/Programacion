package EjerciciosCadenas;

public class Ejercicio14 {
    public static String invierteCadena(String cad) {
        String cadReves = "";
        for (int i = cad.length() - 1; i >= 0 ; i--) {
            cadReves = cadReves.concat(String.valueOf(cad.charAt(i)));
        }
        return cadReves;
    }

    public static void main(String[] args) {
        System.out.println(invierteCadena("Una cadena"));
    }
}
