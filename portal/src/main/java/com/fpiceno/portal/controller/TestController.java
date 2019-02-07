package com.fpiceno.portal.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpiceno.portal.service.IUserService;


@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private  IUserService service;
	@RequestMapping(value="/principal")
	public String home(ModelMap model,Authentication authentication,HttpServletRequest request) {
		System.err.println("error intentando mapear al usuario ");
		authentication.getPrincipal();
		request.getSession().setAttribute("user",service.getDataByUserName(authentication.getName()));
//		authentication.getPrincipal();
		
 		return "testBootstrap";
 	}

}
