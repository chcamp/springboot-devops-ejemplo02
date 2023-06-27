package com.proempresa.controller;	

import java.util.List;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proempresa.entities.Cliente;
import com.proempresa.services.IClienteService;

import io.swagger.annotations.Api;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/rest")
@Api(tags = "Clientes", description = "API para operaciones CRUD de Clientes")
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> listar(){
		
		return clienteService.findAll();
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente clienteXId(@PathVariable Long id) {
		
		return clienteService.findById(id);
	}
	
	@PostMapping("/clientes")
	public Cliente crear(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
		
		Cliente clienteActualXId = clienteService.findById(id);
		
		clienteActualXId.setNombre(cliente.getNombre());
		clienteActualXId.setApellido(cliente.getApellido());
		clienteActualXId.setNro_documento(cliente.getNro_documento());
		clienteActualXId.setEmail(cliente.getEmail());
		
		return clienteService.save(clienteActualXId);
	}
	
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);
	}

}
