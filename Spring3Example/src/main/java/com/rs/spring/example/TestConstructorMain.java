package com.rs.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		DemoConstructor constructor = (DemoConstructor) context.getBean("demoConstructor");

		System.out.println(constructor);

	}

}
