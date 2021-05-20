package com.qa.oop;
public class Book {
	
	public String title;
	public String genre;
	
	public Book(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}

	// Getters / Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
