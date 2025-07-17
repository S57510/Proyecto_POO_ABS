package com.example.modelo;
import java.util.ArrayList;

public class Servicio{
    private String codigo;
    private String nombre;
    private double precio;
    private ArrayList<HistorialPrecio> historialPrecios;

    public Servicio(String codigo, String nombre, double precio){
        this.codigo= codigo;
        this.nombre= nombre;
        this.precio= precio;
        this.historialPrecios = new ArrayList<HistorialPrecio>();
    }

    public void agregarServicio(String nombre, double precio) {
        //agregar un nuevo servicio
    }

    public void editarServicio(String codigo) { 
        //editar un servicio existente por su codigo
    }
    public String toString() {
        return "Servicio {Codigo: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio + "}";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<HistorialPrecio> getHistorialPrecios() {
        return historialPrecios;
    }

    public void setHistorialPrecios(ArrayList<HistorialPrecio> historialPrecios) {
        this.historialPrecios = historialPrecios;
    }
}
