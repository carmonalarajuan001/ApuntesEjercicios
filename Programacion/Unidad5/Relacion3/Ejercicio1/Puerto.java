package Programacion.Unidad5.Relacion3.Ejercicio1;

public class Puerto {
    private String nombre;
    public String ubicacion;
    private int capacidadMaxima;
    public String telefonoContacto;
    private Amarre[] amarres;
    private Embarcacion[] embarcaciones;
    private String[] matriculasAmarradas;

    public Puerto(String nombre, String ubicacion, int capacidadMaxima, String telefonoContacto) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidadMaxima = capacidadMaxima;
        this.telefonoContacto = telefonoContacto;
        this.amarres = new Amarre[capacidadMaxima];
        this.embarcaciones = new Embarcacion[100]; // Asumiendo un límite de 100 embarcaciones
        this.matriculasAmarradas = new String[capacidadMaxima]; // Para saber qué embarcación está en qué amarre
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Amarre[] getAmarres() {
        return amarres;
    }

    public Embarcacion[] getEmbarcaciones() {
        return embarcaciones;
    }

    public String[] getMatriculasAmarradas() {
        return matriculasAmarradas;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
