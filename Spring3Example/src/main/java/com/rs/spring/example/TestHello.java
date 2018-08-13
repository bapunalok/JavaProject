package com.rs.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeans.xml");

		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloBean");
		helloWorld.printHello();

	}

}
