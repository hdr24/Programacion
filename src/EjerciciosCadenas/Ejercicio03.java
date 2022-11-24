package EjerciciosCadenas;

public class Ejercicio03 {
    public static boolean esPalindromo(String cad) {
        cad = Ejercicio07.quitaEspacios(cad);
        String cadReves = Ejercicio14.invierteCadena(cad);
        return cad.equalsIgnoreCase(cadReves);
    }

    public static void main(String[] args) {
        System.out.println(esPalindromo("Do geese see god"));
    }
}
