package com.fpiceno.portal.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fpiceno.portal.entity.UserInfo;
import com.fpiceno.portal.service.UserServiceCRUD;;

@Controller
@RequestMapping(value="/userCRUD")
public class UserControllerCRUD {
	@Autowired
	private UserInfo user;
	
	@Autowired
	private UserServiceCRUD service;
	
	@RequestMapping(value="usuario")
	public String usuario() {
		return "userForm";
	}
	@RequestMapping(value="/createUser")
	public String create(@RequestParam(value="nombreUser") String userName,
			@RequestParam(value="nombre") String nombre,
			@RequestParam(value="apellido") String apellido,
			@RequestParam(value="activo") short activo,
			@RequestParam(value="role") String role,
			@RequestParam(value="contrasena") String contrasena,
			@RequestParam(value="pais") String pais
			) {
		System.out.println("Entro");
		
		nombre += " " + apellido;
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setUsername(userName);
		user.setCountry(pais);
		user.setEnabled(activo);
		user.setFullName(nombre);
		user.setPassword(encoder.encode(contrasena));
		user.setRole(role);
		
		System.out.println(user);
		
		service.agregarUser(user);
		 
		return "userForm";
	}
	
}
