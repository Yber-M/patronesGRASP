
package com.mycompany.controller.repositorio;

import com.mycompany.controller.model.Producto;
import java.util.ArrayList;
import java.util.List;

public class Productos_repositorio {
    private List<Producto> productos;
    
    public Productos_repositorio() {
        // Inicializar el catálogo con productos predefinidos
        productos = catalogoPredefinido();
    }
    
    private List<Producto> catalogoPredefinido() {
        List<Producto> catalogo = new ArrayList<>();

        // Agregar productos al catálogo
        catalogo.add(new Producto(1, "1/4 pollo a la brasa", 14.50));
        catalogo.add(new Producto(2, "1/2 pollo a la brasa", 31.00));
        catalogo.add(new Producto(3, "1 pollo a la brasa", 52.00));
        catalogo.add(new Producto(3, "Inka Cola 1 lt", 8.00));

        return catalogo;
    }
    
    
    public List<Producto> obtenerTodoProducto() {
        return productos;
    }
    

    
}

