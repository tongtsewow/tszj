package com.tszj.controllers;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private Logger log = Logger.getLogger(this.getClass());


	@RequestMapping()
	public String home(Model model) {

		log.info("Welcome to here:");
		model.addAttribute("msg", "hello");
		return "home";

	}

}
