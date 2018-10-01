package dnvs.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dnvs.spring.models.Festa;

@Controller
@RequestMapping("festa")
public class FestaController {

	@GetMapping("cadastrar")
	public String abrirForm() {

		return "festa/form";

	}

	@PostMapping("cadastrar")
	public ModelAndView processarForm(Festa f) {

		ModelAndView back = new ModelAndView("festa/form").addObject("msg" , "Festa cadastrada!");
		return back;



	}

}
