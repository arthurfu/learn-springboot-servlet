package com.example.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
  * 启动类
 * @author Arthur
 *
 */
@SpringBootApplication
public class RegistrationServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationServletApplication.class, args);
	}

	/**
	 * 通过方法完成servlet组件的注册
	 * @return
	 */
	@Bean
	public ServletRegistrationBean<RegistrationServlet> getRegistrationBean() {
		ServletRegistrationBean<RegistrationServlet> bean = new ServletRegistrationBean<RegistrationServlet>(
				new RegistrationServlet());
		bean.addUrlMappings("/registServlet");
		return bean;
	}
}
