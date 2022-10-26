package Ejercicios07;

public class Ejercicio04 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = cuadrado[i] * numero[i];
        }
        System.out.println("Número  ---  Cuadrado  ---  Cubo");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%4d ", numero[i]);
            System.out.printf("%15d ", cuadrado[i]);
            System.out.printf("%12d ", cubo[i]);
            System.out.println("");
        }
    }
}
