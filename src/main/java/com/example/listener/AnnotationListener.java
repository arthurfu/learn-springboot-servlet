package com.example.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * <listener>
 * 		<listener-class>com.example.listener.AnnotationListener</listener-class>
 * </listener>
 */

/**
 * springboot整合listener,通过注解
 * @author Arthur
 *
 */

@WebListener
public class AnnotationListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		System.out.println("...........annotation listener init.............");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
//		ServletContextListener.super.contextDestroyed(sce);
	}

	
}
