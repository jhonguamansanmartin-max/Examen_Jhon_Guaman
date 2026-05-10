package com.krakedev.examen.parte1;

public class VendedorMixto extends Vendedor {

    public VendedorMixto(String cedula) {
        // Ahora pasamos también el tipo "M" (Mixto)
        super(cedula, "M");
    }

    @Override
    public double calcularSueldo() {
        // Sueldo fijo + 1% del sueldo fijo por cada venta realizada
        return getSueldoFijo() + (getSueldoFijo() * 0.01 * getNumeroVentas());
    }
}
