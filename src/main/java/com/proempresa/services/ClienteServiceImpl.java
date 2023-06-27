package com.proempresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proempresa.dao.IClienteDao;
import com.proempresa.entities.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	IClienteDao clienteDao;

	@Override
	public List<Cliente> findAll() {
		
		return clienteDao.findAll();
	}

	@Override
	public Cliente findById(Long id) {
		
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public Cliente save(Cliente cliente) {
		
		return clienteDao.save(cliente);
	}

	@Override
	public void delete(Long id) {
		clienteDao.deleteById(id);
		
	}

}
