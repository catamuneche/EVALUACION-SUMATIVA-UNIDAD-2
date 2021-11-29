package com.nttdata2.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nttdata2.models.Producto;
import com.nttdata2.services.ProductoService;

@Controller
@RequestMapping("/carrito")
public class CarritoController {
	@Autowired
	ProductoService productoService;
		
	@RequestMapping("")
	public String inicio() {
		return "carrito/carrito.jsp";
	}
	
	@RequestMapping("/agregar")
	public String agregar(@Valid @ModelAttribute("producto") Producto producto) {
		
		
		return "carrito/carrito.jsp";
	}
	

}
