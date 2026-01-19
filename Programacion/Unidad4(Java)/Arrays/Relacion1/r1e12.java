import java.util.ArrayList;
public class r1e12 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
         nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Carlos"); 
        nombres.add("Laura"); 
        String eliminadoPrincipio = nombres.remove(0);
        String eliminadoFinal = nombres.remove(nombres.size() - 1);
        System.out.println("Nombres después de eliminar: " + nombres +
                           " | Eliminados: " + eliminadoPrincipio + ", " + eliminadoFinal);
    }
}
