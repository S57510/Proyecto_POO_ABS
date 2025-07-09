package com.example.modelo;
 
public class Servicio{
    private String codigo;
    private String nombreS;
    private double precio;
    private ArrayList<HistorialPrecio> historialPrecios;

    public Servicio(String codigo, String nombreS, double precio){
        this.codigo= codigo;
        this.nombreS= nombreS;
        this.precio= precio;
        this.historialPrecios = new ArrayList<>();
    }

    public void agregarServicio(String nombre, double precio) {
        //
    }
    //editar por codigo
    public void editarServicio(String codigo) { 
        //
    }
public String toString() {
        return "Servicio {Codigo: " + codigo + ", Nombre: " + nombreS + ", Precio: " + precio + "}";
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
