package com.pcf.library;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;

public interface BooksServices {
	
	public boolean createBook(Books books) throws IOException;
	public boolean updateBook(Books books);
	public boolean deleteBook(Books books);
	public ArrayList<Books> readBook() throws IOException;
	
	

}
