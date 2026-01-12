import java.util.Scanner;

public class r42 {
    public static void main(String[] args) {
 

        Scanner scanner = new Scanner(System.in);

    System.out.println("Introduce el numero ");
    int numeroSecreto = scanner.nextInt();

    System.out.print("Introduce un número entre 1 y 10: ");
    int entradaUsuario = scanner.nextInt();

   


    while (entradaUsuario != numeroSecreto) {
        System.out.print("Inténtalo de nuevo: ");
            entradaUsuario = scanner.nextInt();
    }

    System.out.println("¡Correcto! Has adivinado el número");

        scanner.close();
    }
}