package com.example.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * xml配置：
 * 
 * <filter>
 * 		<filter-name>AnnotationFilter</filter-name>
 * 		<filter-class>com.example.filter.AnnotationFilter</filter-class>
 * </filter>
 * 
 * <filter-mapping>
 * 		<filter-name>AnnotationFilter</filter-name>
 * 		<url-pattern>/annoFilter</url-pattern>
 * </filter-mapping>
 */

/**
 * springboot整合Filter,使用注解方式@WebFilter
 * @author Arthur
 *
 */
@WebFilter(filterName = "AnnotationFilter", urlPatterns = "/annoFilter")
public class AnnotationFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("............进入Filter............");
		chain.doFilter(request, response);
		System.out.println("............离开Filter............");
	}

	@Override
	public void destroy() {
		Filter.super.destroy();
	}
}
