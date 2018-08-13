package com.rs.spring.example;

public class Catagories {

	private String name;
	private Books bk;

	public void setName(String name) {
		this.name = name;
	}

	public void setBk(Books bk) {
		this.bk = bk;
	}

	@Override
	public String toString() {
		return "Catagories [name=" + name + ", bk=" + bk + "]";
	}

}
