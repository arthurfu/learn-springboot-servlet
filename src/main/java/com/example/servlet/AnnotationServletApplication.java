package com.example.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


/**
  * 启动类
 * @author Arthur
 *
 */
@SpringBootApplication
@ServletComponentScan //spring启动时扫描@WebServlet注解，并将该类实例化
public class AnnotationServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationServletApplication.class, args);
	}

}
