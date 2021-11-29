package com.nttdata2.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata2.models.Venta;
import com.nttdata2.repositories.VentaRepository;

@Service 
public class VentaService {
	@Autowired
	VentaRepository ventaRepository;
	
	public void insertarVenta(@Valid Venta producto) {
		ventaRepository.save(producto);
	}

	
	public void actualizarVenta(@Valid Venta producto) {
		ventaRepository.save(producto);
	}
	
	public List<Venta> obtenerListaVentas() {
		return ventaRepository.findAll();
	}
	
	public Venta buscarVentaId(Long id) {
		return ventaRepository.findById(id).get();
	}

	public void eliminarVenta(Long id) {
		ventaRepository.deleteById(id);
	}

	public void eliminarVentaObj(Venta venta) {
		ventaRepository.delete(venta);
	}
}
