package com.example.vista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import project.controlador.ControladorCliente;
import project.modelo.Cliente;
import project.modelo.TipoCliente;

public class VistaCliente {
   ControladorCliente controlador;

   public VistaCliente(ControladorCliente controlador) {
      this.controlador = controlador;
   }

   public void administrarClientes() {
    int opcion;
    do{
      System.out.println("*****Administrar cliente******");
      System.out.println("1) Agregar Cliente");
      System.out.println("2) Regresar al menú principal");
      System.out.println("3) Regresar al menú principal");
      System.out.print("Seleccione una opción: ");
      opcion =sc.nextInt();
      sc.nextLine();

       switch (opcion) {
                case 1 -> agregarCliente(sc);
                case 2 -> mostrarClientes();
                case 3 -> System.out.println("Regresando al menú principal...");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }
   }

   public void agregarCliente(Scanner sc) {
      System.out.println("Ingrese la identificación del cliente: ");
      String identificacion = sc.nextLine();
      System.out.println("Ingrese el nombre del cliente: ");
      String nombre = sc.nextLine();
      System.out.println("Ingrese la dirección del cliente: ");
      String direccion = sc.nextLine();
      System.out.println("Ingrese el teléfono del cliente: ");
      String telefono = sc.nextLine();

      TipoCliente tipoCliente = null;
      while(tipoCliente == null) {
         System.out.println("Ingrese el tipo de Cliente (Personal o Empresarial): ");
         String tipoTexto = sc.nextLine().toUpperCase();
         tipoCliente = obtenerTipoClienteDesdeTexto(tipoTexto);

            if (tipoCliente == null) {
                System.out.println("Tipo inválido. Intente nuevamente el tipo cliente");
            }
        }
      }

      MensajeUsuario mensaje = this.controlador.agregarCliente(identificacion, nombre, direccion, telefono, tipoCliente);
      if (mensaje != null) {
         this.mostrarMensaje(mensaje.toString());
      } else {
         this.mostrarMensaje("Cliente agregado");
      }

   

   public void mostrarClientes() {
      ArrayList<Cliente> clientes = controlador.getListaClientes();
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.printf("%-20s %-20s %-20s %-25s %-20s\n", "Identificación", "Nombre", "Teléfono", "Dirección", "Tipo de Cliente");
            System.out.println("*".repeat(105));
            for (Cliente cliente : clientes) {
                System.out.printf("%-20s %-20s %-20s %-25s %-20s\n",
                        cliente.getIdentificacion(),
                        cliente.getNombre(),
                        cliente.getTelefono(),
                        cliente.getDireccion(),
                        cliente.getTipoCliente());
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println("\n[Mensaje]: " + mensaje);
    }

