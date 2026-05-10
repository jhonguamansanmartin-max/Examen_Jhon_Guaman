package com.krakedev.examen.parte1;

public class VendedorComision extends Vendedor {

   
    public VendedorComision(String cedula) {
        super(cedula);
    }

    @Override
    public double calcularSueldo() {
       
        return getComisionPorVenta() * getNumeroVentas();
    }
}
