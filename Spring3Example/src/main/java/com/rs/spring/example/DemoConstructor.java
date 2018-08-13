package com.rs.spring.example;

public class DemoConstructor {

	private int id;
	private String name;
	private String gender;
	private DAddress dAddress;

	DemoConstructor(String name, DAddress dAddress, String gender) {

		this.dAddress = dAddress;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "DemoConstructor [id=" + id + ", name=" + name + ", gender=" + gender + ", dAddress=" + dAddress + "]";
	}

}
