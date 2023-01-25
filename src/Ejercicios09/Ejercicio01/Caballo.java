package Ejercicios09.Ejercicio01;

public class Caballo {
    String color, raza, sexo;

    Caballo (String s) {
        this.sexo = s;
    }

    String getSexo() {
        return this.sexo;
    }

    void relincha() {
        System.out.println("fffffff");
    }

    void trota() {
        System.out.println("toctoctoc");
    }

    void cabalga() {
        System.out.println("TOCTOCTOC");
    }
}
