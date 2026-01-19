import java.util.ArrayList;
public class r1e11 {
    public static void main(String[] args) {
         ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add(0, "Carlos"); // al inicio
        nombres.add("Laura"); // al final
        System.out.println("Nombres: " + nombres);
    }
}
