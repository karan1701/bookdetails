package com.rtb.bookdetails.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rtb.bookdetails.model.BookDetails;

@RestController
@RequestMapping("/bookdetails")
public class BookDetailsController {

	Logger logger = LoggerFactory.getLogger(BookDetailsController.class);
	
	List<BookDetails> booksList = Stream.of(new BookDetails(1, "IKIGAI", "Hector Garcia", 550),
			new BookDetails(2, "The Monk Who Sold His Ferrai", "Robin Sharma", 250),
			new BookDetails(3, "Harry Potter", "J. K. Rowling", 5000),
			new BookDetails(4, "Five Point Someone", "Chetan Bhagat", 250),
			new BookDetails(5, "Rich Dad Poor Dad", "Robert Kiyosaki", 450)).collect(Collectors.toList());

	@GetMapping
	public List<BookDetails> getAllBooksDetails() {
		logger.info("Returning all the books list");
		return booksList;
	}

	@GetMapping("/{bookid}")
	public Object getBookDetails(@PathVariable(name = "bookid") Integer bookId) {
		BookDetails bookDetails = booksList.stream().filter(e -> e.getBookId() == bookId).findFirst().get();
		return bookDetails;
	}

}
