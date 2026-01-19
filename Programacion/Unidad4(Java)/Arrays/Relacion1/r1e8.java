import java.util.ArrayList;

public class r1e8 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(100);
        numeros.add(200);
        numeros.add(300);
        int tmp = numeros.get(2); // guardamos el último
        numeros.set(2, numeros.get(0));
        numeros.set(0, tmp);
        System.out.println("Números intercambiados: " + numeros);
    }
}
