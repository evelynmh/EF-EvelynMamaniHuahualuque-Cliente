package com.idat.microservicio.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalle_cliente")
public class ClienteDetalle {

	@Id
	private PizzaClienteFK fk =new PizzaClienteFK();

	public PizzaClienteFK getFk() {
		return fk;
	}

	public void setFk(PizzaClienteFK fk) {
		this.fk = fk;
	}
	
	
}
