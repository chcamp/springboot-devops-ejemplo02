package com.proempresa.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "detalle_ventas")
public class DetalleVenta {
	
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_detalle;
	
	
	private Integer cantidad;
	private Double precio;
	
	private Double sub_total;
	
	//muchos DetalleVenta tiene una Producto.
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "id_producto")
	private Producto producto;	
	
	

	
	
	public Double calcularSubTotal() {
		
		cantidad = producto.getCantidad();
		
		return cantidad.doubleValue() * precio;
		
	}
	
	


	public DetalleVenta() {
		
	}



	public Long getId_detalle() {
		return id_detalle;
	}

	public void setId_detalle(Long id_detalle) {
		this.id_detalle = id_detalle;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getSub_total() {
		return sub_total;
	}

	public void setSub_total(Double sub_total) {
		this.sub_total = sub_total;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "DetalleVentas [id_detalle=" + id_detalle + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", sub_total=" + sub_total + "]";
	}
	

}
