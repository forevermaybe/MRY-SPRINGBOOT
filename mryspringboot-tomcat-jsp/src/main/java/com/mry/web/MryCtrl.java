package com.mry.web;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MryCtrl {
	
	@Value("${application.message}")
	private String message;
	
	@GetMapping("/test")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "mry";
	}
	
	@RequestMapping("/fail")
	public String fail() {
		throw new RuntimeException("Oh dear!");
	}
}
