package Ejercicios09.Ejercicio03;

public class PruebaAnimal {
    public static void main(String[] args) {
        Gato gati = new Gato(Animal.Sexo.HEMBRA, "naranja");
        System.out.println(gati.getSexo());
        Gato gate = new Gato(Animal.Sexo.MACHO, "blanco");
        System.out.println(gate.getSexo());
        System.out.println(gati.getSexo());

        Perro dog = new Perro(Animal.Sexo.MACHO, "dalmata");
        System.out.println(dog.getRaza() + dog.getSexo());
        dog.anda(3);

        Canario pajaro = new Canario(Animal.Sexo.MACHO, "Amarillo");
        pajaro.canta();


    }
}
