package com.mry.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.mry.jpacfg.JpaCfg;


@SpringBootApplication
@ComponentScan(basePackageClasses={JpaCfg.class},basePackages={"com.mry.web","com.mry.service"})
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
