package com.example.modelo;

import java.util.ArrayList;
import java.util.List; 
public class Factura {
    private String codigo;
    private String fechaF;
    private OrdenServicio ordenServicio;
    private List<DetalleOrden> detalles;

    public Factura (String codigo, String fechaF, OrdenServicio ordenServicio){
        this.codigo = codigo;
        this.fechaF = fechaF;
        this.ordenServicio = ordenServicio;
        this.detalles = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaF() {
        return fechaF;
    }

    public void setFechaF(String fechaF) {
        this.fechaF = fechaF;
    }

    public OrdenServicio getOrdenServicio() {
        return ordenServicio;
    }

    public void setOrdenServicio(OrdenServicio ordenServicio) {
        this.ordenServicio = ordenServicio;
    }

    @Override
    public String toString() {
        return "Factura {codigo: " + codigo + ", fechaF: " + fechaF + "}";
    }
}

    public void mostrarFactura (){

    }




