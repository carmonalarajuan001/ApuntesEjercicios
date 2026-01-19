import java.util.ArrayList;

public class r1e4 {
     public static void main(String[] args) {
        // Crear un ArrayList llamado animales con los elementos "perro" y "gato"
        ArrayList<String> animales = new ArrayList<>();
        animales.add("perro");
        animales.add("gato");

        // Añadir "loro" al inicio del ArrayList
        animales.add(0, "loro");

        // Añadir "tortuga" al inicio del ArrayList
        animales.add(0, "tortuga");

        // Imprimir el ArrayList completo
        System.out.println(animales);
        //Para insertar al inicio en ArrayList, se usa add(0, elemento).
    }
}
