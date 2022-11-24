package EjerciciosCadenas;

public class Ejercicio08 {
    public static String quitaEspaciosTrim(String cad) {
        String sinEsp = "";
        int palabras = Ejercicio10.cuentaPalabras(cad);
        int palabraActual = 1;
        for (int i = 0; i < cad.length() - 1; i++) {
            if (!(cad.charAt(i) == ' ' && (palabraActual == 1) || (palabras+1 == palabraActual))) {
                sinEsp = sinEsp.concat(String.valueOf(cad.charAt(i)));
                if (cad.charAt(i+1) == ' ')
                    palabraActual++;
            }
        }
        return sinEsp;
    }

    public static void main(String[] args) {
        System.out.println(quitaEspaciosTrim("       Una cadena de caracteres      "));
    }
}
