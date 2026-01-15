
public class r0e9 {
    public static int menorDeTres(int numeroA, int numeroB, int numeroC) {
        int menorDeLosTres;

        if (numeroA < numeroB && numeroA < numeroC) {
            menorDeLosTres = numeroA;
        } else if (numeroB < numeroA && numeroB < numeroC) {
            menorDeLosTres = numeroB;
        } else {
            menorDeLosTres = numeroC;
        }
        return menorDeLosTres;
    }

    public static void main(String[] args) {
        int ejercicio9=menorDeTres(5, 7, 1);
        System.out.println("El menor de los tres números es " + ejercicio9);

    }

}
