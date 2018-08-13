package com.rs.spring.example;

public class Books {

	private String bookname;
	private int bookprice;

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	@Override
	public String toString() {
		return "Books [bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}

}
