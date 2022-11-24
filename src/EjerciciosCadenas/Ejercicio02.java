package EjerciciosCadenas;

public class Ejercicio02 {
    public static int numeroVocales(String cad) {
        char[] voc = {'a','e','i','o','u','A','E','I','O','U'};
        int numVoc = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < cad.length(); j++) {
                if (cad.charAt(j) == voc[i])
                    numVoc++;
            }
        }
        return numVoc;
    }

    public static void main(String[] args) {
        System.out.println(numeroVocales("Una casa verde"));
    }
}
