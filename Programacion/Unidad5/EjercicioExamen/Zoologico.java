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

    public void eliminarAnimal(String codigo) {
        Animal animal = buscarAnimalCodigo(codigo);
        ArrayList<Boolean> controlErrores = new ArrayList<>(Arrays.asList(false, false, false));
        if (animal.getCantidad() == 0) {
            animales.remove(animal);
            controlErrores.set(0, true);
        } else if (animal.getCodigo() == null) {
            controlErrores.set(1, true);
        } else if (animal.getCantidad() > 0) {
            controlErrores.set(2, true);
        }
    }

    public ArrayList<Boolean> agregarEjemplares(String codigoPaAgregar, int numeroAnimalesAgregar) {
        Animal animal = buscarAnimalCodigo(codigoPaAgregar);
        int numeroEjemplares;
        numeroEjemplares = animal.getCantidad();
        ArrayList<Boolean> controlErroresAgregar = new ArrayList<>(Arrays.asList(false, false, false));
        if (animal != null) {
            if (numeroAnimalesAgregar < 0) {
                controlErroresAgregar.set(0, true);
            }else{
                numeroEjemplares += numeroAnimalesAgregar;
            }
        }else{
            controlErroresAgregar.set(1,true);
        }
        //TENDRIA QUE BUSCAR ALGUN MODO DE DEVOLVER EL NUMERO DE EJEMPLARES YA QUE EL CODIGO ESTA HECHO FENOMENO YA
        return controlErroresAgregar;
    }

}
