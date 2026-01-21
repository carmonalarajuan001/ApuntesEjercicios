package EntornosDeDesarrollo.TRIMESTRE2.Unidad4.jsDocPrueba;

public class cadena {
    /**
     * Metodo que invierte una cadena de texto
     * <p> esto es un ejemplo de documentaion en java
     * @param cadena
     * @return cadena texto invertida
     */
    public static String revertirCadena(String cadena) {
        String cadenaRevertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaRevertida+=cadena.charAt(i);
        }
        return cadenaRevertida;
    }

    public static void main(String[] args) {
        String cadenaFinal = revertirCadena("Hola mundo");
        System.out.println("La cadena revertida es " + cadenaFinal);
    }
}
