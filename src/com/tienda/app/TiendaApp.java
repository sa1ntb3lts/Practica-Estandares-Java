package com.tienda.app;

import java.util.ArrayList;
import com.tienda.model.*;

public class TiendaApp {
    public static void main(String[] args) {
        ArrayList<Producto> listaProducto = new ArrayList<>();
        Producto laptop = new Producto("P001", "ThinkPad X1", 10000.00, 6);
        Producto mouse = new Producto("P002", "Mouse HP", 189.00, 17);
        Producto teclado = new Producto("P003", "Teclado Razer", 1200.00, 5);
        
        listaProducto.add(laptop);
        listaProducto.add(mouse);
        listaProducto.add(teclado);

        for (Producto n : listaProducto) {
            n.mostrarInformacion();
        }
    }
}
