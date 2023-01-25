package Ejercicios09.Ejercicio06;

public class Tiempo {
    public int hora, min, seg;

    Tiempo(int h, int m, int s) {
        hora = h;
        min = m;
        seg = s;
        while (seg >= 60) {
            seg -= 60;
            min += 1;
        }
        while (min >= 60) {
            min -= 60;
            hora += 1;
        }
    }

    public void suma(int h, int m, int s) {
        this.hora += h;
        this.min += m;
        this.seg += s;

        while (seg >= 60) {
            seg -= 60;
            min += 1;
        }
        while (min >= 60) {
            min -= 60;
            hora += 1;
        }
    }

    public void resta(int h, int m, int s) {
        this.hora -= h;
        this.min -= m;
        this.seg -= s;

        while (seg < 0) {
            seg += 60;
            min -= 1;
        }
        while (min < 0) {
            min += 60;
            hora -= 1;
        }
    }

    public String toString() {
        return this.hora + "h " + this.min + "m " + this.seg + "s";
    }
}
