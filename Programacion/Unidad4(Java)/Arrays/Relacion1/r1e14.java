import java.util.ArrayList;

public class r1e14 {
    public static void main(String[] args) {
         ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(5);
        numeros2.add(10);
        numeros2.add(15);
        numeros2.add(20);
        int primerNumero = numeros2.remove(0); // shift
        numeros2.add(primerNumero); // push
        System.out.println("Array movido: " + numeros2);
    }
}
