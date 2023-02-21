package Ejercicios09.Ejercicio04;

public class Fraccion {
    private int numerador, denominador, signo;

    Fraccion(int n, int d) {
        if ((n < 0 || d < 0) && !(n < 0 && d < 0)) {
            signo = -1;
        } else {
            signo = 1;
        }
        numerador = Math.abs(n);
        denominador = Math.abs(d);
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setDenominador(int den) {
        this.denominador = den;
    }

    public void setNumerador(int num) {
        this.numerador = num;
    }

    public int getSigno() {
        return signo;
    }

    public void setSigno(int sig) {
        this.signo = sig;
    }

    public String toString() {
        if (signo > 0) {
            return this.numerador + "/" + this.denominador;
        } else {
            return "-" + this.numerador + "/" + this.denominador;
        }

    }

    public void invierte() {
        int d = this.denominador;
        this.denominador = this.numerador;
        this.numerador = d;
    }

    public void simplifica() {
        int mcd = 1;
        for (int i = 1; i <= this.numerador && i <= this.denominador; i++) {
            if (this.denominador % i == 0 && this.numerador % i == 0) {
                mcd = i;
            }
        }
        this.denominador /= mcd;
        this.numerador /= mcd;
    }

    public void multiplica(Fraccion fr) {
        this.numerador *= fr.numerador;
        this.denominador *= fr.denominador;
        if (this.signo == -1 && fr.signo == -1) {
            this.signo = 1;
        }
    }

    public void divide(Fraccion fr) {
        this.numerador *= fr.denominador;
        this.denominador *= fr.numerador;
        if (this.signo == -1 && fr.signo == -1) {
            this.signo = 1;
        }
    }

}
