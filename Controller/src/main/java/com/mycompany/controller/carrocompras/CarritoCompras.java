
package com.mycompany.controller.carrocompras;

import com.mycompany.controller.model.Producto;
import java.util.ArrayList;
import java.util.List;


public class CarritoCompras {
    private List<Producto> productos;
    
    public CarritoCompras() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public List<Producto> obtenerProductos() {
        return productos;
    }

    public void clear() {
        productos.clear();
    }
}
