package com.nttdata2.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nttdata2.models.Usuario;

@Repository //es una interfaz que siempre extiende de CrudRepository para comunicarse con la DB
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	List<Usuario> findAll();

}
