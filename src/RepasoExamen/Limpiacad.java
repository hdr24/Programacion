package RepasoExamen;

public class Limpiacad {
    public static String limpiaCadena(String cad) {
        String cadSinEsp = "";
        cad = cad.replace("?", " ");
        cad = cad.replace("-", " ");
        cad = cad.replace(",", " ");
        cad = cad.replace(".", " ");
        cad = cad.replace("¿", " ");
        cad = cad.trim();

        for (int i = 0; i < cad.length() - 1; i++) {
            if (cad.charAt(i) != ' ' || (cad.charAt(i) == ' ' && cad.charAt(i + 1) != ' '))
                cadSinEsp = cadSinEsp.concat(String.valueOf(cad.charAt(i)));
        }
        return cadSinEsp;
    }

    public static void main(String[] args) {
        System.out.println(limpiaCadena("----Hola, que tal?--- Soy amigo de Poti-Poti."));
    }
}
