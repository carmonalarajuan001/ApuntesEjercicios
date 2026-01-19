import java.util.ArrayList;
public class r1e9 {
    public static void main(String[] args) {
        ArrayList<String> cola = new ArrayList<>();
        cola.add("cliente1");
        cola.add("cliente2");
        cola.add("cliente3");
        System.out.println("Cola inicial: " + cola);
        String clienteAtendido = cola.remove(0);
        System.out.println("Cliente atendido: " + clienteAtendido);
        System.out.println("Cola ahora: " + cola);
        clienteAtendido = cola.remove(0);
        System.out.println("Cliente atendido: " + clienteAtendido);
        System.out.println("Cola ahora: " + cola);
        clienteAtendido = cola.remove(0);
        System.out.println("Cliente atendido: " + clienteAtendido);
        System.out.println("Cola ahora: " + cola);

    }
}
