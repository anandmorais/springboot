package com.training.samplemavenproject.main;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		System.out.println("Inside");
		model.put("message", "Hello World");
		return "welcome";
	}
	
	
}
