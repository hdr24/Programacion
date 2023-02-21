package Ejercicios10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio04 {    public static void main(String[] args) {
    ArrayList<String> palabras = new ArrayList<>(10);
    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca 10 palabras");

    for (int i = 0; i < 10; i++) {
        palabras.add(i, s.next());
    }

    Collections.sort(palabras);

    System.out.println(palabras);
}
}
