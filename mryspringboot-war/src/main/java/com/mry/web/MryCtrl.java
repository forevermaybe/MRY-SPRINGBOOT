package com.mry.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MryCtrl {

	@RequestMapping("/test")
	public String test(){
		return "hello come here";
	}
}
