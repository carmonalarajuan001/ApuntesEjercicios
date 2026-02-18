package EntornosDeDesarrollo.TRIMESTRE2.Unidad4.ApuntesExamenEjercicios.nivel2.ejercicio1;

public class PedidoService {

    /**
     * Crea un nuevo pedido para un cliente.
     *
     * @param cliente cliente para el que se crea el pedido
     * @return nuevo {@link Pedido}
     * @see Pedido#Pedido(Cliente)
     */
    public Pedido crearPedidoParaCliente(Cliente cliente) {
        return new Pedido(cliente);
    }

    /**
     * Crea un pedido para un cliente.
     *
     * @param cliente cliente para el que se crea el pedido
     * @return nuevo {@link Pedido}
     *
     * @deprecated Este método está obsoleto.
     * Se recomienda usar {@link #crearPedidoParaCliente(Cliente)}.
     */
    @Deprecated
    public Pedido crearPedido(Cliente cliente) {
        return new Pedido(cliente);
    }
}
