package Ejercicios09.Ejercicio03;


/*
public class Gato extends Mamifero {
    public String color;

    public Gato(Sexo s, String col) {
        super(s);
        color = col;
    }

    public void maulla() {
        System.out.println("Miau");
    }

    public void juega() {
        System.out.println("El gato juega con un ratón");
    }

    public void caza() {
        int n = (int) (Math.random() * 2);
        if (n == 0)
            System.out.println("He cazado un pájaro");
        else
            System.out.println("No he cazado nada");
    }

    public String getColor() {return color;}
}
*/


public class Gato extends Animal {
    private String color;
    public Gato (Sexo s, String c) {
        super(s);
        color = c;
    }
    public Gato (Sexo s) {
        super(s);
        color = "siamés";
    }
    public Gato (String c) {
        super(Sexo.HEMBRA);
        color = c;
    }
    public Gato () {
        super(Sexo.HEMBRA);
        color = "siamés";
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return super.toString()
                + "Color: " + this.color
                + "\n*************************\n";
    }
    /**
     * Hace que el gato maulle.
     */
    public void maulla() {
        System.out.println("Miauuuu");
    }
    /**
     * Hace que el gato ronronee
     */
    public void ronronea() {
        System.out.println("mrrrrrr");
    }
    /**
     * Hace que el gato coma.
     * A los gatos les gusta el pescado, si le damos otra comida
     * la rechazará.
     *
     * @param comida la comida que se le ofrece al gato
     */
    public void come(String comida) {
        if (comida.equals("pescado")) {
            System.out.println("Hmmmm, gracias");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }
    /**
     * Pone a pelear dos gatos.
     * Solo se van a pelear dos machos entre sí.
     *
     * @param contrincante es el gato contra el que pelear
     */
    public void peleaCon(Gato contrincante) {
        if (this.getSexo() == Sexo.HEMBRA) {
            System.out.println("no me gusta pelear");
        } else {
            if (contrincante.getSexo() == Sexo.HEMBRA) {
                System.out.println("no peleo contra gatitas");
            } else {
                System.out.println("ven aquí que te vas a enterar");
            }
        }
    }
}