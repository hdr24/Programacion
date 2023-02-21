package Ejercicios09.Ejercicio03;

public class PruebaAnimal {
    public static void main(String[] args) {

        // Gato
        Gato gati = new Gato(Animal.Sexo.HEMBRA, "naranja");
        gati.caza();
        gati.maulla();
        gati.juega();

        // Perro
        System.out.println();
        Perro dog = new Perro(Animal.Sexo.MACHO, "dalmata");
        dog.anda(3);
        dog.ladra();
        dog.persigueCola();
        dog.persigueArdilla();
        dog.duerme();
        dog.bebeLeche();
        System.out.println(dog.getRaza());
        //Canario
        System.out.println();
        Canario pajaro = new Canario(Animal.Sexo.MACHO, "amarillo");
        pajaro.pia();
        pajaro.canta();
        pajaro.baniate();
        pajaro.buscaGusano("maceta");
        System.out.println(pajaro.getColor());

        //Lagarto
        System.out.println();
        Lagarto liz = new Lagarto(Animal.Sexo.HERMAFRODITA, "verde");
        liz.escondeArena();
        liz.come();
        liz.repta();
        liz.tomaSol();

        //Pinguino
        System.out.println();
        Pinguino pingu = new Pinguino(Animal.Sexo.HEMBRA);
        pingu.come();
        pingu.vuela(3);
        pingu.posarse();
        pingu.pesca();
        pingu.pesca();

    }
}
