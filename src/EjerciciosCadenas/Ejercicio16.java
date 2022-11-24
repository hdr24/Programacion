package EjerciciosCadenas;

public class Ejercicio16 {
    public static int vecesPalabra(String cad, String palabra) {
        int contPalabra = 0;
        boolean entrada = true;
        while (entrada) {
            if (cad.contains(palabra)) {
                contPalabra++;
                cad = cad.replaceFirst(palabra, "");
            } else {
                entrada = false;
            }
        }
        return contPalabra;
    }

    public static void main(String[] args) {
        System.out.println(vecesPalabra("Una casa, dos casas", "casa"));
    }
}
