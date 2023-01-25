package Ejercicios09.Ejercicio04;

public class Fraccion {
    public int numerador, denominador;

    Fraccion(int n, int d) {
        numerador = n;
        denominador = d;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void imprime() {
        System.out.println(this.getNumerador());
        System.out.println("——");
        System.out.println(this.getDenominador());
    }

    public void invierte() {
        int d = this.denominador;
        this.denominador = this.numerador;
        this.numerador = d;
    }

    public void simplifica() {
        int mcd = 1;
        for (int i = 1; i <= this.numerador && i <= this.denominador; i++) {
            if (this.denominador % i == 0 && this.numerador % i == 0)
                mcd = i;
        }
        this.denominador /= mcd;
        this.numerador /= mcd;
    }

    public void multiplica(Fraccion fr) {
        this.numerador *= fr.numerador;
        this.denominador *= fr.denominador;
    }

    public void divide(Fraccion fr) {
        this.numerador *= fr.denominador;
        this.denominador *= fr.numerador;
    }

}
