package Ejercicios06;

public class Ejercicio16 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 5);
        int num2 = (int) (Math.random() * 5);
        int num3 = (int) (Math.random() * 5);
        String tirada1 = "", tirada2 = "", tirada3 = "";

        switch (num1) {
            case 0:
                tirada1 = "corazón";
                break;
            case 1:
                tirada1 = "herradura";
                break;
            case 2:
                tirada1 = "diamente";
                break;
            case 3:
                tirada1 = "campana";
                break;
            case 4:
                tirada1 = "limón";
                break;
        }

        switch (num2) {
            case 0:
                tirada2 = "corazón";
                break;
            case 1:
                tirada2 = "herradura";
                break;
            case 2:
                tirada2 = "diamente";
                break;
            case 3:
                tirada2 = "campana";
                break;
            case 4:
                tirada2 = "limón";
                break;
        }

        switch (num3) {
            case 0:
                tirada3 = "corazón";
                break;
            case 1:
                tirada3 = "herradura";
                break;
            case 2:
                tirada3 = "diamente";
                break;
            case 3:
                tirada3 = "campana";
                break;
            case 4:
                tirada3 = "limón";
                break;
        }
        System.out.println(tirada1 + " " + tirada2 + " " + tirada3);
        if (num1 == num2 && num1 == num3) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else {
            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Bien, ha recuperado su moneda");
            } else {
                System.out.println("Lo siento, ha perdido todo su dinero");
            }
        }

    }
}
