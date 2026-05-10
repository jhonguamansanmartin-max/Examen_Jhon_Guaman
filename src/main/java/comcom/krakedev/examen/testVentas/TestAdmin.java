package comcom.krakedev.examen.testVentas;

import com.krakedev.examen.parte1.Vendedor;
import com.krakedev.examen.parte1.VendedorComision;
import com.krakedev.examen.parte1.VendedorMixto;
import com.krakedev.examen.parte2.AdminVentas;

public class TestAdmin {
    public static void main(String[] args) {
        // Instanciar AdminVentas
        AdminVentas admin = new AdminVentas();

        // Crear un Vendedor base
        Vendedor vendedorBase = new Vendedor("111");
        vendedorBase.setSueldoFijo(500.0);

        // Crear un VendedorComision
        VendedorComision vendedorComision = new VendedorComision("222");
        vendedorComision.setNumeroVentas(10);
        vendedorComision.setComisionPorVenta(20.0);

        // Crear un VendedorMixto
        VendedorMixto vendedorMixto = new VendedorMixto("333");
        vendedorMixto.setSueldoFijo(500.0);
        vendedorMixto.setNumeroVentas(10);

        // Agregar los vendedores al administrador
        admin.agregar(vendedorBase);
        admin.agregar(vendedorComision);
        admin.agregar(vendedorMixto);

        // Probar calcularSueldo con los tres vendedores
        System.out.println("Sueldo Vendedor Base: " + admin.calcularSueldo("111"));
        System.out.println("Sueldo Vendedor Comisión: " + admin.calcularSueldo("222"));
        System.out.println("Sueldo Vendedor Mixto: " + admin.calcularSueldo("333"));

        // Probar con una cédula inexistente
        System.out.println("Sueldo Vendedor inexistente: " + admin.calcularSueldo("999"));
    }
}
