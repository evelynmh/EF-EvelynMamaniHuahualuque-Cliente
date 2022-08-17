package com.idat.microservicioidat.service;

import java.util.List;

import com.idat.microservicio.entity.Cliente;

public interface ClienteService {

	List<Cliente> listar();
	Cliente ObtenerId(Integer id);	
	void guardar(Cliente cliente);
	void eliminar(Integer id);
	void actualizar(Cliente cliente);
	
	void asignarPizzaCliente();
}
