package com.pcf.library;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookControllerImpl implements BookController{

	Logger logger = Logger.getLogger(BookControllerImpl.class);
	BookServiceImpl bookserviceimpl=new BookServiceImpl();

	
	@RequestMapping(value=LibraryConstants.bookCreate, method=RequestMethod.POST)
	public boolean createBook(Books bk) throws IOException {
		logger.info("This is createBook statement");		
		// TODO Auto-generated method stub
		return bookserviceimpl.createBook(bk);
	}

	@RequestMapping(value=LibraryConstants.bookList,method=RequestMethod.GET)
	public ArrayList<Books> getBooks() throws IOException {
		// TODO Auto-generated method stub
		logger.info("This is getBooks statement");
		return bookserviceimpl.readBook();
	}

	@Override
	public Books getBook(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Books updateBook(Books bk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBook(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	

	
	
}
