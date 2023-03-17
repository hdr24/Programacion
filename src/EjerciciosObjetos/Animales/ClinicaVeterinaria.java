package EjerciciosObjetos.Animales;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClinicaVeterinaria {

    private ArrayList<Animal> listaAnimales;

    public ClinicaVeterinaria() {
        this.listaAnimales = new ArrayList<>();
    }

    public void insertaAnimal(Animal animal) {
        this.listaAnimales.add(animal);
    }

    public Animal buscaAnimal(String nombre) {
        for (Animal animal : listaAnimales) {
            if (animal.getNombre().equals(nombre)) {
                return animal;
            }
        }
        return new Perro("null", LocalDate.now(), 0, Perro.RazaPerro.Dalmata, "0");
    }

    public void modificaComentarioAnimal(String nombre, String comentario) {
        Animal animalEditado = buscaAnimal(nombre);
        animalEditado.setComentarios(comentario);
        int index = 0;
        boolean existeNombre = false;
        for (Animal animal:listaAnimales) {
            if (animal.nombre.equals(nombre)) {
                existeNombre = true;
                break;
            }
            index++;
        }
        if (existeNombre) {
            listaAnimales.set(index, animalEditado);
        }
    }

    @Override
    public String toString() {
        String listaString = "";
        for (Animal animal: listaAnimales) {
            listaString = listaString.concat(String.valueOf(animal)) + "\n\n";
        }
        return listaString;
    }

}
