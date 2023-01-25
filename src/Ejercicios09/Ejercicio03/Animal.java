package Ejercicios09.Ejercicio03;

/*
public abstract class Animal {
    public Object getSexo;

    public enum Sexo {
        MACHO, HEMBRA, HERMAFRODITA
    }
    public static Sexo sexo;

    public Animal(Sexo s) {
        sexo = s;
    }
    
    public void duerme() {
        System.out.println("zZzZzZzZzZ");
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void come() {
        System.out.println("nom nom nom");
    }
}
*/
public abstract class Animal {
        public enum Sexo {
                MACHO, HEMBRA, HERMAFRODITA
        }
        private Sexo sexo;
        public Animal() {
                sexo = Sexo.MACHO;
        }

        public Animal(Sexo s) {
                sexo = s;
        }

        public Sexo getSexo() {
                return sexo;
        }

        public String toString() {
                return "Sexo: " + this.sexo + "\n";
        }
}