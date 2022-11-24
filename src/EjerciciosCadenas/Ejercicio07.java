package EjerciciosCadenas;

public class Ejercicio07 {
    public static String quitaEspacios(String cad) {
        String sinEsp = "";
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) != ' ')
                sinEsp = sinEsp.concat(String.valueOf(cad.charAt(i)));
        }
        return sinEsp;
    }

    public static void main(String[] args) {
        System.out.println(quitaEspacios("sin espacios"));
    }
}
