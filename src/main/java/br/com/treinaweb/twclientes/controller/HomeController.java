package br.com.treinaweb.twclientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/mensagem")
	public ModelAndView mensagem () {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("mensagem");
		modelAndView.addObject("mensagem", "Mensagem ModelAndViewe");
		return modelAndView;
		
	}
	
	@GetMapping("/saudacao")
	public ModelAndView saudacao(@RequestParam (required = false, defaultValue = "TreinaWeb") String nome) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("saudacao");
		modelAndView.addObject("nome", nome);
		return modelAndView;
	}
}
