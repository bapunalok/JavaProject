package com.rs.spring.example;

public class Properties {
	private int id;
	private String proType;
	private Gold gold;

	Properties(String proType, Gold gold) {
		this.proType = proType;
		this.gold = gold;
	}

	@Override
	public String toString() {
		return "Properties [id=" + id + ", proType=" + proType + ", gold=" + gold + "]";
	}

}
