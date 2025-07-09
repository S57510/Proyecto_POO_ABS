package com.example.modelo;

public class Cliente extends Persona{

    private boolean cliente;
    private String direccion;

    public Cliente(String identificacion, String nombre, String direccion, String telefono, boolean tipoCliente) {
        super(identificacion, nombre, telefono);
        this.direccion= direccion;
        this.cliente = tipoCliente;
    }

    public String toString(){
        return "Cliente{ "+super.toString()+ 
               "\ncliente: " + cliente + " }";
    }

    public void mostrarDatos() {
        System.out.println(this.toString());
    }

    public void agregarCliente(String identificacion, String nombre, String direccion, String telefono, boolean tipoCliente){
        // agregar a la lista de clientes
    }
}
