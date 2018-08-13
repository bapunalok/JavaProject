package com.rs.spring.example;

public class DAddress {

	private int id;
	private String city;

	public void setId(int id) {
		this.id = id;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "DAddress [id=" + id + ", city=" + city + "]";
	}

}
