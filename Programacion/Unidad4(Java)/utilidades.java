
// Hacer por una funcion que te pida lo minimo 5 cosas de algo
// Mostrar menu tiene q estar 100x100
// Mostrar mensaje tiene q estar tambien
// EN VEZ DE HACER UN TRY CATCH HACEMOS UN ARRAY COON LAS OPCIONES Y PONEMOS UN CONTAINS PARA VER SI ESTA.
import java.util.Scanner;
import java.util.Arrays;

public class utilidades {


 


    // 6. Validar opcion con contains
    public static boolean opcionValida(String opcion, String[] opcionesValidas) {
        return Arrays.asList(opcionesValidas).contains(opcion);
    }



    //PRINCIPIO PARA UN PROGRAMA DE MENÚ
    //PRINCIPIO PARA UN PROGRAMA DE MENÚ
    //PRINCIPIO PARA UN PROGRAMA DE MENÚ
    //PRINCIPIO PARA UN PROGRAMA DE MENÚ
    //PRINCIPIO PARA UN PROGRAMA DE MENÚ
    //PRINCIPIO PARA UN PROGRAMA DE MENÚ
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class nombreEjercicio {
    public static void mostrarMenu() {
        System.out.println("1.  Añadir ruta");
        System.out.println("2.  Listar rutas");
        System.out.println("3. Calcular consumo (por índice)");
        System.out.println("4. Eliminar ruta (por índice)");
        System.out.println("0. Salir");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = true;
        int opcion;

        ArrayList<Double> aRRAYnumerosDecimales = new ArrayList<>(
                Arrays.asList());
        ArrayList<String> aRRAYstring = new ArrayList<>(
                Arrays.asList());
        ArrayList<Integer> aRRAYnumeros = new ArrayList<>(
                Arrays.asList());

        while (entradaValida) {
            try {
                mostrarMenu();
                opcion = scanner.nextInt();
                scanner.nextLine(); // limpiar buffer
            } catch (Exception e) {
                System.out.println("Error: debes introducir un número.");
                scanner.nextLine(); // limpiar lo que haya quedado
                entradaValida = false;
            }
            if (opcion == 1) {

            } else if (opcion == 2) {

            } else if (opcion == 3) {

            } else if (opcion == 4) {

            } else if (opcion == 0) {
                entradaValida = false;
            }
        }
    }

}
    // PRINCIPIO PARA UN PROGRAMA DE MENÚ
    // PRINCIPIO PARA UN PROGRAMA DE MENÚ
    // PRINCIPIO PARA UN PROGRAMA DE MENÚ
    // PRINCIPIO PARA UN PROGRAMA DE MENÚ
    // PRINCIPIO PARA UN PROGRAMA DE MENÚ
    // PRINCIPIO PARA UN PROGRAMA DE MENÚ
    // PRINCIPIO PARA UN PROGRAMA DE MENÚ

    // PARA MOSTRAR ALGO (DIFERENTES ARRAYS)

    public static void mostrarRutas(ArrayList<String> tractor,
            ArrayList<Double> kilometros,
            ArrayList<Double> litrosDisponibles,
            ArrayList<String> terreno) {
        if (tractor.isEmpty()) {
            System.out.println("No hay rutas registradas.");
        } else {
            for (int i = 0; i < tractor.size(); i++) {
                System.out.println(i + " -> "
                        + tractor.get(i) + " | "
                        + kilometros.get(i) + " km | "
                        + litrosDisponibles.get(i) + " L | terreno: "
                        + terreno.get(i));
            }
        }
    }

    // ELIMINAR UN INDICE DE UN ARRAY FUNCION

    public static void eliminarRuta(
            ArrayList<String> tractor,
            ArrayList<Double> kilometros,
            ArrayList<Double> litrosDisponibles,
            ArrayList<String> trabajoTractor,
            int indiceEliminar) {

        if (tractor.isEmpty()) {
            System.out.println("No hay rutas para eliminar.");
            return;
        }

        if (indiceEliminar < 0 || indiceEliminar >= tractor.size()) {
            System.out.println("Índice no válido. No se ha eliminado ninguna ruta.");
        } else {
            System.out.println("Ruta eliminada:");
            System.out.println(tractor.get(indiceEliminar) + " | "
                    + kilometros.get(indiceEliminar) + " km | "
                    + litrosDisponibles.get(indiceEliminar) + " L | "
                    + trabajoTractor.get(indiceEliminar));

            tractor.remove(indiceEliminar);
            kilometros.remove(indiceEliminar);
            litrosDisponibles.remove(indiceEliminar);
            trabajoTractor.remove(indiceEliminar);

            System.out.println("La ruta ha sido eliminada correctamente.");
        }
    }
}

// 5. Mostrar menu
     public static void mostrarMenu() {
        System.out.println("1. Añadir tractor");
        System.out.println("2. Listar tractores");
        System.out.println("3.  Evaluar tractor (por índice)");
        System.out.println("4. Eliminar tractor");
        System.out.println("5. Salir");
    }

     static void anadirRuta(Scanner sc,
                          ArrayList<String> tractores,
                          ArrayList<Double> kilometros,
                          ArrayList<Double> litrosDisponibles,
                          ArrayList<String> terrenos) {

        imprimirPrompt("Tractor: ");
        String tractor = sc.nextLine().trim();

        double km = leerDoubleMayorQueCero(sc, "Kilómetros: ");
        double litros = leerDoubleMayorQueCero(sc, "Litros disponibles: ");
        String terreno = leerTerrenoValido(sc);

        tractores.add(tractor);
        kilometros.add(km);
        litrosDisponibles.add(litros);
        terrenos.add(terreno);

        imprimirMensaje("Ruta añadida correctamente.");
    }
