package Ejercicios09.Ejercicio03;

public class Pinguino extends Ave{


    Pinguino(Sexo s) {
        super(s);
    }

    @Override
    public void vuela(int m) {
        System.out.println("No puedo volar :(");
    }

    @Override
    public void posarse() {
        System.out.println("*Se posa en el hielo*");
    }

    public void pesca() {
        int n = (int) (Math.random() * 2);
        if (n == 0)
            System.out.println("He pescado un pez");
        else
            System.out.println("No he pescado nada");
    }
}
