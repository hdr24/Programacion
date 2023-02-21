package Ejercicios09.Ejercicio03;

public class Lagarto extends Animal {

    private final String color;

    public Lagarto(Sexo s, String col) {
        super(s);
        color = col;
    }

    public String getColor() {
        return color;
    }

    public void repta() {
        System.out.println("*Slither* *Slither*");
    }

    public void tomaSol() {
        System.out.println("Estoy tomando el sol");
    }

    public void escondeArena() {
        System.out.println("Me estoy escondiendo en la arena");
        System.out.println("Ahora no me ves");
    }
}
