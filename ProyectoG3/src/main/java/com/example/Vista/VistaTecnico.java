package com.example.vista;

import java.util.ArrayList;
import java.util.Scanner;
import com.example.controlador.ControladorCliente;
import com.example.modelo.Cliente;
import com.example.modelo.TipoCliente;

public class VistaTecnico {
   ControladorTecnico controlador;

   public VistaTecnico(ControladorTecnico controlador) {
      this.controlador = controlador;
   }

   public void administrarTecnicos() {
      System.out.println("*****Administrar técnicos*****");
      System.out.println("1) Agregar Técnico");
      System.out.println("2) Eliminar Técnico");
      System.out.println("3) Regresar al menú principal");
   }
    //agregar
   public void agregarTecnico(Scanner sc) {
      sc.nextLine();
      System.out.println("Ingrese la identificación del técnico: ");
      String identificacion = sc.nextLine();
      System.out.println("Ingrese el nombre del técnico: ");
      String nombre = sc.nextLine();
      System.out.println("Ingrese el teléfono del técnico: ");
      String telefono = sc.nextLine();
      System.out.println("Ingrese la especialidad del técnico: ");
      String especialidad = sc.nextLine();
      MensajeUsuario mensaje = this.controlador.agregarTecnico(identificacion, nombre, telefono, especialidad);
      if (mensaje != null) {
         this.mostrarMensaje(mensaje.toString());
      } else {
         this.mostrarMensaje("Técnico agregado exitosamente");
      }
   }

    //elimina
   public void eliminarTecnico(Scanner sc) {
      scanner.nextLine();
      System.out.println("Ingrese la identificación del técnico: ");
      String identificacion = sc.nextLine();
      System.out.println("¿Está seguro que desea eliminar el registro? (Si/No):");
      String respuesta = sc.nextLine().toUpperCase;
      if (respuesta.equals("Si")) {
         MensajeUsuario mensaje = this.controlador.eliminarTecnico(identificacion);
         if (mensaje != null) {
            this.mostrarMensaje(mensaje.toString());
         } else {
            this.mostrarMensaje("El técnico eliminado exitosamente");
         }
      }

   }

   public void mostrarTecnico() {
      if (this.controlador.getTecnicos().isEmpty()) {
         System.out.println("No hay técnicos registrados");
      } else {
         this.mostrarTecnico(this.controlador.getTecnicos());
      }

   }

   public void mostrarTecnico(ArrayList<Tecnico> tecnicos) {
      System.out.printf("%-20s %-20s %-20s %-10s\n", "Identificación", "Nombre", "Teléfono", "Especialidad");
      System.out.println((new String(new char[70])).replace("\u0000", "*"));
      for (Tecnico tecnico : tecnicos) {
                System.out.printf("%-20s %-20s %-20s %-25s %-20s\n",
                        tecnico.getIdentificacion(),
                        tecnico.getNombre(),
                        tecnico.getTelefono(),
                        tecnico.getEspecialidad());
            }
        }
   }

   public void mostrarMensaje(String m) {
      System.out.println(m);
   }

