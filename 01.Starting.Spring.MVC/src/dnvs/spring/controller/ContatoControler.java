package dnvs.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dnvs.spring.model.Contato;

@Controller
@RequestMapping("contato")
public class ContatoControler {


	//Método que abre a página com o fomulário
	@GetMapping("enviar")
	public String abrirForm() {
		return "contato/form";
	}


	//Método que processa informações do formulário

	@PostMapping("enviar")
	public ModelAndView processForm(Contato c) {

		System.out.println(c.getNome() + "" + c.getEmail() + " " + c.getTelefone());

		ModelAndView retorno = new ModelAndView("contato/form");
		retorno.addObject("msg", "Contato Enviado" );
		retorno.addObject("atributos", c);

		return retorno;

	}





}
