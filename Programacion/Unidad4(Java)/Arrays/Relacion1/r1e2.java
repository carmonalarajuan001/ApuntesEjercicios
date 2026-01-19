import java.util.ArrayList;
public class r1e2 {
    public static void main(String[] args) {
       // En Java NO existen arrays dinámicos como en JS,
        // por eso usamos ArrayList
        ArrayList<String> colores = new ArrayList<>();

        // En lugar de push(), en Java se usa add()
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");

        // Para imprimir el contenido completo del ArrayList
        System.out.println(colores);


    }
}
