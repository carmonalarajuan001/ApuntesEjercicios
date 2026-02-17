package Programacion.Unidad5.Relacion2.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("El Padrino", "La historia de una familia mafiosa en Nueva York", "Francis Ford Coppola", "2 horas y 55 minutos");
        Pelicula pelicula2 = new Pelicula("El Señor de los Anillos: La Comunidad del Anillo", "Un grupo de héroes se embarca en una misión para destruir un anillo mágico", "Peter Jackson", "2 horas y 58 minutos");
        Cine cine = new Cine();
        cine.agregarPelicula(pelicula1);
        cine.agregarPelicula(pelicula2);
        System.out.println(pelicula1);
        System.out.println(pelicula2);
        System.out.println(cine);
    }
}
