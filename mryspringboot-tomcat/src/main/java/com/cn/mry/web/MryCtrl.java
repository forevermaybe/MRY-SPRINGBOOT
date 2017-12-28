package com.cn.mry.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.mry.service.MryService;

@Controller
public class MryCtrl {

	@Autowired
	private MryService mryService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		return mryService.sayhi();
	}
}
