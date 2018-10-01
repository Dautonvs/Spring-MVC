package dnvs.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dnvs.spring.model.Carro;

@Controller
@RequestMapping("carro") //define qual pasta será utilizada p/ a manipulação de fluxo controller<>view
public class CarroController {


	//Método para abrir o formulário
	@GetMapping("cadastrar") //Anotação que obtem a action "cadastrar"
	public String abrirForm() {
		return "carro/form";  //retorna formulário especificado pasta/arquivo
	}

	//Método que processa infos do formulário
	@PostMapping("cadastrar")
	public ModelAndView processarForm(Carro c) {

		//Envia valores para a tela:
		System.out.println(c.getPlaca()+ " " + c.getPreço() + " " + c.getMarca() + " " + c.isAutomatico());

		//Cria objeto de retorno que retorna uma página e um jsp
		ModelAndView retorno = new ModelAndView("carro/form");

		//Adiciona o objeto 'c' ao objeto de retorno 'retorno'
		retorno.addObject("carro", c);


		return retorno;

	}




}
