package com.example.vista;

public class MensajeUsuario {
   private String accion;
   private String mensaje;

   public MensajeUsuario(String accion, String mensaje) {
      this.accion = accion;
      this.mensaje = mensaje;
   }

   public String getAccion() {
      return this.accion;
   }

   public void setAccion(String accion) {
      this.accion = accion;
   }

   public String getMensaje() {
      return this.mensaje;
   }

   public void setMensaje(String mensaje) {
      this.mensaje = mensaje;
   }

   public String toString() {
      return this.accion + ": " + this.mensaje;
   }
}
