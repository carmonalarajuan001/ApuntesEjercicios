import java.util.ArrayList;

public class r1e7 {
    public static void main(String[] args) {
         ArrayList<String> dias = new ArrayList<>();
        dias.add("L");
        dias.add("M");
        dias.add("X");
        dias.add("J");
        dias.add("V");
        dias.add("S");
        dias.add("domingo");
        dias.set(6, "Domingo (fin de semana)"); // acceso directo por índice
        System.out.println("Días: " + dias);
    }
}
