package com.booksmanagement.beans;

public class Book {
	private Integer id;
	private String bookName;
	private String ISBN;
	private Author author;
	
	public Book() {
		super();
	}
	public Book(String bookName, String iSBN, Author author) {
		super();
		this.bookName = bookName;
		ISBN = iSBN;
		this.author = author;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", ISBN=" + ISBN + ", author=" + author + "]";
	}
	
}
