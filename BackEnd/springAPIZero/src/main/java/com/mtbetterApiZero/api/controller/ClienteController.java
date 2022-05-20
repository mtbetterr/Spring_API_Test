package com.mtbetterApiZero.api.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtbetterApiZero.domain.model.Cliente;

@RestController
public class ClienteController {
	
	
	@GetMapping("/clientes")
	public List<Cliente> listar(){
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Matheus");
		cliente1.setTelefone("48 991284413");
		cliente1.setEmail("matheusbett123@gmail.com");

		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Magda");
		cliente2.setTelefone("48 998449622");
		cliente2.setEmail("magdasantos3078@gmail.com");
		
		
		return Arrays.asList(cliente1, cliente2);
	}
}
