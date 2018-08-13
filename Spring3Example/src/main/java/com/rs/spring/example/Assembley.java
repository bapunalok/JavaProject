package com.rs.spring.example;

import java.util.Set;

public class Assembley {

	private Set assembleyseats;

	public void setAssembleyseats(Set assembleyseats) {
		this.assembleyseats = assembleyseats;
	}

	public void show() {
		System.out.println(assembleyseats);
	}
}
