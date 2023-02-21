package Ejercicios10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(10);
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca 10 numeros");

        for (int i = 0; i < 10; i++) {
            nums.add(i, s.nextInt());
        }

        Collections.sort(nums);

        System.out.println(nums);
    }
}
