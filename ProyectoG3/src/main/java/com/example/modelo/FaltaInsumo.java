package com.example.modelo;

public class FaltaInsumo {
    private String descripcion;
    private String indentificacionP;

    public FaltaInsumo(String descripcion, String indentificacionP) {
        this.descripcion = descripcion;
        this.indentificacionP = indentificacionP;
    }

    public void agregarFaltaInsumo(String descripcion, String indentificacionP) {
        // agregar la falta de insumo
    }

    public String toString() {
        return "FaltaInsumo{ descripcion: " + descripcion + 
               "\nindentificacionP: " + indentificacionP + " }";
    } 

        public String getDescripcion() {
        return descripcion;
    }

    public String getindentificacionP() {
        return indentificacionP;
    }
}