package com.rs.spring.example;

public class Gold {

	private int id;
	private String goldType;

	public void setId(int id) {
		this.id = id;
	}

	public void setGoldType(String goldType) {
		this.goldType = goldType;
	}

	@Override
	public String toString() {
		return "Gold [id=" + id + ", goldType=" + goldType + "]";
	}

}
