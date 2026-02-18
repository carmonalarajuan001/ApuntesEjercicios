package EntornosDeDesarrollo.TRIMESTRE2.Unidad4.ApuntesExamenEjercicios.nivel3.ejercicio1;

/**
 * Representa las constantes de factura del sistema.
 *
 * @author Juan Carmona
 * @version 1.0.0
 */
    public class ConstantesFactura {
    /** Constante que define el IVA general aplicable a las facturas 
     * @see Factura#calcularTotal()
     * IVA general aplicado a las facturas.
     * Valor actual: {@value}
     **/
    public static final double IVA_GENERAL = 0.21;


    /** Constante que define el número máximo de líneas que puede tener una factura
     * @see Factura#agregarLinea(LineaFactura)
     * Número máximo de líneas permitido en una factura.
     * Valor actual: {@value}
     **/

    public static final int MAX_LINEAS_FACTURA = 20;
}
