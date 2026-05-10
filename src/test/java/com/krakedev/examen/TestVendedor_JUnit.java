package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.parte1.Vendedor;

public class TestVendedor_JUnit {

    @Test
    void retornoCorrecto_Metodo_calcularSueldo_Vendedor() {
        
        Vendedor vendedor = new Vendedor("12345", "V");
        vendedor.setSueldoFijo(0.0); 


        assertEquals(0.0, vendedor.calcularSueldo(), 0.001,
                "El sueldo debe ser 0 si el sueldo fijo es 0");
    }
}
