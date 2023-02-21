package Ejercicios09.Ejercicio03;

public class Perro extends Mamifero {

    private final String raza;

    Perro(Sexo s, String r) {
        super(s);
        raza = r;
    }

    public String getRaza() {return raza;}

    public void ladra() {
        System.out.println("Guau guau");
    }

    public void persigueCola() {
        System.out.println("*Da vueltas persiguiendo su cola*");
    }

    public void persigueArdilla() {
        System.out.println("*Va detras de una ardilla*");
    }
}
