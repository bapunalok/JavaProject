package com.rs.spring.example;

import java.util.List;

public class College {

	private List studentData;

	public void setStudentData(List studentData) {
		this.studentData = studentData;
	}

	public void result() {
		System.out.println(studentData);
	}
}
