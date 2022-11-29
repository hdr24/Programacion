package EjerciciosCadenas;

public class Ejercicio01 {
    public static int numeroEspacios(String cad) {
        int esp = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == ' ')
                esp++;
        }
        return esp;
    }

    public static void main(String[] args) {
        System.out.println(numeroEspacios("  frasec onre spacios"));
    }
}