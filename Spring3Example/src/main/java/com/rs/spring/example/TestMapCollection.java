package com.rs.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMapCollection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		WelcomeBean bean = (WelcomeBean) context.getBean("data");

		bean.show();

	}

}
