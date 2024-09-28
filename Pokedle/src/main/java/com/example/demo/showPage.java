package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class showPage {
	@RequestMapping("/")
	public String getHomepage() {
		//aca iria algun selector que responda con el archivo correcto dentro de la carpeta src/resources/static
		String pagina = "index";
		return pagina + ".html";
	}
}
