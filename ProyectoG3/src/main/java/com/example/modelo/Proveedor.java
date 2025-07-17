package com.example.modelo;

public class Proveedor extends Persona{
    private String descripcion;

    public Proveedor(String nombre, String identificacion, String telefono, String descripcion) {
        super(identificacion, nombre, telefono);
        this.descripcion = descripcion;
    }

    public String toString(){
        return "Proovedor{ "+super.toString()+ String.format("%-10s", this.descripcion)+ " }";
    }

   public String getDescripcion() {
      return this.descripcion;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion= descripcion ;
   }
  
}