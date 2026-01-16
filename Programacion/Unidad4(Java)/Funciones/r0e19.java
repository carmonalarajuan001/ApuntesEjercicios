
public class r0e19 {
    public static String capitalizarPrimeraLetra(String palabra) {
        return Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1);
    }

    public static void main(String[] args) {

        System.out.println(capitalizarPrimeraLetra("hola"));
    }
}
