package com.example.modelo;

public class Cliente extends Persona{

    private TipoCliente tipoCliente;
    private String direccion;

    public Cliente(String identificacion, String nombre, String direccion, String telefono, TipoCliente tipoCliente) {
        super(identificacion, nombre, telefono);
        this.direccion= direccion;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString(){
        return "Cliente{ "+super.toString()+ 
               "\ncliente: " + tipoCliente + " }";
    }

    public boolean ESEmpresarial(){
        return this.tipoCliente == TipoCliente.EMPRESARIAL;
    } 
    //getters y setters
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion ) {
        this.direccion = direccion;
    }
}
