import java.util.ArrayList;
public class r1e10 {
    public static void main(String[] args) {
        ArrayList<Integer> pila = new ArrayList<>();
        pila.add(10);
        pila.add(20);
        pila.add(30);
        System.out.println("Pila inicial: " + pila);
        int extraido = pila.remove(pila.size() - 1); // pop
        System.out.println("Elemento extraído: " + extraido);
        System.out.println("Pila ahora: " + pila);
        extraido = pila.remove(pila.size() - 1);
        System.out.println("Elemento extraído: " + extraido);
        System.out.println("Pila ahora: " + pila);
        extraido = pila.remove(pila.size() - 1);
        System.out.println("Elemento extraído: " + extraido);
        System.out.println("Pila ahora: " + pila);
    }
}
