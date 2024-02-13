package com.spring.tutoriasEDU.seguridad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SeguridadController {

	@GetMapping("/logout")
	public ModelAndView delPlan(@PathVariable long id) {

		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/plan");

		return model;
	}
	
	@GetMapping("/login")
    public String login() {
        return "login"; 
    }
}
