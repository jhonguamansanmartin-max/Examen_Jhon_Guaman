package com.krakedev.examen.parte5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen.parte1.Vendedor;
import com.krakedev.examen.parte1.VendedorComision;
import com.krakedev.examen.parte1.VendedorMixto;
import com.krakedev.examen.parte2.AdminVentas;
@RestController

@RequestMapping("examen")
public class VendedorController {

	private final AdminVentas adminVentas = new AdminVentas();

	@PostMapping
	public void agregarVendedor(@RequestBody Vendedor vendedor) {
		Vendedor v = null;
		if (vendedor.getTipo().equals("V")) {
			v = new Vendedor(vendedor.getCedula(), "V");
		} else if (vendedor.getTipo().equals("C")) {
			v = new VendedorComision(vendedor.getCedula(), "C");
		} else if (vendedor.getTipo().equals("M")) {
			v = new VendedorMixto(vendedor.getCedula(), "M");
		}
		adminVentas.agregar(v);
	}

	@GetMapping("/{cedula}")
	public double calcularSueldoVendedor(@PathVariable String cedula) {
		return adminVentas.calcularSueldo(cedula);
	}
}

