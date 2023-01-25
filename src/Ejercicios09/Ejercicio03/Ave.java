package Ejercicios09.Ejercicio03;

public abstract class Ave extends Animal{
    Ave(Sexo s) {
        super(s);
    }

    public void vuela(int m) {
        for (int i = 0; i < m; i++) {
            if (i != 0)
                System.out.println("*vuela " + (i + 1) + " metros*");
            else
                System.out.println("*vuela un metro*");
        }
    }

    public void posarse() {
        int n = (int) (Math.random() * 4);
        switch (n) {
            case 0 -> System.out.println("Me poso en una rama");
            case 1 -> System.out.println("Me poso en el suelo");
            case 2 -> System.out.println("Me poso en una ventana");
            case 3 -> System.out.println("Me poso en un tejado");
        }
    }

    public void pia() {
        System.out.println("pio pio");
    }
}
