import java.util.Scanner;

public class r66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operando1 = "", operando2 = "", operacionUsuario = "";
        int primerOperando, segundoOperando;
        int resultadoOperacion = 0;

        while (operando1 != "SALIR" && operando2 != "SALIR" && operacionUsuario != "SALIR") {
            System.out.print("Introduce el primer número: ");
            operando1 = scanner.next();

            if (operando1 != "SALIR") {
                primerOperando = Integer.parseInt(operando1);

                System.out.print("Introduce el segundo número: ");
                if (operando2 != "SALIR") {
                    segundoOperando = Integer.parseInt(operando2);

                    System.out.print("Introduce la operación: ");
                    operacionUsuario = scanner.next();
                    scanner.close();

                    if (operacionUsuario != "SALIR") {
                        if (operacionUsuario == "suma") {
                            resultadoOperacion = primerOperando + segundoOperando;
                        } else if (operacionUsuario == "resta") {
                            resultadoOperacion = primerOperando - segundoOperando;
                        } else if (operacionUsuario == "multiplicación") {
                            resultadoOperacion = primerOperando * segundoOperando;
                        } else if (operacionUsuario == "/") {
                            resultadoOperacion = primerOperando / segundoOperando;
                        }

                        System.out.println("El resultado de " + primerOperando + operacionUsuario + segundoOperando + " es " + resultadoOperacion);
                    }
                }
            }
        }
    }
}

