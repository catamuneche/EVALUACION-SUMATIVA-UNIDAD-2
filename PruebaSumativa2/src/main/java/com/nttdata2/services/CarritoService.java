package com.nttdata2.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata2.models.Carrito;
import com.nttdata2.repositories.CarritoRepository;

@Service
public class CarritoService {
	@Autowired
	CarritoRepository carritoRepository;


	public void insertarCarrito(@Valid Carrito carrito) {
		carritoRepository.save(carrito);
	}

	public void actualizarCarrito(@Valid Carrito carrito) {
		carritoRepository.save(carrito);
	}

	public List<Carrito> obtenerListaCarritos() {
		return carritoRepository.findAll();
	}

	public Carrito buscarCarritoId(Long id) {
		return carritoRepository.findById(id).get();
	}

	public void eliminarCarrito(Long id) {
		carritoRepository.deleteById(id);
	}

	public void eliminarCarritoObj(Carrito carrito) {
		carritoRepository.delete(carrito);
	}

}
