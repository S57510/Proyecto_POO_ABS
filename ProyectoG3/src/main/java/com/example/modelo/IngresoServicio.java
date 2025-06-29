package com.example.modelo;

import java.util.ArrayList;
public class IngresoServicio {
    private String fechaIngreso;
    private List<OrdenServicio> ordenesServicio;

    public IngresoServicio() {
        this.ordenesServicio = new ArrayList<>();
    }
}

public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public List<OrdenServicio> getOrdenesServicio() {
        return ordenesServicio;
    }

    public String mostrarIngresoS (String fecha){
        return fecha;
    }
