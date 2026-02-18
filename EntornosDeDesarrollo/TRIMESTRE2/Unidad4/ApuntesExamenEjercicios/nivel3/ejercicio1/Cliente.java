package EntornosDeDesarrollo.TRIMESTRE2.Unidad4.ApuntesExamenEjercicios.nivel3.ejercicio1;
/**
 * Representa un cliente del sistema.
 *
 *
 * @version 2.1.0
 */
public class Cliente {

    private final String id;
    private final String nombre;


    /**
     * Crea un nuevo cliente con el id y nombre especificados.
     * @param id
     * @param nombre
     * @throws IllegalArgumentException si el id o el nombre son nulos o están vacíos
     * 
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

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
     /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return nombre + " (" + id + ")";
}
}
