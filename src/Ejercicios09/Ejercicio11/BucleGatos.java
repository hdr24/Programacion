package Ejercicios09.Ejercicio11;

import Ejercicios09.Ejercicio03.Animal;
import Ejercicios09.Ejercicio03.Gato;

import java.util.Scanner;

public class BucleGatos {
    public static void main(String[] args) {
        Gato[] Gatos = new Gato[4];
        Scanner s = new Scanner(System.in);
        String color;
        Animal.Sexo sexo;
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduzca el sexo del gato " + (i + 1));
            sexo = Animal.Sexo.valueOf(s.next().toUpperCase());
            System.out.println("Introduzca el color del gato " + (i + 1));
            color = s.next();
            Gatos[i] = new Gato(sexo, color);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("El gato " + (i + 1) + " es un/a " + Gatos[i].getSexo() + " " + Gatos[i].getColor());
        }
    }

}
