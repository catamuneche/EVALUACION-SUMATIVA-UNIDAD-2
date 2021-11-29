package com.nttdata2.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nttdata2.models.Producto;
import com.nttdata2.services.ProductoService;
import com.nttdata2.services.UsuarioService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	ProductoService productoService;
	
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("")
	public String Producto(@ModelAttribute("producto") Producto producto,
			Model model) {
		model.addAttribute("listaProducto", productoService.obtenerListaProductos());
		model.addAttribute("listaUsuario", usuarioService.obtenerListaUsuarios());
		return "producto/producto.jsp";
	}
	
	@RequestMapping("/crear")
	public String login(@Valid @ModelAttribute("producto") Producto producto) {
		productoService.insertarProducto(producto);
		return "redirect:/producto";
	}
	
	@RequestMapping("/eliminar")
	public String eliminarObj(@RequestParam("id") Long id) {
		
		System.out.println("Id: "+ id);
		Producto producto = productoService.buscarProductoId(id);
		
		if(producto != null) {
			productoService.eliminarProductoObj(producto);
		}

		return "redirect:/producto";
	}
	
	@RequestMapping ("/editar")
	public String editar(@RequestParam("id") Long id, Model model) {
		Producto producto = productoService.buscarProductoId(id);
		if(producto != null) {
			model.addAttribute("producto", producto);
			return "/producto/producto.jsp";
		}
		return "redirect:/producto";
	}
	
	
	@RequestMapping(value="/actualizar", method = RequestMethod.PUT)
	public String actualizar(@Valid @ModelAttribute("usuario") Producto producto, Model model) {
		System.out.println("id " + producto.getId());
		productoService.actualizarProducto(producto);
		return "redirect:/producto";
	}
}
