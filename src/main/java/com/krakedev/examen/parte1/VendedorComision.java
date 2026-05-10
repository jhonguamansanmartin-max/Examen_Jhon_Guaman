package com.krakedev.examen.parte1;

public class VendedorComision extends Vendedor {

    public VendedorComision(String cedula,String tipo) {
        // Ahora pasamos también el tipo "C" (Comisión)
        super(cedula, "C");
    }

    @Override
    public double calcularSueldo() {
        // Sueldo = comisión por venta * número de ventas
        return getComisionPorVenta() * getNumeroVentas();
    }
}
