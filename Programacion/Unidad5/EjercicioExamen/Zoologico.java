package Programacion.Unidad5.EjercicioExamen;
import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animales;
    public Zoologico() {
        this.animales = new ArrayList<>();
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    private void imprimirMensajeError(String mensajeError){
        System.err.println(mensajeError);
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

    public void eliminarAnimal(Animal animal) {
        if (animal.getCantidad()==0) {
            this.animales.remove(animal);
        }else {
            imprimirMensajeError("No se puede eliminar un animal con ejemplares disponibles.");
        }
        
    }

}
