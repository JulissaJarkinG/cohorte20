package com.generation.jxjg.myappjwt.controllers;

import java.util.HashMap;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
@RestController
@RequestMapping("")
public class PruebaController {
	@GetMapping("/mensaje")
	public ResponseEntity<?> getMensaje(){
		var auth = SecurityContextHolder.getContext().getAuthentication();
		        logger.info("Datos usuario {}", auth.getPrincipal());
		        logger.info("Permisos usuario", auth.getAuthorities());
		        logger.info("Estado usuario", auth.isAuthenticated());
		        Map<String,String> mensaje = new HashMap<>();
		        mensaje.put("contenido","Hola Mundo jwt");
		        return ResponseEntity.ok(mensaje);
	}
	 @GetMapping("/publico")
	     public ResponseEntity <?> getMensajepublic() {
	         var auth = SecurityContextHolder.getContext().getAuthentication();
	         logger.info("Datos usuario {}", auth.getPrincipal());
	         logger.info("Permisos usuario", auth.getAuthorities());
	         logger.info("Estado usuario", auth.isAuthenticated());
	         Map<String,String> mensaje = new HashMap<>();
	         mensaje.put("contenido","Hola Mi querido publico jwt");
	         return ResponseEntity.ok(mensaje);
	     }
	     
	     @GetMapping("/admin")
	     public ResponseEntity <?> getMensajeadmin() {
	         var auth = SecurityContextHolder.getContext().getAuthentication();
	         logger.info("Datos usuario {}", auth.getPrincipal());
	         logger.info("Permisos usuario", auth.getAuthorities());
	         logger.info("Estado usuario", auth.isAuthenticated());
	         Map<String,String> mensaje = new HashMap<>();
	         mensaje.put("contenido","Hola Mi querido admin jwt");
	         return ResponseEntity.ok(mensaje);
	     }

}
