package com.example.modelo;

public class Persona {
    protected String identificacion;
    protected String nombre;
    protected String telefono;

    public Persona(String identificacion, String nombre, String telefono){
        this.identificacion= identificacion;
        this.nombre= nombre;
        this.telefono= telefono;
    }
    public String toString(){
        return  "Identificacion: " +this.identificacion+ " Nombre: " + this.nombre + " Telefono: " +this.telefono; 
    }

    public String getIdentificacion(){
        return identificacion;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTelefono(){
        return telefono;
    }

}
