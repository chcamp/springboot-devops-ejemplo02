package com.proempresa.controller;

import static org.junit.jupiter.api.Assertions.*;	
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.proempresa.dao.IClienteDao;
import com.proempresa.entities.Cliente;

import com.proempresa.services.IClienteService;


@ExtendWith(MockitoExtension.class)
@WebMvcTest(ClienteRestController.class)
class ClienteRestControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private IClienteDao clienteDao;
	
	@MockBean
	private IClienteService clienteService;
	
	

/*
	
	@Test
	public void testListar() throws Exception {
		
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente(1L, "Chris", "Campos", "12345678", "chris@hotmail.com", new Date()));
		clientes.add(new Cliente(2L, "Ronaldo", "Nazario", "55544444", "ron555@gmail.com", new Date()));
		Mockito.when(clienteService.findAll()).thenReturn(clientes);
		
		//emula el get cliente y verifica la rtpa:
		mockMvc.perform(get("/rest/clientes"))
			.andExpect(status().isOk())
			.andExpect((ResultMatcher) content().json("[{id_cliente: 1, nombre: 'Chris', apellido: 'Campos', nro_documento: '12345678', "
					+ "email: 'chris@hotmail.com', create_at: '2023-06-26'}, {id_cliente: 2, nombre: 'Ronaldo', apellido: "
					+ "'Nazario', nro_documento: '55544444', email: 'ron555@gmail.com', create_at: '2022-01-02'}]"));
			
		
	}
	
	
	
	  @Test
	    public void testClienteXId() throws Exception {
	        // Arrange
	        Cliente cliente = new Cliente(1L, "Rolando", "Campos", "12345678", "ccampos@gmail.com", new Date());
	        Mockito.when(clienteService.findById(1L)).thenReturn(cliente);

	        // Act & Assert
	        mockMvc.perform(get("/rest/clientes/{id}", 1L))
	                .andExpect(status().isOk())
	                .andExpect((ResultMatcher) content().json("{id_cliente: 1, nombre: 'Rolando', apellido: 'Campos', " +
	                        "nro_documento: '12345678', email: 'ccampos@gmail.com', create_at: '2022-01-01'}"));
	    } 
	
	  @Test
	    public void testCrear() throws Exception {
	        
	        String requestBody = "{\"nombre\": \"Lucas\", \"apellido\": \"Maura\", \"nro_documento\": \"12345678\", \"email\": \"lucas@gmail.com\"}";

	        
	        Cliente clienteGuardado = new Cliente(1L, "Lucas", "Maura", "12345678", "lucas@gmail.com", new Date());

	        Mockito.when(clienteService.save(Mockito.any(Cliente.class))).thenReturn(clienteGuardado);

	        
	        mockMvc.perform(post("/rest/clientes")
	                .contentType(MediaType.APPLICATION_JSON)
	                .content(requestBody))
	                .andExpect(status().isOk())
	                .andExpect((ResultMatcher) content().json("{id_cliente: 1, nombre: 'John', apellido: 'Doe', nro_documento: '12345678', email: 'john@example.com', create_at: '2022-01-01'}"));
	    } 
	
	  @Test
	    public void testUpdate() throws Exception {
	        
	        String requestBody = "{\"nombre\": \"Lionel\", \"apellido\": \"Messi\", \"nro_documento\": \"12345678\", \"email\": \"messi@hotmail.com\"}";

	        
	        Cliente clienteActualizado = new Cliente(1L, "Lionel", "Messi", "12345678", "messi@hotmail.com", new Date());

	        Mockito.when(clienteService.findById(1L)).thenReturn(clienteActualizado);
	        Mockito.when(clienteService.save(Mockito.any(Cliente.class))).thenReturn(clienteActualizado);

	        
	        mockMvc.perform(put("/rest/clientes/{id}", 1L)
	                .contentType(MediaType.APPLICATION_JSON)
	                .content(requestBody))
	                .andExpect(status().isCreated())
	                .andExpect((ResultMatcher) content().json("{id_cliente: 1, nombre: 'Lionel', apellido: 'Messi', nro_documento: '12345678', email: 'messi@hotmail.com', create_at: '2022-01-01'}"));
	    }
	    
	    */
	
	   @Test
	    public void testDelete() throws Exception {
	        
	        mockMvc.perform(delete("/rest/clientes/{id}", 1L))
	                .andExpect(status().isNoContent());
	        
	        
	        Mockito.verify(clienteService, Mockito.times(1)).delete(1L);
	    }



	

}
