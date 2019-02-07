package com.fpiceno.portal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpiceno.portal.entity.UserInfo;
import com.fpiceno.portal.service.IUserService;


@Controller
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private  IUserService service;
	@RequestMapping(value="/home")
	public String home(ModelMap model, Authentication authentication,HttpServletRequest request) {
		System.err.println("error intentando mapear al usuario ");
		authentication.getPrincipal();
		request.getSession().setAttribute("user",service.getDataByUserName(authentication.getName()));
//		model.addAttribute("user", service.getDataByUserName(authentication.getName()));
 		return "user-info";
 	}
	@RequestMapping(value="/error")
	public String error() {
 		return "../WEB-INF/secure/access-denied";
 	}
}
