package Ejercicios09.Ejercicio04;

public class PruebaFraccion {
    public static void main(String[] args) {
        Fraccion frac = new Fraccion(2, 3);
        Fraccion fr = new Fraccion(2, 4);

        frac.multiplica(fr);
        frac.imprime();
        frac.denominador = 3;
        frac.numerador = 2;
        frac.imprime();
        frac.divide(fr);
        frac.simplifica();
        frac.imprime();
    }

}
