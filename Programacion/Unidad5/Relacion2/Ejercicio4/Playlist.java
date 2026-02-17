package Programacion.Unidad5.Relacion2.Ejercicio4;

import java.util.ArrayList;

public class Playlist {
    ArrayList<Cancion> canciones;

    public Playlist() {
        canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion){
        canciones.add(cancion);
    }

    public void eliminarCancion(Cancion cancion){
        canciones.remove(cancion);
    }

    @Override
    public String toString() {
        String stringCanciones = "";
        for (Cancion cancion : canciones) {
            stringCanciones += "||||||" + cancion + "\n";
        }
        return stringCanciones;
    }
}
