package com.spring.tutoriasEDU.tutores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.spring.tutoriasEDU.planes.Plan;
import com.spring.tutoriasEDU.planes.PlanDao;

@Controller
public class TutorController {

	
	@Autowired
	TutorDAO tutorDAO;
	
	@Autowired
	PlanDao tutoriaDAO;
	

}
