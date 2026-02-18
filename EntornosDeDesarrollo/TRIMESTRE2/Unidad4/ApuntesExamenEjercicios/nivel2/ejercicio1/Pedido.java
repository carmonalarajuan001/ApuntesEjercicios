package EntornosDeDesarrollo.TRIMESTRE2.Unidad4.ApuntesExamenEjercicios.nivel2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

    /**
 * Representa un pedido que puede realizar {@link Cliente}.
 *
 * <p>Un pedido contiene una lista de productos asociados al cliente.
 * Normalmente se crea mediante {@link PedidoService}.</p>
 *
 * @see Cliente
 * @see PedidoService
 */
public class Pedido {

    private final Cliente cliente;
    private final List<String> productos = new ArrayList<>();

    /**
     * Constructor de la clase Pedido
     * @param cliente cliente que realiza el pedido
     * @throws IllegalArgumentException si el cliente es null
     */
    public Pedido(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser null");
        }

        this.cliente = cliente;
    }

    /**
     * Devuelve el cliente que realiza el pedido
     * @return el {@link Cliente} del pedido
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Agrega un producto al pedido
     * @param nombreProducto
     * @see #getProductos()
     */
    public void agregarProducto(String nombreProducto) {
        productos.add(nombreProducto);
    }
    
        /**
        * Devuelve la lista de productos asociados al pedido
        * @return lista de nombres de productos
        * @see #agregarProducto(String)
        */
    public List<String> getProductos() {
        return productos;
    }
}
