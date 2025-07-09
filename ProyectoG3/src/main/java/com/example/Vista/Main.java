package com.example;

import controlador.Controlador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int opcion;
        Controlador controlador = new Controlador();
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("\n*** MENÚ PRINCIPAL ***");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Agregar Proveedor");
            System.out.println("3. Agregar Técnico");
            System.out.println("4. Agregar Servicio");
            System.out.println("5. Listar Servicios");
            System.out.println("6. Agregar Orden de Servicio");
            System.out.println("7. Generar Factura");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción e ingrese el número: ");

            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    controlador.agregarCliente();
                    break;
                case 2:
                    controlador.agregarProveedor();
                    break;
                case 3:
                    controlador.agregarTecnico();
                    break;
                case 4:
                    controlador.agregarServicio();
                    break;
                case 5:
                    controlador.listarServicios();
                    break;
                case 6:
                    controlador.agregarOrden();
                    break;
                case 7:
                    controlador.generarFactura();
                    break;
                case 8:
                    controlador.salir();
                    break;
                default:
                    System.out.println("Opción inválida ");
            }

        } while (opcion != 8);


        sc.close();
    }
}
