package com.idat.microservicioidat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.microservicio.client.OpenFeignClient;
import com.idat.microservicio.dto.Pizza;
import com.idat.microservicio.entity.PizzaClienteFK;
import com.idat.microservicio.entity.ClienteDetalle;
import com.idat.microservicio.entity.Cliente;
import com.idat.microservicioidat.repository.ClienteRepository;
import com.idat.microservicioidat.repository.DetalleClienteRepository;
import com.idat.microservicioidat.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository repositoryCliente;
	
	@Autowired
	private DetalleClienteRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;
	
	@Override
	public void guardar(Cliente cliente) {
		repositoryCliente.save(cliente);
	}
	
	@Override
	public List<Cliente> listar() {
		return repositoryCliente.findAll();
	}

	@Override
	public Cliente ObtenerId(Integer id) {
		return repositoryCliente.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Integer id) {
		repositoryCliente.deleteById(id);
		
	}

	@Override
	public void actualizar(Cliente cliente) {
		repositoryCliente.saveAndFlush(cliente);
		
	}
	
	@Override
	public void asignarPizzaCliente() {
		
		List<Pizza> listado = feign.listarPizzasSeleccionados();
		PizzaClienteFK fk = null;
		ClienteDetalle detalle = null;

		
		for (Pizza pizza : listado) {
			
			fk = new PizzaClienteFK();
			fk.setIdPizza(pizza.getIdPizza());
			fk.setIdCliente(1);
			
			detalle = new ClienteDetalle();
			detalle.setFk(fk);	
			
			repositoryDetalle.save(detalle);
		}

	}
}
