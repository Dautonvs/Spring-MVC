package dnvs.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dnvs.spring.model.Aluno;

@Controller
@RequestMapping("academia")
public class AcademiaController {


	@GetMapping("cadastrar")
	public String abrirForm() {
		return "academia/form";
	}

	@PostMapping("cadastrar")
	public ModelAndView processarForm(Aluno a) {

		System.out.println(a.getName()+ " " + a.getMatricula()+ " " + a.getTurma()+ " " + a.isMatriculado()+ " " + a.getGenero());
		ModelAndView back = new ModelAndView("academia/sucesso");
		back.addObject("msg", "Aluno registrado!");
		return back;


	}


}
