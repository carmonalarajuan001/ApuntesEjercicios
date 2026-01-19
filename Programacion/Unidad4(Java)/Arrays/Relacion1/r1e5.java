import java.util.ArrayList;

public class r1e5 {
    public static void main(String[] args) {
        // Crear un ArrayList llamado animales con algunos elementos
        ArrayList<String> animales = new ArrayList<>();
        animales.add("tortuga");
        animales.add("loro");
        animales.add("perro");
        animales.add("gato");

        // Eliminar el primer elemento (como shift() en JS)
        String eliminado = animales.remove(0); // remove(0) elimina y devuelve el primer elemento

        // Mostrar el ArrayList después de la eliminación
        System.out.println(animales);

        // Mostrar el valor del elemento eliminado
        System.out.println(eliminado);
    }
}