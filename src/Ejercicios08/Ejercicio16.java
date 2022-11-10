package Ejercicios08;

public class Ejercicio16 {
    public static void main(String[] args) {
        int cap = 0;

        for (int i = 0; i < 99999; i++) {
            if (Ejercicio01.esCapicua(i)) {
                System.out.print(i + " ");
                cap++;
            }
            if (cap % 25 == 0 && cap != 0) {
                System.out.println();
                cap++;
            }
        }
    }
}
