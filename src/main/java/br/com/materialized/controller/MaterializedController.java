package br.com.materialized.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MaterializedController {

	@RequestMapping("/")
	public String principal() {
		return "index";
	}
	
	@RequestMapping("/page-blank")
	public String pageBlank() {
		return "page-blank";
	}
	
}
