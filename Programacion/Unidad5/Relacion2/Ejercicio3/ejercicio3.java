package Programacion.Unidad5.Relacion2.Ejercicio3;

public class ejercicio3 {
    public static void main(String[] args) {
        
        Producto champuPantene = new Producto("001", 
        "Champú Pantene", 
        "Champú para cabello normal", 
        5.99, 
        50);


        Producto champuHS = new Producto("002", 
        "Champú Head & Shoulders", 
        "Champú anticaspa", 
        6.99, 
        30);


        System.out.println(champuHS); 
        System.out.println(champuPantene);

        if (!champuHS.setcantidadEnStock(-8)) {
            System.err.println("No se ha podido actualizar la cantidad");
        }
        if (!champuHS.setPrecio(-8)) {
            System.err.println("No se ha podido actualizar el precio");
        }


        champuHS.setDescripcion("Huele fatal");
        System.out.println(champuHS.getDescripcion());
    }
    
}
