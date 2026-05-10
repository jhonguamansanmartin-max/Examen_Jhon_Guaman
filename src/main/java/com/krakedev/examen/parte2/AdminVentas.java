package com.krakedev.examen.parte2;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.examen.parte1.Vendedor;
@Service
public class AdminVentas {
    private ArrayList<Vendedor> vendedores;
    
    public AdminVentas () {
    	vendedores = new ArrayList();
    }
  
    // Método agregar: recibe un vendedor y lo añade a la lista
    public void agregar(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    // Método calcularSueldo: recibe la cédula y retorna el sueldo calculado
    public Double calcularSueldo(String cedula) {
        for (Vendedor v : vendedores) {
            if (v.getCedula().equals(cedula)) {
                return v.calcularSueldo();
            }
        }
        // Si no existe el vendedor, retorna null
        return null;
    }
}
