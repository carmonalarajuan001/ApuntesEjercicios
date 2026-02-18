package EntornosDeDesarrollo.TRIMESTRE2.Unidad4.ApuntesExamenEjercicios.nivel2.ejercicio1;

public class Main {

    public static void main(String[] args) {

        // 1. Crear un cliente
        Cliente cliente = new Cliente("C001", "Juan Pérez");

        // 2. Crear un pedido usando PedidoService
        PedidoService service = new PedidoService();
        Pedido pedido = service.crearPedidoParaCliente(cliente);

        // 3. Agregar productos al pedido
        pedido.agregarProducto("Manzanas");
        pedido.agregarProducto("Pan");
        pedido.agregarProducto("Leche");

        // 4. Mostrar datos del pedido
        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Productos del pedido:");
        for (String producto : pedido.getProductos()) {
            System.out.println("- " + producto);
        }

        // 5. Usar método deprecated (para ver advertencia)
        Pedido pedido2 = service.crearPedido(cliente);
        System.out.println("Pedido2 creado usando método obsoleto: " + pedido2.getCliente().getNombre());
    }
}
