package com.example.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * 启动类
 * 
 * @author Arthur
 *
 */
@SpringBootApplication
public class RegisListenerApplication {

	public static void main(String[] args) {

		SpringApplication.run(RegisListenerApplication.class, args);
	}

	/**
	 * 注冊listener
	 * @return
	 */
	@Bean
	public ServletListenerRegistrationBean<RegistrationListener> getServLisRegisBean(){
		ServletListenerRegistrationBean<RegistrationListener> bean = new 
				ServletListenerRegistrationBean<RegistrationListener>(new RegistrationListener());
		
		return bean;
	}

}
