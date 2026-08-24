package com.tienda.app;

import java.util.ArrayList;

import com.tienda.model.Producto;

public class TiendaApp {
    public static void main(String[] args) {
        ArrayList<Producto> listaProducto = new ArrayList<>();
        Producto laptop = new Producto("P001", "ThinkPad X1", 10000.00, 6);


        listaProducto.add(laptop);
        for (Producto n : listaProducto) {
            n.mostrarInformacion();
        }
    }
}
