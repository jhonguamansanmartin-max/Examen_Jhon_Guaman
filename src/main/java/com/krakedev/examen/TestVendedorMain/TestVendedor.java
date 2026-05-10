package com.krakedev.examen.TestVendedorMain;

import com.krakedev.examen.parte1.Vendedor;

public class TestVendedor {

    public static void main(String[] args) {
        // Crear un vendedor normal (tipo "V")
        Vendedor vendedor = new Vendedor("12345", "V");

        // Mostrar los datos del vendedor
        System.out.println(vendedor);
    }
}
