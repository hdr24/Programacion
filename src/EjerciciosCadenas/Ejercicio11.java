package EjerciciosCadenas;

public class Ejercicio11 {
    public static boolean esNumero(String cad) {
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        for (int i = 0; i < cad.length(); i++) {
            boolean esNum = false;
            for (int j = 0; j < 10; j++) {
                if (cad.charAt(i) == num[j]) {
                    esNum = true;
                    break;
                }
            }
            if (!esNum)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(esNumero("5345"));
    }
}
