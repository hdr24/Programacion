package Ejercicios05;

public class Ejercicio22 {
    public static void main(String[] args) {
        int divisores;
        for (int i = 2; i < 101; i++) {
            divisores = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            if (divisores <= 2) {
                System.out.println(i);
            }
        }
    }
}
