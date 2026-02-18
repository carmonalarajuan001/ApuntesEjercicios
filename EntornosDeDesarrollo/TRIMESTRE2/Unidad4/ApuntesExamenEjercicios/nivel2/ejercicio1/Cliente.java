package EntornosDeDesarrollo.TRIMESTRE2.Unidad4.ApuntesExamenEjercicios.nivel2.ejercicio1;

/**
 * Representa un cliente que puede realizar {@link Pedido}.
 *
 * <p>Los pedidos se crean a través de {@linkplain PedidoService},
 * que actúa como servicio de gestión.</p>
 *
 * @see Pedido
 * @see PedidoService
 */
public class Cliente {

    private final String id;
    private final String nombre;

    /**
     * Constructor de la clase Cliente
     * @param id identificador del cliente
     * @param nombre nombre del cliente
     * @throws IllegalArgumentException si el id o el nombre son nulos o están vacíos
     */
    public Cliente(String id, String nombre) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("El id no puede estar vacío");
        }

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Devuelve el identificador del cliente
     * @return el id del cliente
     * @see #getId()
     */
    public String getId() {
        return id;
    }


    /**
     * Devuelve el nombre del cliente
     * @return el nombre del cliente
     * @see #getNombre()
     */
    public String getNombre() {
        return nombre;
    }
}
