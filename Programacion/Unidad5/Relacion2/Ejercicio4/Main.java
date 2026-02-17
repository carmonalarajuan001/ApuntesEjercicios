package Programacion.Unidad5.Relacion2.Ejercicio4;

public class Main {
    public static void main(String[] args) {
    Cancion cancion1 = new Cancion("Seteadora", "JCREYES", "3 minutos");
    Cancion cancion2 = new Cancion("La Cumbia de los Trapos", "Los Auténticos Decadentes", "4 minutos");
    Playlist playlist = new Playlist();
    playlist.agregarCancion(cancion1);
    playlist.agregarCancion(cancion2);
    System.out.println(cancion1);
    System.out.println(cancion2);
    System.out.println(playlist);

    }
}
