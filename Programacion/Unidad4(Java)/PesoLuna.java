import java.util.Scanner;

public class PesoLuna {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Leer datos del usuario

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Limpiar el búfer
        scanner.nextLine();

        // Mostrar datos ingresados
        System.out.println("Su edad en la luna sería: " + edad * 0.165);

        // Cerrar el objeto Scanner
        scanner.close();
    }
} 
