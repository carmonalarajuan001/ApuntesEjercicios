package Programacion.Unidad5.Relacion2.Ejercicio4;

public class Cancion {
    private String titulo;
    private String artista;
    private String duracion;

    public Cancion(String titulo, String artista, String duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Nombre de la canción: " + titulo + "Nombre del artista:" + artista + "Duración de la canción:"
                + duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

}
