package com.cn.mry.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MryService {

	@Value("${name}")
	private String name;
	@Value("${age}")
	private String age;
	@Value("${address}")
	private String address;
	
	public void syshi(){
		System.out.println("我叫"+name+"今年"+this.age+"岁"+"来自"+this.address);
	}
}
