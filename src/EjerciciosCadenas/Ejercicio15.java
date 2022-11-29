package EjerciciosCadenas;

public class Ejercicio15 {
    public static int vecesCaracter(String cad, char car) {
        int contCar = 0;
        for (int i = 0; i < cad.length() ; i++) {
            if (cad.charAt(i) == car)
                contCar++;
        }
        return contCar;
    }

    public static void main(String[] args) {
        System.out.println(vecesCaracter("Unas cadenas", 'a'));
    }
}
