package Ejercicios09.Ejercicio12;

import Ejercicios09.Ejercicio03.Animal;
import Ejercicios09.Ejercicio03.Gato;

import java.util.Queue;

public class GatosDirecto {
    public static void main(String[] args) {
        Gato[] gatos = new Gato[4];
        gatos[0] = new Gato(Animal.Sexo.MACHO, "naranja");
        gatos[1] = new Gato(Animal.Sexo.HEMBRA, "blanco");
        gatos[2] = new Gato(Animal.Sexo.HEMBRA, "negro");
        gatos[3] = new Gato(Animal.Sexo.MACHO, "blanco");
        for (int i = 0; i < 4; i++) {
            System.out.println(gatos[i]);
        }
    }
}
