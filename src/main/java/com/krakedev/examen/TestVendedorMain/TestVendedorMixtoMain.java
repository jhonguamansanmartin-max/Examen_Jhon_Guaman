package com.krakedev.examen.TestVendedorMain;

import com.krakedev.examen.parte1.VendedorMixto;

public class TestVendedorMixtoMain {
    public static void main(String[] args) {
        VendedorMixto vendedor = new VendedorMixto("0102030405");
        vendedor.setSueldoFijo(500.0);
        vendedor.setNumeroVentas(10);

        System.out.println("Sueldo mixto: " + vendedor.calcularSueldo());
        // Resultado esperado: 500 + (500 * 0.01 * 10) = 550.0
    }
}
