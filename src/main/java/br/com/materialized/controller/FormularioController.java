package br.com.materialized.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.materialized.model.Usuario;

@Controller
public class FormularioController {

	@RequestMapping("/test/formulario")
	public String novo() {
		return "/test/formulario";
	}
	
	@RequestMapping(value = "/test/formulario", method = RequestMethod.POST)
	public String cadastrar(Usuario usuario) {
		System.out.println(">>> Nome: " + usuario.getNome());
		System.out.println(">>> E-mail: " + usuario.getEmail());
		System.out.println(">>> Senha: " + usuario.getSenha());
		return "/test/formulario";
	}
	
}
