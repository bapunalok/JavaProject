package com.rs.spring.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestListCollection {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("SpringBeans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		College college = (College) factory.getBean("studentData");

		college.result();

	}

}
