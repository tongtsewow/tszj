package com.tszj.dashboard.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/hello")
public class HelloController {

	private Logger log = Logger.getLogger(this.getClass());

	@RequestMapping()
	public String hello(Model model) {
		log.debug("welcom to 阿斯顿打算");



		model.addAttribute("msg", "hello");

		return "hello";
	}

}
