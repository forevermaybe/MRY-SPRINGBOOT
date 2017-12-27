package com.cn.mry.exception;

import org.springframework.boot.ExitCodeGenerator;

public class ExitException extends RuntimeException implements ExitCodeGenerator {


	@Override
	public int getExitCode() {
		System.out.println("执行错误...");
		return 1024;
	}

}
