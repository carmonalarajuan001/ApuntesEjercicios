
public class r0e8 {
    // Función para ver el mayor de los dos.
    public static int mayor(int numeroA, int numeroB) {
        int mayorDeLosDos;
        if (numeroA > numeroB) {
            mayorDeLosDos = numeroA;
        } else {
            mayorDeLosDos = numeroB;
        }
        return mayorDeLosDos;
    }

    public static void main(String[] args) {
        int resultadoNumMayor=mayor(34, 56);
        System.out.println("El mayor de los dos números es " + resultadoNumMayor);
    }

}