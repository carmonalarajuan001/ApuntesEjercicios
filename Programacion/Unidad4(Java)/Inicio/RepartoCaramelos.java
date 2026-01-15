import java.util.Scanner;

public class RepartoCaramelos {
    public static void main(String[] args) {
        // Creo el objeto de scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuántos caramelos tienes");
        int numeroCaramelos = scanner.nextInt();

        System.out.println("Cuánto niños hay");
        int numeroNinios = scanner.nextInt();

        //Variables de operaciones
        int caramelosPorNinio = numeroCaramelos/numeroNinios;
        int restoCaramelos = numeroCaramelos%numeroNinios;

        //Limpiamos el búfer
        scanner.nextLine();

        // Mostrar datos ingresados
        System.out.println("A cada niño le tocan " + caramelosPorNinio + " caramelos y han sobrado " + restoCaramelos);

        // Cerrar el objeto Scanner
        scanner.close();




    }
}
