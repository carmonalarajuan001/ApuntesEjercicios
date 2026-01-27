public class r1e2 {
    public static Integer lanzarDado() {
        int dado = (int) (Math.random() * 6) + 1;
        return dado;
    }

    public static Integer lanzarDosDado() {
        int dado1 = lanzarDado();
        int dado2 = lanzarDado();
        int sumaDados=dado1+dado2;
        return sumaDados;
        // o return suma=lanzarDado() + lanzarDado();
    }

    public static void main(String[] args) {
        System.out.println(lanzarDosDado());
    }
}
