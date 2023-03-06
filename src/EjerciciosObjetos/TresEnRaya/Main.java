package EjerciciosObjetos.TresEnRaya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TresRaya juego = new TresRaya();
        Scanner s = new Scanner(System.in);
        int opcion, pos;
        boolean entrada = true;
        boolean turnoFlag = true;

        System.out.println("Bienvenido al Tres en Raya");


        while (entrada) {
            juego.iniciar();
            System.out.println("Escoja una opción:");
            System.out.println("1. Jugador vs Jugador");
            System.out.println("2. Jugador vs Ordenador");
            System.out.println("3. Ordenador vs ordenador");
            System.out.println("4. Salir");
            System.out.print("Escoja una opción:");
            opcion = s.nextInt();

            switch (opcion) {
                case 1 -> {
                    do {
                        if (turnoFlag) {
                            System.out.println("Jugador 1, introduzca posicion(1-9)");
                            pos = s.nextInt();
                            juego.mueveJugador1(pos);
                            turnoFlag = false;
                        } else {
                            System.out.println("Jugador 2, introduzca posicion(1-9)");
                            pos = s.nextInt();
                            juego.mueveJugador2(pos);
                            turnoFlag = true;
                        }
                        juego.dibujaTablero();
                    } while (!((juego.ganaJugador1()) || (juego.ganaJugador2())) && (juego.quedanMovimientos()));
                    finPartida(juego);
                }
                case 2 -> {
                    do {
                        if (turnoFlag) {
                            System.out.println("Jugador 1, introduzca posicion(1-9)");
                            pos = s.nextInt();
                            juego.mueveJugador1(pos);
                            turnoFlag = false;
                        } else {
                            juego.mueveOrdenador2();
                            turnoFlag = true;
                        }
                        juego.dibujaTablero();
                    } while (!((juego.ganaJugador1()) || (juego.ganaJugador2())) && (juego.quedanMovimientos()));
                    finPartida(juego);
                }
                case 3 -> {
                    do {
                        if (turnoFlag) {
                            juego.mueveOrdenador1();
                            turnoFlag = false;
                        } else {
                            juego.mueveOrdenador2();
                            turnoFlag = true;
                        }
                        juego.dibujaTablero();
                    } while (!((juego.ganaJugador1()) || (juego.ganaJugador2())) && (juego.quedanMovimientos()));
                    finPartida(juego);
                }
                case 4 -> entrada = false;
            }
        }

    }

    public static void finPartida(TresRaya juego) {
        if (juego.ganaJugador1()) {
            System.out.println("Gana jugador 1");
        } else if (juego.ganaJugador2()) {
            System.out.println("Gana jugador 2");
        } else {
            System.out.println("Empate");
        }
    }
}
