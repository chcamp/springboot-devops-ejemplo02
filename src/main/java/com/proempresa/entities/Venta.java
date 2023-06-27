package com.proempresa.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "ventas")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_venta;
	
	@NotNull(message = "Fecha no puede estar vacia.")	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Size(min = 2, max = 20, message = "serie debe de estar entre 6 y 15 letras.")
	private String serie;
	
	@Size(max = 50,message = "numero maximo es de 50")
	private String numero;
	
	private Double total;
	
	//muchas ventas estan asociadas a un cliente.
	@JsonIgnoreProperties(value={"ventas","hibernateLazyInitializer", "handler"},
			allowSetters = true)
	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente cliente;
	
	//una Venta tiene muchos detalleVentas
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "venta_id")
	private List<DetalleVenta> detalleVentas;
	
	public Venta() {
		this.detalleVentas = new ArrayList<>();
	}
	
	public Double totalVentas(){
	
		
		for(DetalleVenta detalleVenta: detalleVentas) {
			total +=detalleVenta.calcularSubTotal();
		}
		
		return total;
		
	}

	public Long getId_venta() {
		return id_venta;
	}

	public void setId_venta(Long id_venta) {
		this.id_venta = id_venta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	

	public List<DetalleVenta> getDetalleVentas() {
		return detalleVentas;
	}

	public void setDetalleVentas(List<DetalleVenta> detalleVentas) {
		this.detalleVentas = detalleVentas;
	}

	@Override
	public String toString() {
		return "Venta [id_venta=" + id_venta + ", fecha=" + fecha + ", serie=" + serie + ", numero=" + numero
				+ ", total=" + total + "]";
	}	
	

}
