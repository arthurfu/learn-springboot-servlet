package com.example.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动类
 * @author Arthur
 *
 */
@SpringBootApplication
@ServletComponentScan
public class AnnoListenerApplication {

	public static void main(String[] args) {

		SpringApplication.run(AnnoListenerApplication.class, args);
	}

}
