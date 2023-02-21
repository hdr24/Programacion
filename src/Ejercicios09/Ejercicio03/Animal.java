package Ejercicios09.Ejercicio03;

public abstract class Animal {
        public enum Sexo {
                MACHO, HEMBRA, HERMAFRODITA
        }
        private final Sexo sexo;

        public Animal(Sexo s) {
                sexo = s;
        }

        public Sexo getSexo() {
                return sexo;
        }

        public String toString() {
                return "Sexo: " + this.sexo + "\n";
        }

        public void duerme() {
                System.out.println("zZzZzZzZzZ");
        }

        public void come() {
                System.out.println("nom nom nom");
        }
}