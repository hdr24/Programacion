package Ejercicios10;

import java.util.ArrayList;

public class Ejercicio01 {
    public static void main(String[] args) {

        ArrayList<String>  nombres = new ArrayList<>(6);

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pepe");
        nombres.add("Franciso");
        nombres.add("Ana");
        nombres.add("Marta");

        System.out.println("Compañeros de clase: ");
        for (String compi: nombres) {
            System.out.println(compi);
        }
    }
}
