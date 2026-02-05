package RelacionRepaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class e4 {
    public static void anadirRuta(
        ArrayList<String> tractor,
        ArrayList<Double> kilometros,
        ArrayList<Double> litrosDisponibles,
        ArrayList<String> trabajoTractor,
        ArrayList<String> trabajosValidos,
        Scanner scanner) {

    System.out.println("Establezca la marca del tractor que desea meter");
    String tractorIntroducido = scanner.nextLine();
    tractor.add(tractorIntroducido);

    System.out.println("Establece los kilometros del tractor");
    double kmIntroducidos = scanner.nextDouble();
    scanner.nextLine();
    kilometros.add(kmIntroducidos);

    System.out.println("Introduzca el numero de litros disponibles");
    double litrosIntroducidos = scanner.nextDouble();
    scanner.nextLine();
    litrosDisponibles.add(litrosIntroducidos);

    System.out.println("Establezca el fin del tractor (llano, mixto, montaña)");
    boolean entradaValidaTractor = true;
    String trabajoIntroducido;

    while (entradaValidaTractor) {
        trabajoIntroducido = scanner.nextLine();

        if (trabajosValidos.contains(trabajoIntroducido)) {
            trabajoTractor.add(trabajoIntroducido);
            entradaValidaTractor = false;
        } else {
            System.out.println("Trabajo no valido. Introduce llano, mixto o montaña");
        }
    }

    System.out.println("Ruta añadida correctamente.");
}
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
    public static void mostrarMenu() {
        System.out.println("1.  Añadir ruta");
        System.out.println("2.  Listar rutas");
        System.out.println("3. Calcular consumo (por índice)");
        System.out.println("4. Eliminar ruta (por índice)");
        System.out.println("0. Salir");
    }

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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = true;
        Integer opcion = 6;
        // String tractorIntroducido;
        // Double kmIntroducidos;
        // Double litrosIntroducidos;
        // String trabajoIntroducido = null;
        // boolean entradaValidaTractor = true;
        // Si no hubiera funciones
        int indice;
        int indiceEliminar;
        double consumoPorKm;

        ArrayList<String> tractor = new ArrayList<>(
                Arrays.asList());
        ArrayList<Double> kilometros = new ArrayList<>(
                Arrays.asList());
        ArrayList<Double> litrosDisponibles = new ArrayList<>(
                Arrays.asList());
        ArrayList<String> trabajoTractor = new ArrayList<>(
                Arrays.asList());
        ArrayList<String> trabajo = new ArrayList<>(
                Arrays.asList("llano", "mixto", "montaña"));

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
               anadirRuta(tractor, kilometros, litrosDisponibles, trabajoTractor, trabajo, scanner);


            } else if (opcion == 2) {
                mostrarRutas(tractor, kilometros, litrosDisponibles, trabajoTractor);


            } else if (opcion == 3) {
                if (tractor.isEmpty()) {
                    System.out.println("No hay rutas registradas.");
                } else {
                    System.out.println("Introduce el índice de la ruta:");
                    indice = scanner.nextInt();
                    scanner.nextLine();

                    if (indice < 0 || indice >= tractor.size()) {
                        System.out.println("Índice no válido.");
                    } else {
                        consumoPorKm = 0;

                        String tipoTerreno = trabajoTractor.get(indice);

                        if (tipoTerreno.equals("llano")) {
                            consumoPorKm = 0.12;
                        } else if (tipoTerreno.equals("mixto")) {
                            consumoPorKm = 0.18;
                        } else if (tipoTerreno.equals("montaña")) {
                            consumoPorKm = 0.25;
                        }

                        double km = kilometros.get(indice);
                        double litrosNecesarios = km * consumoPorKm;
                        double litrosDisponiblesRuta = litrosDisponibles.get(indice);

                        System.out.println("Terreno: " + tipoTerreno);
                        System.out.println("Litros necesarios: " + litrosNecesarios);

                        if (litrosDisponiblesRuta >= litrosNecesarios) {
                            System.out.println("Ruta VIABLE");
                            System.out.println("Sobran " + (litrosDisponiblesRuta - litrosNecesarios) + " litros.");
                        } else {
                            System.out.println("Ruta NO VIABLE");
                            System.out.println("Faltan " + (litrosNecesarios - litrosDisponiblesRuta) + " litros.");
                        }
                    }
                }

            } else if (opcion == 4) {
                if (tractor.isEmpty()) {
        System.out.println("No hay rutas para eliminar.");
    } else {
        System.out.println("Introduce el índice de la ruta a eliminar:");
        indiceEliminar = scanner.nextInt();
        scanner.nextLine();

        eliminarRuta(tractor, kilometros, litrosDisponibles, trabajoTractor, indiceEliminar);
    }
            } else if (opcion == 0) {
                entradaValida = false;
            }
        }
    }
}
