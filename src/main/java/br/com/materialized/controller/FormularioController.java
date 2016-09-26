package br.com.materialized.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.materialized.model.Usuario;

@Controller
public class FormularioController {

	@RequestMapping("/test/formulario")
	public String novo() {
		return "/test/formulario";
	}
	
	@RequestMapping(value = "/test/formulario", method = RequestMethod.POST)
	public String cadastrar(@Valid Usuario usuario, BindingResult result, Model model, RedirectAttributes attributes) {
		
		if (result.hasErrors()) {
			model.addAttribute("mensagem", "Erro no formulário");
			return "/test/formulario";
		} else {			
			System.out.println(">>> Nome: " + usuario.getNome());
			System.out.println(">>> E-mail: " + usuario.getEmail());
			System.out.println(">>> Senha: " + usuario.getSenha());
		}
		
		// Salvar no banco de dados...
		attributes.addFlashAttribute("mensagem", "Formulário salvo com sucesso!");
		return "redirect:/test/formulario";
		
	}
	
}
