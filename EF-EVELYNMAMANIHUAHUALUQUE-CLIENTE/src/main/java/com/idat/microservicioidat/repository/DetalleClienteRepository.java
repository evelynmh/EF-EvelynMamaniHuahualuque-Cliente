package com.idat.microservicioidat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.microservicio.entity.ClienteDetalle;

@Repository
public interface DetalleClienteRepository extends JpaRepository<ClienteDetalle, Integer>{

}
