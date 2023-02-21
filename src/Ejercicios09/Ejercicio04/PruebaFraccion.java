package Ejercicios09.Ejercicio04;

public class PruebaFraccion {
    public static void main(String[] args) {
        Fraccion frac = new Fraccion(-2, -13);
        Fraccion fr = new Fraccion(-2, 4);


        System.out.println(fr);
        System.out.println(frac);
        frac.multiplica(fr);
        System.out.println(frac);
        frac.simplifica();
        System.out.println(frac);
        frac.invierte();
        System.out.println(frac);
        frac.divide(fr);
        System.out.println(frac);

        fr.setDenominador(2);
        fr.setNumerador(4);
        fr.setSigno(1);

        System.out.println(fr.getDenominador());
        System.out.println(fr.getNumerador());
        System.out.println(fr.getSigno());

        fr.simplifica();
        System.out.println(fr);
    }

}
