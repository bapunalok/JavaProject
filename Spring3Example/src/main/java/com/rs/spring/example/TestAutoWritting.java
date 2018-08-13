package com.rs.spring.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestAutoWritting {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("SpringBeans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Object object = factory.getBean("catagories");
		Catagories catagories = (Catagories) object;
		System.out.println(catagories);

	}

}
