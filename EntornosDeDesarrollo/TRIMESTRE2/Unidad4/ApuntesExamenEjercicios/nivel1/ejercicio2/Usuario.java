package EntornosDeDesarrollo.TRIMESTRE2.Unidad4.ApuntesExamenEjercicios.nivel1.ejercicio2;

public class Usuario {

    private final String nombre;
    private final String dni;

    /**
     * Constructor de la clase Usuario que inicializa el nombre y el DNI del usuario. El nombre y el DNI no pueden ser nulos ni vacíos.
     * @param nombre El nombre del usuario, no puede ser null ni vacío.
     * @param dni El DNI del usuario, no puede ser null ni vacío.
     * @throws IllegalArgumentException Si el nombre o el DNI son null o vacíos.
     */
    public Usuario(String nombre, String dni) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (dni == null || dni.isBlank()) {
            throw new IllegalArgumentException("El DNI no puede estar vacío");
        }

        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Método para obtener el nombre del usuario.
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    
    /**
     * Método para obtener el DNI del usuario.
     * @return El DNI del usuario.
     */
    public String getDni() {
        return dni;
    }
}
