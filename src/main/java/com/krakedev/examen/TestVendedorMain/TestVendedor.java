package com.krakedev.examen.TestVendedorMain;

import com.krakedev.examen.parte1.Vendedor;

public class TestVendedor {

    public static void main(String[] args) {
        
        
        Vendedor vendedor = new Vendedor("1712345678");
        
      
        vendedor.setSueldoFijo(1200.00);
        vendedor.setNumeroVentas(8);
        vendedor.setComisionPorVenta(30.0);
        
        
        System.out.println(vendedor);
        

        System.out.println("Sueldo calculado: " + vendedor.calcularSueldo());
    }
}