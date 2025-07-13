package com.example.controlador;

import java.util.ArrayList;
import com.example.modelo.Tecnico;
import com.example.vista.MensajeUsuario;


public class ControladorTecnico {
   private ArrayList<Tecnico> Tecnicos = new ArrayList();

   public ControladorTecnico() {
   }

  public Tecnico buscarTecnico(String identificacion) {
      for (Tecnico tecnico : tecnicos) {
        if (tecnico.getIdentificacion().equals(identificacion)) {
            return tecnico;
        }
      }

   public MensajeUsuario agregarTecnico(String identificacion, String nombre, String telefono, String especialidad) {
      if (this.buscarTecnico(identificacion) == null) {
         Tecnico tecnico = new Tecnico(identificacion, nombre, telefono, especialidad);
         this.tecnicos.add(tecnico);
         return null;
      } else {
         return new MensajeUsuario("Agregar Técnico", "El Técnico ya existe");
      }
   }

   public MensajeUsuario eliminarTecnico(String identificacion) {
      if (this.buscarTecnico(identificacion) != null) {
         Tecnico tecnico = this.buscarTecnico(identificacion);
         this.tecnicos.remove(tecnico);
         return null;
      } else {
         return new MensajeUsuario("Eliminar Técnico" , "El técnico no existe");
      }
   }

   public ArrayList<Tecnico> getTecnicos() {
      return tecnicos;
   }
}
}