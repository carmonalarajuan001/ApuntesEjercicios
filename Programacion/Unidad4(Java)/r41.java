public class r41 {
    public static void main(String[] args) {

        int numero = 3;
        int iteracion = 1;
        int operacion;

        for (int i = 0; i < 10; i = i + 1) {
            iteracion = i + 1;
            operacion = iteracion * 3;
            System.out.println(iteracion + "x" + numero + "=" + operacion);
        }
    }
}