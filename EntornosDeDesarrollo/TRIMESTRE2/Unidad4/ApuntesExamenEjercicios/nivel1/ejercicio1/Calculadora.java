package EntornosDeDesarrollo.TRIMESTRE2.Unidad4.ApuntesExamenEjercicios.nivel1.ejercicio1;

/**
 * Calculadora que realiza operaciones básicas como calcular interés simple, aplicar descuentos y convertir monedas.
 */

public class Calculadora {
   /**
    * Calcula el interés simple dado un capital, una tasa de interés y un número de años.
    * @param capital el monto inicial de dinero
    * @param tasa la tasa de interés anual (en formato decimal, por ejemplo, 0.05 para 5%)
    * @param anios el número de años para los cuales se calcula el interés
    * @return el interés simple calculado
     * @throws IllegalArgumentException si alguno de los parámetros es negativo
    */

    public double calcularInteresSimple(double capital, double tasa, int anios) {
        if (capital < 0 || tasa < 0 || anios < 0) {
            throw new IllegalArgumentException("Los valores no pueden ser negativos");
        }

        return capital * tasa * anios;
    }

    /**
     * Calcula el precio final después de aplicar un descuento dado un precio original y un porcentaje de descuento.
     * @param precio el precio original del producto
     * @param porcentaje el porcentaje de descuento a aplicar (entre 0 y 100)
     * @return el precio final después del descuento
     * @throws IllegalArgumentException si los valores no son válidos
     */
    public double calcularDescuento(double precio, double porcentaje) {
        if (precio < 0 || porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("Valores no válidos");
        }

        return precio - (precio * porcentaje / 100);
    }

    /**
     * 
     * @param euros recibe los euros para cambiarlos a dolares
     * @param cambio recibe el cambio para multiplicarlo por los euros
     * @return devuelve el resultado de la multiplicacion de los euros por el cambio
     * @throws IllegalArgumentException si los euros o el cambio es menor que 0
     */
    public double convertirEurosADolares(double euros, double cambio) {
        if (euros < 0 || cambio <= 0) {
            throw new IllegalArgumentException("Valores no válidos");
        }

        return euros * cambio;
    }
}

