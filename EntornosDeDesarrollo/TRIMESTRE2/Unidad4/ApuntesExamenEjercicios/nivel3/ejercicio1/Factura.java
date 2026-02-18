package EntornosDeDesarrollo.TRIMESTRE2.Unidad4.ApuntesExamenEjercicios.nivel3.ejercicio1;

import java.util.ArrayList;
import java.util.List;
/**
 * Representa una factura asociada a un {@code Cliente}.
 *
 * Total calculado mediante:
 * {@code totalSinIva * (1 + IVA_GENERAL)}
 * @see Cliente
 * @see LineaFactura
 * @see ConstantesFactura
 * @author Juan Carmona
 * @version 1.0
 * 
 */
public class Factura {

    private final Cliente cliente;
    private final List<LineaFactura> lineas = new ArrayList<>();

    /**
     * Crea una nueva factura para el cliente especificado.
     * @param cliente
     * @throws IllegalArgumentException si el cliente es null
     */
    public Factura(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser null");
        }

        this.cliente = cliente;
    }

    /**
     * Agrega una línea de factura a la factura.
     * @param linea
     * @throws IllegalStateException si se intenta agregar más líneas de las permitidas por {@code ConstantesFactura.MAX_LINEAS_FACTURA}
     * see {@code ConstantesFactura.MAX_LINEAS_FACTURA}
     */
    public void agregarLinea(LineaFactura linea) {
        if (lineas.size() >= ConstantesFactura.MAX_LINEAS_FACTURA) {
            throw new IllegalStateException("No se pueden añadir más líneas a la factura");
        }

        lineas.add(linea);
    }

    /**
     * Calcula el total de la factura aplicando el IVA general.
     * @return total de la factura con IVA incluido
     */
    public double calcularTotal() {
        double totalSinIva = 0;

        for (LineaFactura linea : lineas) {
            totalSinIva += linea.calcularSubtotal();
        }

        return totalSinIva * (1 + ConstantesFactura.IVA_GENERAL);
    }

    public Cliente getCliente() {
        return cliente;
    }
}
