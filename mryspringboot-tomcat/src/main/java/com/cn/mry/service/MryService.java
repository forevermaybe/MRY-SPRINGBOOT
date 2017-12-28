package com.cn.mry.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MryService {

	@Value("${name:mry}")
	private String name;
	
	public String  sayhi(){
		return "我叫"+name;
	}
}
