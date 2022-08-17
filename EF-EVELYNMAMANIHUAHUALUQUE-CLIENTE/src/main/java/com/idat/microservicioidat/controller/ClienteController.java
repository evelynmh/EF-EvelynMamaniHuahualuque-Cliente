package com.idat.microservicioidat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.microservicio.entity.Cliente;
import com.idat.microservicioidat.service.ClienteService;

@RestController
@RequestMapping("/api/cliente/v1")
public class ClienteController {

	@Autowired
	private ClienteService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Cliente cliente) {
		service.guardar(cliente);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarPizzaCliente() {
		service.asignarPizzaCliente();
	}
}
