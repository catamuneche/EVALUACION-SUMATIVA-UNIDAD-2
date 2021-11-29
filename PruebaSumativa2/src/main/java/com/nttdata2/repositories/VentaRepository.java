package com.nttdata2.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nttdata2.models.Venta;

@Repository //es una interfaz que siempre extiende de CrudRepository para comunicarse con la DB
public interface VentaRepository extends CrudRepository<Venta, Long> {
	
	List<Venta> findAll();

}