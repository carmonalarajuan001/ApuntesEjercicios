import java.util.Scanner;

public class r35 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Introduzca el numero: ");
        int numero = Scanner.nextInt();

        boolean estaEntre10y20 = (numero >= 10 && numero <= 20);

        if (estaEntre10y20) {
            System.out.println("El número está entre 10 y 20");
        } else {
            System.out.println("El número NO está entre 10 y 20");
        }
    }
    }

    
