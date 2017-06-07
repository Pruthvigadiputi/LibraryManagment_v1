package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.solr.core.RequestMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Request;

import retrofit2.http.POST;

/**
 * @author pgadiput
 *
 */

@Controller
public class BooksController {
	
	@RequestMapping(value="/books/",method=RequestMethod.GET,produces=Application/JSON)
public ResponseEntity<Books> getBooks()
{
	List<Books> lb=new ArrayList<Books>();
	Books b1=new Books("MR","Pruthvi", "BK1",45, true);
	Books b2=new Books("MR","Pruthvi", "BK1",45, true);
	lb.add(b1);
	lb.add(b2);
	
	
	
}
	
	
	
	
	
}
