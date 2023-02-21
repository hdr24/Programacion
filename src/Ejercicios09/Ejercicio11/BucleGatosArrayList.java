package Ejercicios09.Ejercicio11;

import Ejercicios09.Ejercicio03.Animal;
import Ejercicios09.Ejercicio03.Gato;

import java.util.ArrayList;
import java.util.Scanner;

public class BucleGatosArrayList {
    public static void main(String[] args) {
        ArrayList <Gato> Gatos = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String color;
        Animal.Sexo sexo;
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduzca el sexo del gato " + (i + 1));
            sexo = Animal.Sexo.valueOf(s.next().toUpperCase());
            System.out.println("Introduzca el color del gato " + (i + 1));
            color = s.next();
            Gatos.add(i, new Gato(sexo, color));
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("El gato " + (i + 1) + " es un/a " + Gatos.get(i).getSexo() + " " + Gatos.get(i).getColor());
        }
    }
}
