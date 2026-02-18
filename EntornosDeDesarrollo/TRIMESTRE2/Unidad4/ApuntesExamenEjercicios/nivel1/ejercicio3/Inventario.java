package EntornosDeDesarrollo.TRIMESTRE2.Unidad4.ApuntesExamenEjercicios.nivel1.ejercicio3;
import java.util.ArrayList;
import java.util.List;
  /** La clase inventario maneja una lista de productos */
public class Inventario {

    private final List<Producto> productos = new ArrayList<>();

    /**
     * Agrega un producto al inventario. El producto no puede ser null.
     * @param producto
     * @throws IllegalArgumentException Si el producto es null.
     */
    public void agregarProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser null");
        }

        productos.add(producto);
    }

    /**
     * Busca un producto en el inventario por su código. Si el producto no se encuentra, devuelve null.
     * @param codigo El código del producto a buscar, no puede ser null ni vacío.
     * @return El producto encontrado o null si no se encuentra.
     * @throws IllegalArgumentException Si el código es null o vacío.
     */
    public Producto buscarPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }

        return null;
    }

    /**
     * Devuelve el número total de productos en el inventario.
     * @return El número total de productos en el inventario.
     */
    public int totalProductos() {
        return productos.size();
    }
}
