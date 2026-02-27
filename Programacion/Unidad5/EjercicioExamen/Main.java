package Programacion.Unidad5.EjercicioExamen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void mostrarMenu() {
        System.out.println("===== GESTIÓN DE ZOOLÓGICO =====");
        System.out.println("1. Mostrar todos los animales");
        System.out.println("2. Buscar un animal por código");
        System.out.println("3. Agregar ejemplares a un animal");
        System.out.println("4. Retirar ejemplares de un animal");
        System.out.println("5. Eliminar un animal");
        System.out.println("6. Salir");
        System.out.println("Seleccione una opción:");
    }

    // Opción 1: Mostrar todos los animales
    // Formato de impresión:
    // Código: A1B2C3 | Nombre: León | Cantidad: 3 | Precio: 25.00 €

    // Opción 2: Buscar un animal por código
    // Si existe: se imprime el animal.\
    // Si no: "Animal no encontrado."

    // Opción 3: Agregar ejemplares a un animal
    // Se suma la cantidad indicada.\
    // Si no existe: "Animal no encontrado."

    // Opción 4: Retirar ejemplares de un animal
    // No puede quedar negativo.\
    // Si se intenta retirar más de lo disponible:
    // "No se puede retirar más ejemplares de los disponibles."\
    // Si no existe: "Animal no encontrado."

    // Opción 5: Eliminar un animal
    // Solo si cantidad == 0.\
    // Si tiene ejemplares:
    // "No se puede eliminar un animal con ejemplares disponibles."\
    // Si no existe: "Animal no encontrado."

    // Opción 6: Salir
    // Finaliza el programa.

    public static void main(String[] args) {

        Animal animal1 = new Animal("zebra", "B-342", 5, 500);
        Zoologico zoo = new Zoologico();
        zoo.agregarAnimal(animal1);
        ArrayList<Integer> opcionesMenuArrayList = new ArrayList<>();
        opcionesMenuArrayList.add(1);
        opcionesMenuArrayList.add(2);
        opcionesMenuArrayList.add(3);
        opcionesMenuArrayList.add(4);
        opcionesMenuArrayList.add(5);
        opcionesMenuArrayList.add(6);

        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = true;
        Zoologico zoologico = new Zoologico();

        while (entradaValida) {

            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            if (opcionesMenuArrayList.contains(opcion)) {

                if (opcion == 1) { // Mostrar todos los animales
                    System.out.println("=== ANIMALES DEL ZOOLÓGICO ===");
                    for (Animal animal : zoo.getAnimales()) {
                        System.out.println(animal);
                    }
                } else if (opcion == 2) {// Buscar animal por código
                    System.out.print("Ingrese el código del animal a buscar: ");
                    String codigo = scanner.nextLine();
                    Animal animal = zoo.buscarAnimalCodigo(codigo);
                    if (animal != null) {
                        System.out.println("Animal encontrado: " + animal);
                    } else {
                        System.out.println("Animal no encontrado.");
                    }
                } else if (opcion == 3) {// Agregar ejemplares a un animal
                    System.out.print("Ingrese el código del animal al que desea agregar ejemplares: ");
                    String codigoAgregar = scanner.nextLine();

                    System.out.print("Ingrese el número de animales a agregar: ");
                    int numeroAnimalesAgregar = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer
                    ArrayList<Boolean> animal = zoo.agregarEjemplares(codigoAgregar, numeroAnimalesAgregar);
                    if (animal.get(0)) {
                        System.out.println("El numero de animales que ha introducido es 0");
                    } else if (!animal.get(1)) {
                        System.out.println("Ese codigo no le pertenece a ningun animal");
                    }
                    scanner.nextLine();
                } else if (opcion == 4) {// Retirar ejemplares de un animal
                    System.out.print("Ingrese el código del animal del que desea retirar ejemplares: ");

                } else if (opcion == 5) {// Eliminar animal
                    System.out.println("Introduce el nombre del animal que quieres eliminar");

                } else if (opcion == 6) {
                    System.out.println("Saliendo del programa...");
                    entradaValida = false;
                }

            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                scanner.nextLine(); // limpiar lo que escribió
            }
        }
    }
}
