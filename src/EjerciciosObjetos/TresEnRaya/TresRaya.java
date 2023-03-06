package EjerciciosObjetos.TresEnRaya;

public class TresRaya {

    private int[] tablero = new int[9];

    TresRaya() {
        for (int i = 0; i < 9; i++) {
            tablero[i] = 0;
        }
    }

    public void dibujaTablero() {

        System.out.println();
        System.out.printf("%4s", "");
        System.out.println("┌───┬───┬───┐");
        int j = 0;
        for (int i = 0; i < 7; i += 3) {
            System.out.printf("%4s", j + " ");
            System.out.print("│");

            System.out.printf("%4s", valorCasilla(tablero[i]) + " │");
            System.out.printf("%4s", valorCasilla(tablero[i + 1]) + " │");
            if (i != 6) {
                System.out.printf("%4s", valorCasilla(tablero[i + 2]) + " │");
                System.out.println();
                System.out.println("    ├───┼───┼───┤");

            } else {
                System.out.printf("%4s", valorCasilla(tablero[i + 2]) + " │");
                System.out.println();
            }

            j++;
        }
        System.out.println("    └───┴───┴───┘");
    }

    // Convierte valor del tablero en String
    public String valorCasilla(int valor) {
        switch (valor) {
            case 0 -> {
                return " ";
            }
            case 1 -> {
                return "X";
            }
            case 2 -> {
                return "O";
            }
        }
        return null;
    }

    public void mueveJugador1(int pos) {
        pos--;
        if (pos >= 0 && pos < 9 && movimientoValido(pos)) {
            this.tablero[pos] = 1;
        }
    }

    public void mueveJugador2(int pos) {
        pos--;
        if (pos >= 0 && pos < 9 && movimientoValido(pos)) {
            this.tablero[pos] = 2;
        }
    }

    boolean movimientoValido(int pos) {
        if (pos >= 0 && pos < 9) {
            return this.tablero[pos] == 0;
        }
        return false;
    }

    void mueveOrdenador1() {
        int pos;
        do {
            pos = (int) (Math.random() * 9);
        } while (!movimientoValido(pos));

        this.tablero[pos] = 1;
    }

    void mueveOrdenador2() {
        int pos;
        do {
            pos = (int) (Math.random() * 9);
        } while (!movimientoValido(pos));

        this.tablero[pos] = 2;
    }

    void iniciar() {
        for (int i = 0; i < 9; i++) {
            this.tablero[i] = 0;
        }
    }

    boolean quedanMovimientos() {
        for (int i = 0; i < 9; i++) {
            if (this.tablero[i] == 0)
                return true;
        }
        return false;
    }

    boolean ganaJugador1() {
        return (this.tablero[0] == 1 && this.tablero[1] == 1 && this.tablero[2] == 1)
                || (this.tablero[3] == 1 && this.tablero[4] == 1 && this.tablero[5] == 1)
                || (this.tablero[6] == 1 && this.tablero[7] == 1 && this.tablero[8] == 1)
                || (this.tablero[0] == 1 && this.tablero[3] == 1 && this.tablero[6] == 1)
                || (this.tablero[1] == 1 && this.tablero[4] == 1 && this.tablero[7] == 1)
                || (this.tablero[2] == 1 && this.tablero[5] == 1 && this.tablero[8] == 1)
                || (this.tablero[0] == 1 && this.tablero[4] == 1 && this.tablero[8] == 1)
                || (this.tablero[2] == 1 && this.tablero[4] == 1 && this.tablero[6] == 1);
    }

    boolean ganaJugador2() {
        return (this.tablero[0] == 2 && this.tablero[1] == 2 && this.tablero[2] == 2)
                || (this.tablero[3] == 2 && this.tablero[4] == 2 && this.tablero[5] == 2)
                || (this.tablero[6] == 2 && this.tablero[7] == 2 && this.tablero[8] == 2)
                || (this.tablero[0] == 2 && this.tablero[3] == 2 && this.tablero[6] == 2)
                || (this.tablero[1] == 2 && this.tablero[4] == 2 && this.tablero[7] == 2)
                || (this.tablero[2] == 2 && this.tablero[5] == 2 && this.tablero[8] == 2)
                || (this.tablero[0] == 2 && this.tablero[4] == 2 && this.tablero[8] == 2)
                || (this.tablero[2] == 2 && this.tablero[4] == 2 && this.tablero[6] == 2);
    }
}
