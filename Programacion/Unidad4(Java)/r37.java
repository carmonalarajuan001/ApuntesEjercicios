import java.util.Scanner;

public class r37 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        double resultado = 0;
        boolean division0 = false;

        System.out.print("Introduzca un número: ");
        double numero1 = Scanner.nextDouble();

        System.out.print("Introduzca otro número: ");
        double numero2 = Scanner.nextDouble();

        System.out.print("Introduzca el operador (+, -, *, /): ");
        String operador = Scanner.next();

        if (operador.equals("+")) {
            resultado = numero1 + numero2;
        } else if (operador.equals("-")) {
            resultado = numero1 - numero2;
        } else if (operador.equals("*")) {
            resultado = numero1 * numero2;
        } else if (operador.equals("/")) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                System.out.println("No es posible dividir entre 0");
                division0 = true;
            }
        } else {
            System.out.println("Operador incorrecto");
            division0 = true;
        }

        if (!division0) {
            System.out.println("El resultado de " + numero1 + operador + numero2 + " es " + resultado);
        } else {
            System.out.println("Vuelva a probar con valores correctos");
        }
    }
}