package com.pcf.library;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class LibraryManagmentV1Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(LibraryManagmentV1Application.class, args);
		/*BookServiceImpl bim=new BookServiceImpl();
		Books bk=new Books();
		bim.createBook(bk);
		
		//BookServiceImpl bim=new BookServiceImpl();
		//Books bk=new Books();
		ArrayList<Books> li=new ArrayList<Books>();
		li=bim.readBook();
		System.out.println(li.size());
		String s="Prut|Throws of Ocen";
		String [] data=s.split("\\|");
		System.out.println(data);*/
	}
}