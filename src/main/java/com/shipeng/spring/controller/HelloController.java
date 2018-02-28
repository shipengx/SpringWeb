package com.shipeng.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/home")
	public ModelAndView helloWorld() {

		String message = "<h1>Shipeng home page</h1>";
		return new ModelAndView("home", "message", message);
	}
}
