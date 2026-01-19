import java.util.ArrayList;

public class r1e3 {
    public static void main(String[] args) {
        
    
     // Creamos el ArrayList como en el ejercicio anterior
        ArrayList<String> colores = new ArrayList<>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");

        // En Java NO existe pop()
        // remove(size - 1) elimina y devuelve el último elemento
        String eliminado = colores.remove(colores.size() - 1);

        // Mostramos el array resultante
        System.out.println(colores);

        // Mostramos el elemento eliminado
        System.out.println(eliminado);
        }
}
