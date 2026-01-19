import java.util.ArrayList;

public class r1e15 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        while (!valores.isEmpty()) {
            valores.remove(valores.size() - 1); // pop
            System.out.println("Estado array: " + valores);
        }
    }
}
