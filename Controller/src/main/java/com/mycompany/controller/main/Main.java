
package com.mycompany.controller.main;

import com.mycompany.controller.VentaController;
import com.mycompany.controller.model.Producto;
import com.mycompany.controller.repositorio.Productos_repositorio;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        
        VentaController venta_Controller = new VentaController();
        List<Producto> catalogo = venta_Controller.obtenerCatalogo();
        
        // Obtener el catálogo de productos
        System.out.println("Catalogo:");
        for (Producto producto : catalogo) {
            System.out.println("Nombre del Producto: " + producto.getNombre()+ ", Precio: " + producto.getPrecio());
        }
        
        System.out.println(" ");

        // Agregar productos al carrito de compras
        Producto producto1 = catalogo.get(0);
        Producto producto2 = catalogo.get(1);
        
        venta_Controller.añadir_carrito(producto1);
        venta_Controller.añadir_carrito(producto2);

        // Generar la factura
        venta_Controller.generarComprobante();
    }
    
    
}
