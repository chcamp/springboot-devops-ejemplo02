package com.proempresa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.proempresa.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
	
	public List<Cliente> findAll();
	

}
