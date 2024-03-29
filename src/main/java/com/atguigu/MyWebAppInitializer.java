package com.atguigu;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.atguigu.config.AppConfig;
import com.atguigu.config.RootConfig;

//web容器启动的时候创建对象：调用方法初始化容器以及前端控制器
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	//获取根容器的配置类：（Spring的配置文件）父容器
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{RootConfig.class};
	}

	//获取web容器的配置类（SpringMVC配置文件）子容器
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{AppConfig.class};
	}

	//获取DispatchServlet的映射信息
	@Override
	protected String[] getServletMappings() {
		//拦截所有请求(包括静态资源xx.js、xx.png),但是不包括*.jsp
		//不能写成/*,因为它会拦截所有请求，包括*.jsp.jsp页面是tomcat的的引擎解析的。
		return new String[]{"/"};
	}

}
