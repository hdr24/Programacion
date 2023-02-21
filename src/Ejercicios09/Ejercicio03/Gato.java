package Ejercicios09.Ejercicio03;

public class Gato extends Animal {
    private final String color;
    public Gato(Sexo s, String c) {
        super(s);
        color = c;
    }
    public String getColor() {
        return color;
    }

    public void maulla() {
        System.out.println("Miau");
    }

    public void caza() {
        int n = (int) (Math.random() * 2);
        if (n == 0)
            System.out.println("He cazado un pájaro");
        else
            System.out.println("No he cazado nada");
    }

    public void juega() {
        System.out.println("Juego con un ratón");
    }
}