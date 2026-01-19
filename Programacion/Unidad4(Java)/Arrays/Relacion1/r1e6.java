
import java.util.ArrayList;
public class r1e6 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("manzana");
        frutas.add("banana");
        frutas.add("naranja");
        frutas.remove(0); // elimina el primer elemento (shift)
        frutas.add("fresa"); // añade al final (push)
        System.out.println("Frutas: " + frutas);
    }
}
