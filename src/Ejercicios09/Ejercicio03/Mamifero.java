package Ejercicios09.Ejercicio03;

public abstract class Mamifero extends Animal {

    Mamifero(Sexo s) {
        super(s);
    }

    public void anda(int numPas) {
        for (int i = 0; i < numPas; i++) {
            if (i != 0)
                System.out.println("*da " + (i + 1) + " pasos*");
            else
                System.out.println("*da un paso*");
        }
    }
}
