package com.example.modelo;

    public class HistoialPrecio{
        private double precio;
        private String fechaInicio;
        private String fechaFin;
    
        public HistorialPrecio(double precio, String fechaInicio, String fechaFin){
            this.precio= precio;
            this.fechaInicio= fechaInicio;
            this.fechaFin= fechaFin;
        }

        public double getPrecio(){
            return precio;
        }

        public String getFechaInicio(){
            return fechaInicio;
        }

        public String getfechaFin(){
           return fechaFin;
           }
    }