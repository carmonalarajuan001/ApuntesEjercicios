package Programacion.Unidad5.Relacion2.Ejercicio3;

import java.util.ArrayList;




public class supermercado {
    ArrayList<Producto> productosTienda;

    public void agregarProducto(Producto productos) {
        productosTienda.add(productos);
    }

    @Override
    public String toString() {
        String stringProductos = "";
        for (Producto producto : productosTienda) {
            stringProductos += "--" + producto + "\n";
        }
        return stringProductos;
    }



}
