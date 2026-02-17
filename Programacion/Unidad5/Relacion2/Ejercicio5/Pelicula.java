package Programacion.Unidad5.Relacion2.Ejercicio5;

public class Pelicula {
    public String titulo;   
    public String sinopsis;
    public String director;
    public String duracion;

    public Pelicula(String titulo, String sinopsis, String director, String duracion) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Nombre de la película: " + titulo + " Sinopsis: " + sinopsis + " Director: " + director + " Duración de la película: "
                + duracion;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    }
