package com.example.filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example.servlet.RegistrationServlet;

/**
 * 启动类
 * @author Arthur
 *
 */
@SpringBootApplication
public class RegistrationFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationFilterApplication.class, args);
	}
	
	/**
	 * 注册Filter
	 * @return
	 */
	@Bean
	public FilterRegistrationBean<RegistrationFilter> getFilterRegistrationBean(){
		FilterRegistrationBean<RegistrationFilter> bean = new FilterRegistrationBean<RegistrationFilter>(new RegistrationFilter());
		bean.addUrlPatterns("/registFilter");
		return bean;
	}
}
