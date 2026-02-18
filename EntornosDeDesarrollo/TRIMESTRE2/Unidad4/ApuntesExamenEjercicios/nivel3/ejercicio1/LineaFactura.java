package EntornosDeDesarrollo.TRIMESTRE2.Unidad4.ApuntesExamenEjercicios.nivel3.ejercicio1;

/**
 * Representa las constantes de factura del sistema.
 * {@link Factura} utiliza esta clase para aplicar el IVA general y limitar el número de líneas en una factura.
 * @see Factura
 * @see ConstantesFactura
 * @see Cliente
 * @author Juan Carmona
 * @version 1.0
 */
public class LineaFactura {

    private final String concepto;
    private final double precioUnitario;
    private final int cantidad;
/**
 * Crea una nueva línea de factura con el concepto, precio unitario y cantidad especificados.
 * @param concepto
 * @param precioUnitario
 * @param cantidad
 * @throws IllegalArgumentException si el concepto es nulo o está vacío, el precio unitario es negativo o la cantidad es menor o igual a cero
 */
    public LineaFactura(String concepto, double precioUnitario, int cantidad) {
        if (concepto == null || concepto.isBlank()) {
            throw new IllegalArgumentException("El concepto no puede estar vacío");
        }

        if (precioUnitario < 0) {
            throw new IllegalArgumentException("El precio unitario no puede ser negativo");
        }

        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }

        this.concepto = concepto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    /**
     * Calcula el subtotal de la línea.
     *
     * Fórmula:
     * {@code precioUnitario * cantidad}
     *
     * @return subtotal sin IVA
     */
    public double calcularSubtotal() {
        return precioUnitario * cantidad;
    }

    /**
     * Obtiene el concepto de la línea de factura.
     * @return concepto de la línea de factura
     */
    public String getConcepto() {
        return concepto;
    }


    /**
     * Obtiene el precio unitario de la línea de factura.
     * @return precio unitario de la línea de factura
     */
    public int getCantidad() {
        return cantidad;
    }
}
