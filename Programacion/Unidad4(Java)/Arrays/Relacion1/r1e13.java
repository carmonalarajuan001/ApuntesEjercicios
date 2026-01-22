import java.util.ArrayList;
public class r1e13 {
    public static void main(String[] args) {
         ArrayList<String> letras = new ArrayList<>();
        letras.add("a");
        letras.add("b");
        letras.add("c");
        letras.add("d");
        ArrayList<String> invertido = new ArrayList<>();
        while (!letras.isEmpty()) {
            invertido.add(letras.remove(letras.size() - 1)); // simula pop
        }
        //hacemos una copia al principio del array por si me pide el array original tb
        System.out.println("Array invertido: " + invertido);
    }
    
}
