package com.rs.spring.example;

public class HelloWorld {

	private String name;
	private String batch;
	private int id;

	public void setName(String name) {
		this.name = name;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void printHello() {

		System.out.println("print hello:" + name);
		System.out.println("print hello:" + batch);

	}

	public void show() {
		System.out.println(name);
		System.out.println(batch);
	}
}
