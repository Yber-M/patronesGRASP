package com.mycompany.controller;
import com.mycompany.controller.carrocompras.CarritoCompras;
import com.mycompany.controller.model.Producto;
import com.mycompany.controller.repositorio.Productos_repositorio;
import java.util.List;
public class VentaController {
    private Productos_repositorio catalogo;
    private CarritoCompras carrito;

    public VentaController() {
        // Inicializar el catálogo de productos y el carrito de compras
        catalogo = new Productos_repositorio();
        carrito = new CarritoCompras();
    }

    public List<Producto> obtenerCatalogo() {
        
        return catalogo.obtenerTodoProducto();
    }

    public void añadir_carrito(Producto producto) {
        carrito.agregarProducto(producto);
    }

    public double calcularTotal() {
        return carrito.calcularTotal();
    }

    public void generarComprobante() {
        double total = calcularTotal();
        //SALIDA
        System.out.println("Comprobante de compra:");
        for (Producto producto : carrito.obtenerProductos()) {
            System.out.println("Nombre de producto: " + producto.getNombre() + ", precio: " + producto.getPrecio());
        }
        System.out.println("Total: " + total);

        // Limpiar el carrito después del proceso de pago
        carrito.clear();
    }
}
