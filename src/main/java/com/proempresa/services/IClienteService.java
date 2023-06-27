package com.proempresa.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proempresa.entities.Cliente;

@Service
public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);

}
