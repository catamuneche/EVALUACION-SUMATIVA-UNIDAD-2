package com.nttdata2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //representacion de la entidad modelo
@Table(name="productos") //nombre de la tabla en DB
public class Producto {
	@Id //este es el is o primary key de la tabla
	@GeneratedValue(strategy=GenerationType.IDENTITY) //es autoincrementable
	private Long id;
	private String nombreProducto;
	private String descripcionProducto;
	private String precioProducto;
	public Producto() {
		super();
	}
	public Producto(Long id, String nombreProducto, String descripcionProducto, String precioProducto) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.descripcionProducto = descripcionProducto;
		this.precioProducto = precioProducto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public String getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(String precioProducto) {
		this.precioProducto = precioProducto;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombreProducto=" + nombreProducto + ", descripcionProducto="
				+ descripcionProducto + ", precioProducto=" + precioProducto + "]";
	}
	
	
}	