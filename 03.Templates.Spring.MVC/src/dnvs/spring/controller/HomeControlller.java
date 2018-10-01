package dnvs.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("home")
public class HomeControlller {

	@GetMapping("abrir")
	public String abrirHome() {

		return "home/index";
	}



}
