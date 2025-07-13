package com.example.modelo;

public class Tecnico extends Persona {
    private String especialidad;

    public Tecnico(String identificacion, String nombre, String telefono, String especialidad) {
        super(identificacion, nombre, telefono);
        this.especialidad = especialidad;
}

 public String getEspecialidad() {
        return especialidad;
 }
 

 public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
 }

public String mostrarInformacionCompleta() {
        String datos = super.toString();
        return datos + String.format("%-10s", especialidad);
    }
}