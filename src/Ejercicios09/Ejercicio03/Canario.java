package Ejercicios09.Ejercicio03;

public class Canario extends Ave {

    private final String color;
    public Canario(Sexo s, String c) {
        super(s);
        color = c;
    }

    public String getColor() {
        return color;
    }

    public void canta() {
        System.out.println("Tririri");
    }

    public void baniate() {
        System.out.println("Me estoy limpiando las plumas");
    }

    public void buscaGusano(String lugar) {
        int n = (int) (Math.random() * 2);
        if (n == 0)
            System.out.println("He encontrado un gusano");
        else
            System.out.println("No he encontrado ningun gusano en el/la " + lugar);
    }
}
