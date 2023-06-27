package com.proempresa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "clientes")
public class Cliente implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	
	
	@NotEmpty(message = "Nombre no puede estar vacio")
	@Size(min = 2, max = 15, message = "nombre debe de estar entre 6 y 15 letras.")
	private String nombre;
	
	@NotEmpty(message = "Apellido no puede estar vacio.")
	private String apellido;
	
	@Size(min = 8, max = 8, message = "DNI tiene que ser 8 numeros")
	private String nro_documento;
	
	@NotEmpty(message = "email no puede estar vacio.")
	@Email(message = "No es una dirección de correo bien formada.")
	private String email;
	
	@NotNull(message = "Fecha no puede estar vacia.")	
	@Temporal(TemporalType.DATE)
	private Date create_at;
	
	//un cliente puede tener muchas ventas.
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Venta> ventas;
	
	
	@PrePersist
	public void prePersist() {
		create_at = new Date();
	}
	
	public Cliente() {
		
		this.ventas = new ArrayList<>();
		
	}
	
	
	
	

	public Cliente(Long id_cliente,
			@NotEmpty(message = "Nombre no puede estar vacio") @Size(min = 2, max = 15, message = "nombre debe de estar entre 6 y 15 letras.") String nombre,
			@NotEmpty(message = "Apellido no puede estar vacio.") String apellido,
			@Size(min = 8, max = 8, message = "DNI tiene que ser 8 numeros") String nro_documento,
			@NotEmpty(message = "email no puede estar vacio.") @Email(message = "No es una dirección de correo bien formada.") String email,
			@NotNull(message = "Fecha no puede estar vacia.") Date create_at) {
	
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nro_documento = nro_documento;
		this.email = email;
		this.create_at = create_at;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

	public String getNro_documento() {
		return nro_documento;
	}

	public void setNro_documento(String nro_documento) {
		this.nro_documento = nro_documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	
	

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", numero_documento=" + nro_documento + ", email=" + email + ", create_at=" + create_at + "]";
	}
	
	

}
