package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.parte1.Vendedor;

public class TestVendedor_JUnit {

	@Test
	void retornoCorrecto_Metodo_calcularSueldo_Vendedor() {
		Vendedor vendedor = new Vendedor("");

		assertEquals(0, vendedor.calcularSueldo(), 0.001);
	}
}