package Programacion.Unidad5.Relacion2.Ejercicio3;

public class Producto {
    private static int numeroProductos = 0;
    private String id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadEnStock;

public Producto(String id, String nombre, String descripcion, double precio, int cantidadEnStock){
    setId();
    this.nombre = nombre;
    this.descripcion = descripcion;
    setPrecio(precio);
    setcantidadEnStock(cantidadEnStock);
    numeroProductos++;
}





@Override
public String toString(){
    return " (Nombre: " + nombre + ") - " + descripcion + " - Precio: $" + precio + " - Stock: " + cantidadEnStock;
}

public String getId() {
    return id;
}
private void setId() {
    this.id="P-" + numeroProductos;
numeroProductos++;
}
public String getNombre() {
    return nombre;
}
public String getDescripcion() {
    return descripcion;
}
public double getPrecio() {
    return precio;
}
public int getCantidadEnStock() {
    return cantidadEnStock;
}


public void setNombre(String nombre) {
    this.nombre=nombre;
}
public void setDescripcion(String descripcion) {
    this.descripcion=descripcion;
}
public boolean setPrecio(double precio) {
    boolean precioCorrecto = false;
    if (precio>=0) {
        this.precio=precio;
        precioCorrecto=true;
    }
    return precioCorrecto;
    
} 
public boolean setcantidadEnStock(int cantidadEnStock) {
    boolean cantidadCorrecto = false;
    if (cantidadEnStock>=0) {
        this.cantidadEnStock=cantidadEnStock;
        cantidadCorrecto=true;
    }
    return cantidadCorrecto;
}

}