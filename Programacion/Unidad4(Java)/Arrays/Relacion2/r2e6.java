import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class r2e6 {
    public static void mostrarMenu() {
        System.out.println("1. Añadir tarea");
        System.out.println("2. Marcar completada");
        System.out.println("3. Ver pendientes");
        System.out.println("4. Ver completadas");
        System.out.println("5. Salir");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>(
                Arrays.asList("tarea1", "tarea2", "tarea3"));

        ArrayList<Boolean> completadas = new ArrayList<>(
                Arrays.asList(false, true, false));
        ArrayList<String> pendientes = new ArrayList<>();
        ArrayList<String> hechas = new ArrayList<>();

        int opcion = 0;
        String nueva;
        String buscar;
        boolean entradaValida;

        while (opcion != 5) {
            entradaValida = true;

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
                System.out.println("Nueva tarea;");
                nueva = scanner.nextLine();
                tareas.addLast(nueva);
                completadas.addLast(false);
            } else if (opcion == 2) {
                System.out.println("Nombre de la tarea");
                buscar = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < tareas.size() && !encontrado; i++) {
                    if (tareas.get(i).equals(buscar)) {
                        encontrado = true;
                        completadas.set(i, true);
                    }
                }
                if (!encontrado) {
                    System.out.println("No encontrada");
                }
            } else if (opcion == 3) {
                pendientes.clear(); // Para que no se repitan las tareas una y otra vez.
                for (int i = 0; i < completadas.size(); i++) {
                    if (!completadas.get(i))
                        pendientes.addLast(tareas.get(i));
                }
                System.out.println("Pendientes: " + pendientes);
            } else if (opcion == 4) {
                hechas.clear();
                for (int i = 0; i < completadas.size(); i++) {
                    if (completadas.get(i))
                        hechas.addLast(tareas.get(i));
                }
                System.out.println("Completadas: " + hechas);
            }

        }
    }
}
