
public class r0e18 {
    public static int contarVocales(String cadenaTexto) {
        cadenaTexto = cadenaTexto.toLowerCase();
        int conteoVocales = 0;
        for (int i = 0; i < cadenaTexto.length(); i++) {
            if (cadenaTexto.charAt(i)=='a'||
            cadenaTexto.charAt(i)=='e'||
            cadenaTexto.charAt(i)=='i'||
            cadenaTexto.charAt(i)=='o'||
            cadenaTexto.charAt(i)=='u') {
                conteoVocales++;
            }
        }
        return conteoVocales;
    }
    public static void main(String[] args) {
        System.out.println("La cadena de texto tiene " + contarVocales("Hola a Todo el mundo") + "vocales");
    }
}
