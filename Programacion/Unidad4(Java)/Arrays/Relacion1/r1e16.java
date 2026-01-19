import java.util.ArrayList;

public class r1e16 {
    public static void main(String[] args) {
         ArrayList<Integer> secuencia = new ArrayList<>();
        final int CANTIDADNUMEROS = 5;
        for (int i = 1; i <= CANTIDADNUMEROS; i++) {
            secuencia.add(i);
        }
        System.out.println("Secuencia: " + secuencia);
    }
}