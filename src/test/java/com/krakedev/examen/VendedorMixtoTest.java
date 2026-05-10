package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.krakedev.examen.parte1.VendedorMixto;

public class VendedorMixtoTest {

    @Test
    public void testCalcularSueldoConVentas() {
        VendedorMixto vendedor = new VendedorMixto("0102030405","M");
        vendedor.setSueldoFijo(500.0);
        vendedor.setNumeroVentas(10);

        double sueldo = vendedor.calcularSueldo();

        // 500 + (500 * 0.01 * 10) = 550
        assertEquals(550.0, sueldo, "El sueldo debe ser fijo + 1% por cada venta");
    }

    @Test
    public void testCalcularSueldoSinVentas() {
        VendedorMixto vendedor = new VendedorMixto("0102030405","M");
        vendedor.setSueldoFijo(500.0);
        vendedor.setNumeroVentas(0);

        double sueldo = vendedor.calcularSueldo();

        // 500 + (500 * 0.01 * 0) = 500
        assertEquals(500.0, sueldo, "El sueldo debe ser igual al fijo si no hay ventas");
    }
}
