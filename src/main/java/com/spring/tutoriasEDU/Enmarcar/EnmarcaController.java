package com.spring.tutoriasEDU.Enmarcar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.spring.tutoriasEDU.Actividad.ActividadDAO;
import com.spring.tutoriasEDU.planes.PlanDao;

@Controller
public class EnmarcaController {

	@Autowired
	EnmarcaDAO enmarcaDAO;
	@Autowired
	ActividadDAO actividadDAO;
	@Autowired
	PlanDao planDAO;
	
	@GetMapping("/enmarcar")
	public ModelAndView getEnmarcaciones() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("enmarcar");
		List<Enmarca> enmarcaciones = (List<Enmarca>) enmarcaDAO.findAll();
		model.addObject("enmarcaciones", enmarcaciones);
		return model;
	}
	@GetMapping("/enmarcar/{id}")
	public ModelAndView getEnmarcacion(@PathVariable long id) {
		
		Enmarca enmarca = enmarcaDAO.findById(id).get();
		
		ModelAndView model = new ModelAndView();
		model.setViewName("enmarca");
		model.addObject("enmarca", enmarca);
		
		return model;
	}
}
