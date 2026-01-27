
import java.util.ArrayList;

public class r1e5 {
     public static String caraOcruz() {

        Integer cara0cruzz;
        String resultado1o2;
        cara0cruzz = (int) ((Math.random() * (2 - 1 + 1)) + 1);
        if (cara0cruzz == 1) {
            resultado1o2 = "cara";
        } else {
            resultado1o2 = "cruz";
        }
        return resultado1o2;
    }
    public static ArrayList<String> listaCarasOCruces() {
        ArrayList<String> arrayCaraCruz = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayCaraCruz.add(caraOcruz());
        }

        return arrayCaraCruz;
    }


    public static void main(String[] args) {
        System.out.println(listaCarasOCruces());
    }
}
