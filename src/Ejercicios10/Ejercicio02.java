package Ejercicios10;

import java.util.ArrayList;

public class Ejercicio02 {
    public static void main(String[] args) {
        int min = 100, max = 0, suma = 0;
        int n = (int) ((Math.random()* 11) + 10);
        ArrayList<Integer> nums = new ArrayList<>(n);

        System.out.println("Numeros");
        for (int i = 0; i < n; i++) {
            nums.add((int) (Math.random() * 101));
            System.out.println(nums.get(i));
            suma += nums.get(i);
            if (nums.get(i) > max)
                max = nums.get(i);
            if (nums.get(i) < min)
                min = nums.get(i);
        }
        int media = suma / n;
        System.out.println();
        System.out.println("El maximo es: " + max);
        System.out.println("El minimo es: " + min);
        System.out.println("La suma es: " + suma);
        System.out.println("La meida es: "+ media);
    }
}
