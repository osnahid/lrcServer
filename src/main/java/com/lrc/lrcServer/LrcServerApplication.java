package com.lrc.lrcServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LrcServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LrcServerApplication.class, args);
	}

}
