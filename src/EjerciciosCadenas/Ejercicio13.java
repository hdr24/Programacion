package EjerciciosCadenas;

public class Ejercicio13 {
    public static String quitaAcentos(String cad) {
        cad = cad.replace('á', 'a');
        cad = cad.replace('é', 'e');
        cad = cad.replace('í', 'i');
        cad = cad.replace('ó', 'o');
        cad = cad.replace('ú', 'u');
        cad = cad.replace('Á', 'A');
        cad = cad.replace('É', 'E');
        cad = cad.replace('Í', 'I');
        cad = cad.replace('Ó', 'O');
        cad = cad.replace('Ú', 'U');
        return cad;
    }

    public static void main(String[] args) {
        System.out.println(quitaAcentos("Úná cádéná"));
    }
}
