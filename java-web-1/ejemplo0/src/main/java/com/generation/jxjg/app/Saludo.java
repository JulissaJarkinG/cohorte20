package com.generation.jxjg.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
	@RequestMapping("/")
	public String saludar() {
		return "Hola mundo desde spring";
	}


}
