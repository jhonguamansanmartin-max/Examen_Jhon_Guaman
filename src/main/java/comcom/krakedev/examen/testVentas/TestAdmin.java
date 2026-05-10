package comcom.krakedev.examen.testVentas;

import com.krakedev.examen.parte1.Vendedor;
import com.krakedev.examen.parte1.VendedorComision;
import com.krakedev.examen.parte1.VendedorMixto;
import com.krakedev.examen.parte2.AdminVentas;

public class TestAdmin {
    public static void main(String[] args) {
        
        AdminVentas admin = new AdminVentas();

       
        Vendedor vendedorBase = new Vendedor("111", "V");
        vendedorBase.setSueldoFijo(500.0);

       
        VendedorComision vendedorComision = new VendedorComision("222","C");
        vendedorComision.setNumeroVentas(10);
        vendedorComision.setComisionPorVenta(20.0);

       
        VendedorMixto vendedorMixto = new VendedorMixto("333", "M");
        vendedorMixto.setSueldoFijo(500.0);
        vendedorMixto.setNumeroVentas(10);

        
        admin.agregar(vendedorBase);
        admin.agregar(vendedorComision);
        admin.agregar(vendedorMixto);

      
        System.out.println("Sueldo Vendedor Base: " + admin.calcularSueldo("111"));
        System.out.println("Sueldo Vendedor Comisión: " + admin.calcularSueldo("222"));
        System.out.println("Sueldo Vendedor Mixto: " + admin.calcularSueldo("333"));

     
        System.out.println("Sueldo Vendedor inexistente: " + admin.calcularSueldo("999"));
    }
}
