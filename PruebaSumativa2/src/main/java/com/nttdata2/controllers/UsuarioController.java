package com.nttdata2.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nttdata2.models.Usuario;
import com.nttdata2.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired // permite inyección de dependencias
	UsuarioService usuarioService;

	// Desplegar vista usuario
	@RequestMapping("")
	public String usuario(@ModelAttribute("usuario") Usuario usuario,
			Model model) {
		//Usuario usuario1= new Usuario();
		//List<Usuario> listaUsuarios = usuarioService.obtenerListaUsuarios();
		//model.addAttribute("usuario", new Usuario());
		model.addAttribute("listaUsuarios", usuarioService.obtenerListaUsuarios());
		return "usuario/usuario.jsp";
	}
	
	// Capturar info formulario
	@RequestMapping("/login")
	/* public String login(@RequestParam("name") String name,
			@RequestParam("last_name") String last_name,
			@RequestParam("limit") String limit,
			@RequestParam("cp") String cp
			) { */
	public String login(@Valid @ModelAttribute("usuario") Usuario usuario) {
		//System.out.println(name+" "+last_name+" "+limit+" "+cp);
		//System.out.println(usuario.getName()+" "+usuario.getLast_name()+" "+usuario.getLimite()+" "+usuario.getCp());
		usuarioService.insertarUsuario(usuario);
		return "redirect:/usuario";
	}
	
	@RequestMapping("/eliminar")
	public String eliminarObj(@RequestParam("id") Long id) {
		
		System.out.println("Id: "+ id);
		Usuario usuario = usuarioService.buscarUsuarioId(id);
		
		if(usuario != null) {
			usuarioService.eliminarUsuarioObj(usuario);
		}

		return "redirect:/usuario";
	}
	
	@RequestMapping("/editar")
	public String editar(@RequestParam("id") Long id, Model model) {
		
		Usuario usuario = usuarioService.buscarUsuarioId(id);
		if(usuario != null) {
			model.addAttribute("usuario", usuario);
			return "usuario/editar.jsp";
		}

		return "redirect:/usuario";
		
	}
	
	@RequestMapping(value="/actualizar", method = RequestMethod.PUT)
	public String actualizar(@Valid @ModelAttribute("usuario") Usuario usuario, Model model) {
		System.out.println("id " + usuario.getId());
		usuarioService.actualizarUsuario(usuario);
		return "redirect:/usuario";
	}
	
	public String validaUsuario(Usuario usuario) {
		String error="";
		
		if(usuario.getNombre()==null || usuario.getNombre().isEmpty() || usuario.getApellido()==null || usuario.getApellido()==null
				|| usuario.getApellido().isEmpty() ) {
			error="Los campos no pueden estar vacíos!";
		return "error.jsp";
		}

		if(containsDigit(usuario.getNombre())) {
			error="El nombre no puede contener números! ";
		}else if(usuario.getNombre().length()<1 || usuario.getNombre().length()>10) {
			error+="El nombre debe tener de 1 a 10 caracteres! ";
		}

		if(containsDigit(usuario.getApellido())) {
			error+="El apellido no puede contener números! ";
		}else if(usuario.getApellido().length()<1 || usuario.getApellido().length()>10) {
			error+="El Apellido debe tener de 1 a 10 caracteres! ";
		}
		
		return error;
	}
	

	//Verifica si el string contiene números
	public static boolean containsDigit(String s) {
		boolean containsDigit = false;
		for (char c : s.toCharArray()) {
			if (containsDigit = Character.isDigit(c)) {
				containsDigit=true;
				break;
			}
		}
		
		return containsDigit;
	}
	
}
