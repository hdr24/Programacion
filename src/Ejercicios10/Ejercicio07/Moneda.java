package Ejercicios10.Ejercicio07;



public class Moneda {


    public Valor valor;
    public Pos pos;
    public enum Valor {
    UN_CENT,DOS_CENT,CINCO_CENT,
        DIEZ_CENT, VEINTICINCO_CENT,
        CINCUENTA_CENT, UN_EURO, DOS_EURO
}
    public enum Pos {
        CARA, CRUZ
    }

    public Moneda(int valor, int pos) {
        switch (valor) {
            case 0 -> this.valor = Valor.UN_CENT;
            case 1 -> this.valor = Valor.DOS_CENT;
            case 2 -> this.valor = Valor.CINCO_CENT;
            case 3 -> this.valor = Valor.DIEZ_CENT;
            case 4 -> this.valor = Valor.VEINTICINCO_CENT;
            case 5 -> this.valor = Valor.CINCUENTA_CENT;
            case 6 -> this.valor = Valor.UN_EURO;
            case 7 -> this.valor = Valor.DOS_EURO;
        }

        if (pos == 0) {
            this.pos = Pos.CARA;
        } else {
            this.pos = Pos.CRUZ;
        }
    }

    @Override
    public String toString() {
        String val = "", pos;
        switch (this.valor) {
            case UN_CENT -> val = "Un centimo";
            case DOS_CENT -> val = "Dos centimos";
            case CINCO_CENT -> val = "Cinco centimos";
            case DIEZ_CENT -> val = "Diez centimos";
            case VEINTICINCO_CENT -> val = "Veinticinco centimos";
            case CINCUENTA_CENT -> val = "Cincuenta centimos";
            case UN_EURO -> val = "Un euro";
            case DOS_EURO -> val = "Dos euros";
        }

        if (this.pos == Pos.CARA) {
            pos = "Cara";
        } else {
            pos = "Cruz";
        }
        return val + " - " + pos;
    }
}


