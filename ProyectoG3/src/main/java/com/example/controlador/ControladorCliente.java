package com.example.controlador;
import java.util.ArrayList;
import com.example.modelo.Cliente;
import com.example.modelo.TipoCliente;
import com.example.Vista.MensajeUsuario;


public class ControladorCliente {
   private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
   
   public ControladorCliente() {
   }

   public Cliente buscarCliente(String identificacion) {
      for (Cliente cliente : clientes) {
        if (cliente.getIdentificacion().equals(identificacion)) {
            return cliente;
        }
      }
      return null;
   }

   public MensajeUsuario agregarCliente(String identificacion, String nombre, String direccion, String telefono, TipoCliente tipoCliente) {
      if (buscarCliente(identificacion) == null) {
         Cliente cliente = new Cliente(identificacion, nombre, direccion, telefono, tipoCliente);
         this.clientes.add(cliente);
         return null;
      } else {
         return new MensajeUsuario("Agregar Cliente", "El cliente ya existe");
      }
   }

   public ArrayList<Cliente> getClientes() {
      return this.clientes;
   }

}