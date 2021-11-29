package com.nttdata2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carritos")
public class Carrito {

	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY) // auto incrementable	
	private Long id;
	
//	// Relación na1
//		@OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
//		private List<Producto> lista_productos;
		
}
