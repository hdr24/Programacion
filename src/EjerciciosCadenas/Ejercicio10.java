package EjerciciosCadenas;

public class Ejercicio10 {
    public static int cuentaPalabras(String cad) {
        int palabras = 1;
        cad = cad.trim();
        if (cad.isBlank())
            return 0;
        for (int i = 0; i < cad.length() - 1; i++) {
            if (cad.charAt(i) == ' ' && cad.charAt(i+1) != ' ')
                palabras++;
        }
        return palabras;
    }

    public static void main(String[] args) {
        System.out.println(cuentaPalabras(""));
    }
}
