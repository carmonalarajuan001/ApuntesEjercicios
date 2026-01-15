import java.util.Scanner;

public class r39 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Introduce un numero de dos cifras: ");
        String numero = Scanner.next();

        int digitoUno = Character.getNumericValue(numero.charAt(0));
        int digitoDos = Character.getNumericValue(numero.charAt(1));

        int resultadoDigitos;

        int numeroEntero = Integer.parseInt(numero);

        if (numeroEntero >= 10 && numeroEntero < 100) {
            resultadoDigitos = digitoUno + digitoDos;
            System.out.println("El resultado de la suma de los dos dígitos es " + resultadoDigitos);
        } else {
            System.out.println("El numero que ha introducido no tiene dos dígitos");
        }
    }
}