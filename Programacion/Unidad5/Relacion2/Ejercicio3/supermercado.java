package Programacion.Unidad5.Relacion2.Ejercicio3;

import java.util.ArrayList;

public class supermercado {
    ArrayList<Producto> productosTienda;

    public supermercado() {
        productosTienda = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productosTienda.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        System.out.println(producto.getCantidadEnStock());
        Producto productoVender;
        if (productosTienda.contains(producto)){
            productoVender = productosTienda.get(productosTienda.indexOf(producto));
            if (productoVender.getCantidadEnStock() > 0) {
                productoVender.setcantidadEnStock(productoVender.getCantidadEnStock() - 1);
            } else {
                System.err.println("No hay stock disponible para el producto: " + producto.getNombre());
            }
        } else {
            System.err.println("El producto no se encuentra en la tienda: " + producto.getNombre());
        }
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
