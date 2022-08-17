package com.idat.microservicio.dto;

public class Pizza {

	private Integer idPizza;
	private String nombrePizza;
	private String descripcion;
	public Integer getIdPizza() {
		return idPizza;
	}
	public void setIdPizza(Integer idPizza) {
		this.idPizza = idPizza;
	}
	public String getNombrePizza() {
		return nombrePizza;
	}
	public void setNombrePizza(String nombrePizza) {
		this.nombrePizza = nombrePizza;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
