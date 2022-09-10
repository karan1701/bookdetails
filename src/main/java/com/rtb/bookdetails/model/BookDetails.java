package com.rtb.bookdetails.model;

public class BookDetails {

	Integer bookId;
	String title;
	String author;
	Integer price;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public BookDetails(Integer bookId, String title, String author, Integer price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookDetails [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

}
