package com.example.modelo;

public class Proovedor extends Persona{
    private String descripcion;

    public Prooverdor(String nombre, String identificacion, String telefono, String descripcion) {
        super(identificacion, nombre, telefono);
        this.descripcion = descripcion;
    }

    public String toString(){
        return "Proovedor{ "+super.toString()+ 
               "\ndescripcion " + descripcion + " }";
    }

    public void mostrarDatos(){
        System.out.println(this.toString());
    }

    public void agregarProovedor(String identificacion, String nombre, String telefono, String descripcion){
        // agregar a la lista de proovedores
    }   
}