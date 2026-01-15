import java.util.Scanner;

public class r64 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        double combustibleDisponible;
        double precioLitro;
        double consumo100km;

        int numeroViaje = 1;
        double kilometrosViaje;
        double precioViaje;
        double combustibleConsumido;

        // Pedir datos iniciales
        System.out.print("Introduce el combustible inicial (litros): ");
        combustibleDisponible = scanner.nextDouble();

        System.out.print("Precio del litro de combustible: ");
        precioLitro = scanner.nextDouble();

        System.out.print("Consumo cada 100km: ");
        consumo100km = scanner.nextDouble();

        // Bucle mientras haya combustible
        while (combustibleDisponible > 0) {
            System.out.print("Introduce los kilómetros del viaje " + numeroViaje + ": ");
            kilometrosViaje = scanner.nextDouble();

            combustibleConsumido = kilometrosViaje * consumo100km / 100;

            if (combustibleConsumido <= combustibleDisponible) {
                precioViaje = combustibleConsumido * precioLitro;
                combustibleDisponible -= combustibleConsumido;

                System.out.println("Precio del viaje: " + precioViaje + " €");
                System.out.println("Combustible restante: " + combustibleDisponible + " litros");

                numeroViaje++;
            } else {
                System.out.println("¡Combustible insuficiente!");
                break; // terminar el bucle si no hay suficiente combustible
            }
        }

        scanner.close();
    }
}