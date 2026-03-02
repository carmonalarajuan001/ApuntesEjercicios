package Programacion.Unidad5.EjercicioExamen;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoologico {
    private ArrayList<Animal> animales;

    public Zoologico() {
        this.animales = new ArrayList<>();
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void agregarAnimal(Animal animal) {
        this.animales.add(animal);
    }

    public Animal buscarAnimalCodigo(String codigo) {
        Animal encontrado = null;

        for (Animal animal : animales) {
            if (animal.getCodigo().equals(codigo)) {
                encontrado = animal; // asignamos y seguimos
            }
        }
        return encontrado;
    }

    public ArrayList<Boolean> eliminarAnimal(String codigo) {
        ArrayList<Boolean> controlErrores = new ArrayList<>(Arrays.asList(false, false, false));
        Animal animal = buscarAnimalCodigo(codigo);
        if (animal == null) {
            controlErrores.set(1, true); // No existe
        } else if (animal.getCantidad() > 0) {
            controlErrores.set(2, true); // Tiene ejemplares
        } else {
            animales.remove(animal);
            controlErrores.set(0, true); // Eliminado correctamente
        }
        return controlErrores; 
    }

    public ArrayList<Boolean> agregarEjemplares(String codigoPaAgregar, int numeroAnimalesAgregar) {
        ArrayList<Boolean> controlErroresAgregar = new ArrayList<>(Arrays.asList(false, false, false));
        Animal animal = buscarAnimalCodigo(codigoPaAgregar);
        if (animal == null) {
            controlErroresAgregar.set(1, true); // Animal no existe
        } else if (numeroAnimalesAgregar <= 0) {
            controlErroresAgregar.set(0, true); // Número inválido
        } else {
            animal.setCantidad(animal.getCantidad() + numeroAnimalesAgregar);
            controlErroresAgregar.set(2, true); // Operación correcta
        }
        return controlErroresAgregar; // ÚNICO RETURN
    }

    public ArrayList<Boolean> retirarEjemplares(String codigoPaRetirar, int numeroAnimalesRetirar) {
    ArrayList<Boolean> controlErroresRetirar =
            new ArrayList<>(Arrays.asList(false, false, false, false));
    Animal animal = buscarAnimalCodigo(codigoPaRetirar);
    if (animal == null) {
        controlErroresRetirar.set(1, true); // Animal no existe
    } else if (numeroAnimalesRetirar <= 0) {
        controlErroresRetirar.set(0, true); // Número inválido
    } else if (animal.getCantidad() < numeroAnimalesRetirar) {
        controlErroresRetirar.set(2, true); // No suficientes ejemplares
    } else {
        animal.setCantidad(animal.getCantidad() - numeroAnimalesRetirar);
        controlErroresRetirar.set(3, true); // Operación correcta
    }
    return controlErroresRetirar; 
}
}
