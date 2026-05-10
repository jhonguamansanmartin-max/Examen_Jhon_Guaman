package com.krakedev.examen.parte1;  // Puedes cambiar el paquete según tu proyecto

public class Vendedor {

    private String cedula;
    private int numeroVentas;
    private double sueldoFijo;
    private double comisionPorVenta;

    
    public Vendedor(String cedula) {
        this.cedula = cedula;
        this.numeroVentas = 0;
        this.sueldoFijo = 0.0;
        this.comisionPorVenta = 0.0;
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    public double getComisionPorVenta() {
        return comisionPorVenta;
    }

    public void setComisionPorVenta(double comisionPorVenta) {
        this.comisionPorVenta = comisionPorVenta;
    }

    // Método calcularSueldo
    public double calcularSueldo() {
        return this.sueldoFijo;   // Según el enunciado actual
    }

    // Sobrescritura de toString
    @Override
    public String toString() {
        return "Vendedor [cedula=" + cedula + 
               ", numeroVentas=" + numeroVentas + 
               ", sueldoFijo=" + sueldoFijo + 
               ", comisionPorVenta=" + comisionPorVenta + "]";
    }
}