package com.shipeng.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/home")
	public ModelAndView helloWorld() {

		String message = "<h1>Shipeng home page</h1>";
		return new ModelAndView("home", "message", message);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = { "/status", "/" })
	public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setStatus(HttpServletResponse.SC_OK);
		PrintWriter pw = resp.getWriter();
		pw.println("OK");
		pw.close();
	}
	
}
