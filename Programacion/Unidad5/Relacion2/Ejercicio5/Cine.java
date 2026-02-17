package Programacion.Unidad5.Relacion2.Ejercicio5;

import java.util.ArrayList;

public class Cine {
    ArrayList<Pelicula> peliculas;

    public Cine() {
        peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void eliminarPelicula(Pelicula pelicula) {
        peliculas.remove(pelicula);
    }

    @Override
    public String toString() {
        String stringPeliculas = "";
        for (Pelicula pelicula : peliculas) {
            stringPeliculas += "||" + pelicula + "\n";

        }
        return stringPeliculas;
    }
}