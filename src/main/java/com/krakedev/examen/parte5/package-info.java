package com.krakedev.examen.parte5;

import com.krakedev.examen.parte1.Vendedor;
import com.krakedev.examen.parte1.VendedorComision;
import com.krakedev.examen.parte1.VendedorMixto;
import com.krakedev.examen.parte2.AdminVentas;

public class VendedorController {

    private AdminVentas admin;

    public VendedorController() {
        admin = new AdminVentas();
    }

    // Método agregarVendedor
    public void agregarVendedor(Vendedor vendedor) {
        if ("V".equals(vendedor.getTipo())) {
            Vendedor v = new Vendedor(vendedor.getCedula(), "V");
            v.setSueldoFijo(vendedor.getSueldoFijo());
            admin.agregar(v);
        } else if ("C".equals(vendedor.getTipo())) {
            VendedorComision vc = new VendedorComision(vendedor.getCedula());
            vc.setNumeroVentas(vendedor.getNumeroVentas());
            vc.setComisionPorVenta(vendedor.getComisionPorVenta());
            admin.agregar(vc);
        } else if ("M".equals(vendedor.getTipo())) {
            VendedorMixto vm = new VendedorMixto(vendedor.getCedula());
            vm.setSueldoFijo(vendedor.getSueldoFijo());
            vm.setNumeroVentas(vendedor.getNumeroVentas());
            admin.agregar(vm);
        }
    }

    // Método calcularSueldoVendedor
    public double calcularSueldoVendedor(String cedula) {
        Double sueldo = admin.calcularSueldo(cedula);
        return (sueldo != null) ? sueldo : 0.0;
    }
}
