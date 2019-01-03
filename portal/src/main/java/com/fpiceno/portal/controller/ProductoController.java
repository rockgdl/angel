package com.fpiceno.portal.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpiceno.portal.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private  ProductoService servicio;
	
	@RequestMapping(value="/principal")
	public String home(ModelMap model, Authentication authentication) {
//		authentication.getPrincipal();
		model.addAttribute("productos", servicio.getProducts());
		model.addAttribute("fecha", new Date());
 		return "user-info-thymeleaf";
 	}
	@RequestMapping(value="/error")
	public String error() {
 		return "access-denied";
 	}

}
