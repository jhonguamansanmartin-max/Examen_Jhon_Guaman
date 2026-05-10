package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.parte1.VendedorComision;

public class TestVendedorComision_JUnit {
	@Test
	void retornoCorrecto_Metodo_calcularSueldo_VendedorComision() {
		VendedorComision vendedor = new VendedorComision("12345","C");

		assertEquals(0, vendedor.calcularSueldo(), 0.001);
	}
}
