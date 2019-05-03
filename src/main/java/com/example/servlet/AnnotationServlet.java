package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * xml配置:
 * 
 * <servlet>
 * 		<servlet-name>AnnotationServlet</servlet-name>
 * 		<servlet-class>com.example.servlet.AnnotationServlet</servlet-class>
 * </servlet>
 * 
 * <servlet-mapping>
 * 		<servlet-name>AnnotationServlet</servlet-name>
 * 		<url-pattern>/annoServlet</url-pattern>
 * </servlet-mapping>
 * 
 */

/**
 * SpringBoot整合servlet，使用注解@WebServlet
 * @author Arthur
 */
@WebServlet(name = "AnnotationServlet", urlPatterns = "/annoServlet")
public class AnnotationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);
		
		System.out.println("annotServlet..........start......");
	}

	
}
