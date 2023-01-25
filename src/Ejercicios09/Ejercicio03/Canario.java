package Ejercicios09.Ejercicio03;

public class Canario extends Ave {

    public String color;
    Canario(Sexo s, String c) {
        super(s);
        color = c;
    }

    public void canta() {
        System.out.println("Tririri");
    }




}
