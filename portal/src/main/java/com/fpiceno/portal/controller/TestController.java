package com.fpiceno.portal.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value="/principal")
	public String home(ModelMap model) {
//		authentication.getPrincipal();
		
		model.addAttribute("fecha", new Date());
 		return "testBootstrap";
 	}

}
