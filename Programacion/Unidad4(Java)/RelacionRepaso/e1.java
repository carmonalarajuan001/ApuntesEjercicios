package RelacionRepaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class e1 {
    public static void mostrarMenu() {
        System.out.println("1. Añadir tractor");
        System.out.println("2. Listar tractores");
        System.out.println("3.  Evaluar tractor (por índice)");
        System.out.println("4. Eliminar tractor");
        System.out.println("5. Salir");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = true;
        Integer opcion = 6;
        String marcaIntroducida;
        Integer potenciaIntroducida;
        String trabajoIntroducido = null;
        boolean entradaValidaTractor = true;

        ArrayList<String> marca = new ArrayList<>(
                Arrays.asList());
        ArrayList<Integer> potenciaCV = new ArrayList<>(
                Arrays.asList());
        ArrayList<String> trabajo = new ArrayList<>(
                Arrays.asList("arado", "transporte", "siembra"));
        ArrayList<String> trabajoTractor = new ArrayList<>(
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
                System.out.println("Establezca la marca del tractor que desea meter");
                marcaIntroducida = scanner.nextLine();
                marca.add(marcaIntroducida);
                System.out.println("Establece la potencia de tractor en CV");
                potenciaIntroducida = scanner.nextInt();
                scanner.nextLine();
                potenciaCV.add(potenciaIntroducida);
                System.out.println("Establezca el fin del tractor (arado, siembra o transpote");
                entradaValidaTractor = true;
                while (entradaValidaTractor) {
                    trabajoIntroducido = scanner.nextLine();

                    if (trabajo.contains(trabajoIntroducido)) {
                        trabajoTractor.add(trabajoIntroducido);
                        entradaValidaTractor = false; // sale SOLO si es valido
                    } else {
                        System.out.println("Trabajo no valido. Introduce arado, transporte o siembra:");
                    }
                }

            } else if (opcion == 2) {
                for (int i = 0; i < marca.size(); i++) {
                    System.out.println(
                            i + " -> "
                                    + marca.get(i) + " | "
                                    + potenciaCV.get(i) + " CV | trabajo: "
                                    + trabajoTractor.get(i));
                }
            } else if (opcion == 3) {

            } else if (opcion == 4) {

            } else if (opcion == 5) {
                entradaValida = false;
            }
        }
    }
}
