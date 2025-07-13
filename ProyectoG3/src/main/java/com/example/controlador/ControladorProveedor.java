package com.example.controlador;

import java.util.ArrayList;
import java.util.Iterator;
import com.example.modelo.Proveedor;
import com.example.vista.MensajeUsuario;

public class ControladorProveedor{
   public static ArrayList<Proveedor> proveedores;

   public ControladorProveedor() {
      proveedores = new ArrayList();
   }

   private Proveedor buscarProveedor(String identificacion) {
       for (Proveedor proveedor : proveedores) {
        if (proveedor.getIdentificacion().equals(identificacion)) {
            return proveedor;
        }
      }

   public MensajeUsuario agregarProveedor(String identificacion, String nombre, String telefono, String descripcion) {
      if (this.buscarProveedor(identificacion) == null) {
         Proveedor proveedor = new Proveedor(identificacion, nombre, telefono, descripcion);
         listaProveedores.add(proveedor);
         return null;
      } else {
         return new MensajeUsuario("Agregar Proveedor", "El proveedor ya existe");
      }
   }

   public ArrayList<Proveedor> getProveedores() {
      return proveedores;
   }
}
}