package com.example.modelo;

public class AtencionTecnico {
    private String fechaT;
    private Tecnico tecnico;

public AtencionTecnico(String fechaT, Tecnico tecnico) {
        this.fechaT = fechaT;
        this.tecnico = tecnico;
}

    public String getFechaT() {
        return fechaT;
    }

    public void setFechaT(String fechaT) {
        this.fechaT = fechaT;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public String mostrarAtencionT() {
        return "Fecha de atención: " + fechaT + ", Técnico: " + tecnico;
    }

    public String toString() {
    return "AtencionTecnico{" + "fecha='" + fechaT +", tecnico=" + tecnico.getNombre() + "}";
    }
}