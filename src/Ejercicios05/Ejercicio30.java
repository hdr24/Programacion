package Ejercicios05;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        int diaNum1, hora1, diaNum2, hora2, totalHoras = 0;
        String diaStr1 = "", diaStr2 = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la primera hora: ");
        System.out.print("Día (1-7): ");
        diaNum1 = s.nextInt();
        System.out.print("Hora (0-23): ");
        hora1 = s.nextInt();
        System.out.println("Introduzca la segunda hora:");
        System.out.print("Día (1-7): ");
        diaNum2 = s.nextInt();
        System.out.print("Hora (0-23): ");
        hora2 = s.nextInt();
        if ((diaNum1 > 7 || diaNum1 < 0) || (diaNum2 > 7 || diaNum2 < 0) || (hora1 > 23 || hora1 < 0) || (hora2 > 23 || hora2 < 0) || (diaNum1 >= diaNum2 && hora1 >= hora2)) {
            System.out.println("Los datos introducidos no son correctos o el segundo día no es posterior al primero.");
        } else {
            switch (diaNum1) {
                case 1:
                    diaStr1 = "lunes";
                    break;

                case 2:
                    diaStr1 = "martes";
                    break;

                case 3:
                    diaStr1 = "miércoles";
                    break;

                case 4:
                    diaStr1 = "jueves";
                    break;

                case 5:
                    diaStr1 = "viernes";
                    break;

                case 6:
                    diaStr1 = "sábado";
                    break;

                case 7:
                    diaStr1 = "domingo";
                    break;

                default:
                    System.out.println("Esta línea no se ejecuta nunca");
            }

            switch (diaNum2) {
                case 1:
                    diaStr2 = "lunes";
                    break;

                case 2:
                    diaStr2 = "martes";
                    break;

                case 3:
                    diaStr2 = "miércoles";
                    break;

                case 4:
                    diaStr2 = "jueves";
                    break;

                case 5:
                    diaStr2 = "viernes";
                    break;

                case 6:
                    diaStr2 = "sábado";
                    break;

                case 7:
                    diaStr2 = "domingo";
                    break;
                default:
                    System.out.println("Esta línea no se ejecuta nunca");
            }
            for (int i = diaNum1; i < diaNum2; i++ ) {
                totalHoras += 24;
            }
            if (hora1 > hora2) {
                System.out.println("Entre las " + hora1 + ":00 del " + diaStr1 + " y las " + hora2 + ":00 del " + diaStr2 + " hay " + (totalHoras - (hora1 - hora2)) + " hora/s");
            } else if (hora1 == hora2) {
                System.out.println("Entre las " + hora1 + ":00 del " + diaStr1 + " y las " + hora2 + ":00 del " + diaStr2 + " hay " +totalHoras + " hora/s");
            } else {
                System.out.println("Entre las " + hora1 + ":00 del " + diaStr1 + " y las " + hora2 + ":00 del " + diaStr2 + " hay " + (totalHoras + (hora2 - hora1)) + " hora/s");
            }
        }
    }
}
