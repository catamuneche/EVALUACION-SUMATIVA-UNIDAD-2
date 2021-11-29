package com.nttdata2.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nttdata2.models.Carrito;

@Repository
public interface CarritoRepository extends CrudRepository<Carrito, Long> {
	List<Carrito> findAll();

}
     