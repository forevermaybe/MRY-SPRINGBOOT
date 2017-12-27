package com.cn.mry.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cn.mry.service.MryService;

@SpringBootApplication
@ComponentScan(basePackages={"com.cn.mry.service"})
public class Application implements CommandLineRunner {

	@Autowired
	private MryService mryService;
	
	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("springboot 开始启动...");
		if (arg0.length > 0 && arg0[0].equals("exitcode")) {
			throw new com.cn.mry.exception.ExitException();
		}
		mryService.syshi();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
