package com.atguigu;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.atguigu.config.AppConfig;
import com.atguigu.config.RootConfig;

//web����������ʱ�򴴽����󣺵��÷�����ʼ�������Լ�ǰ�˿�����
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	//��ȡ�������������ࣺ��Spring�������ļ���������
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{RootConfig.class};
	}

	//��ȡweb�����������ࣨSpringMVC�����ļ���������
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{AppConfig.class};
	}

	//��ȡDispatchServlet��ӳ����Ϣ
	@Override
	protected String[] getServletMappings() {
		//������������(������̬��Դxx.js��xx.png),���ǲ�����*.jsp
		//����д��/*,��Ϊ���������������󣬰���*.jsp.jspҳ����tomcat�ĵ���������ġ�
		return new String[]{"/"};
	}

}
