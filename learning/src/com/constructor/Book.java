package com.constructor;
public class Book {
	private int bookId;
	private String title;
	private int availablecopies;
	public Book(int bookId, String title,int availablecopies){
		this .bookId=bookId;
		this.title=title;
		this.availablecopies=availablecopies;
	}
	public int getBookId() {
		return bookId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getAvailablecopies() {
		return availablecopies;
	}
public void borrowBook() {
	if(availablecopies>0) {
		
		availablecopies--;
		System.out.println("barrowed success! and available copies  : "+ availablecopies);
	}
	else {
		System.out.println("copies are not available");
	}
}
	public void  returnBook() {
				availablecopies++;
	System.out.println("the available copies are  : "+ availablecopies);
}
	}

