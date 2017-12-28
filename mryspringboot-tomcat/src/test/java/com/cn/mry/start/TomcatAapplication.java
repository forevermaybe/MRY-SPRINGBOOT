package com.cn.mry.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cn.mry.service.MryService;
import com.cn.mry.web.MryCtrl;



@SpringBootApplication(scanBasePackageClasses={MryService.class,MryCtrl.class})
public class TomcatAapplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(TomcatAapplication.class, args);
	}

}
