package io.protecksoftware.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index() {
		return "public/index";
	}
	
	@RequestMapping(value="/demo",method=RequestMethod.GET)
	public String demo() {
		return "public/demo";
	}
	@RequestMapping(value="/chatbotdemo",method=RequestMethod.GET)
	public String chatbotdemo() {
		return "public/chatbotdemo";
	}
}
