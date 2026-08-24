package com.tienda.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Producto {

    /** Atributos de clase. */
    private String codigo;
    private String nombre;
    private double precio;
    private int existencia;

    /** Constructor de clase. */
    public Producto(String codigo, String nombre, double precio, int existencia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    /** Getter y setter del atributo codigo. */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    /** Getter y setter del atributo nombre. */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Getter y setter del atributo precio. */
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /** Getter y setter del atributo existencia. */
    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    /** 
     * Metodo mostrarInformacion. Se utiliza
     * en la clase "TiendaApp".
     */
    public void mostrarInformacion() {
        System.out.println("");
    }

}