package com.fpiceno.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpiceno.portal.service.IUserService;
import com.fpiceno.portal.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private  ProductoService service;
	
	@RequestMapping(value="/home")
	public String home(ModelMap model, Authentication authentication) {
		authentication.getPrincipal();
		model.addAttribute("productos", service.getProducts());
 		return "user-info";
 	}
	@RequestMapping(value="/error")
	public String error() {
 		return "access-denied";
 	}

}
