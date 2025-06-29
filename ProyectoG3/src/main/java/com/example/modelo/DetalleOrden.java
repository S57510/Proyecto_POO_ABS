package com.example.modelo;

public class DetalleOrden{
    private Servicio servicio;
    private int cantidad;

    public DetalleOrden(Servicio servicio, int cantidad){
        this.servicio= servicio;
        this.cantidad= cantidad;
    }

    public Servicio getServicio(){
        return servicio;
    }

    public int getcantidad(){
        return cantidad;
    }

 }
 