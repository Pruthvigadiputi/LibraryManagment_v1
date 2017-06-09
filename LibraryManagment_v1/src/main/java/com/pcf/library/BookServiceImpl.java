package com.pcf.library;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;

public class BookServiceImpl implements BooksServices{

	//@Autowired
	ReadFile rf=new ReadFile();
	
	@Override
	public boolean createBook(Books books) throws IOException {
		// TODO Auto-generated method stub
		/*books.setAuthor("Pruthvi");
		books.setAvailble_flag(true);
		books.setBook_Id("BK101");
		books.setPrice("120");
		books.setTitle("Throwns Of Ocean");
		System.out.println(rf);*/
		rf.createFileDocuments(LibraryConstants.bookFileName, books);
		
		return false;
	}

	@Override
	public boolean updateBook(Books books) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBook(Books books) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Books> readBook() throws IOException {
		// TODO Auto-generated method stub
		return rf.readFile(LibraryConstants.bookFileName);
	}

}
