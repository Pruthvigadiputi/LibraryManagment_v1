package com.pcf.library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
	
	public ArrayList<Books> readFile(String fileName) throws IOException
	{
		File currFile = new File(getClass().getClassLoader().getResource(fileName).getFile());
		if(currFile.exists() && currFile.isFile())
		{
			System.out.println("File exists");
		} else {
			System.out.println("File not exists");
		}
		FileReader fileReader=new FileReader(currFile);
		ArrayList<Books> data = null;
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String s;
		while((s = bufferedReader.readLine()) != null)
		{
			data.add(dataSplitior(s,"books"));
		}
		return data;
		
	}
	
	
	public boolean createFileDocuments(String fileName,Books bk) throws IOException
	{
		
		File currFile = new File(getClass().getClassLoader().getResource(fileName).getFile());
		if(currFile.exists() && currFile.isFile())
		{
			System.out.println("File exists"+currFile.getAbsolutePath());
		} else {
			System.out.println("File not exists");
		}
		FileWriter fileWriter=new FileWriter(currFile);
		System.out.println("1");
		ArrayList<Books> data = null;
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		try {
		System.out.println(bufferedWriter+":"+bk.createDocument());
		bufferedWriter.write(bk.createDocument());
		}catch (Exception e) {
			// TODO: handle exception
		} 
		finally {
			if (bufferedWriter != null)
				bufferedWriter.close();

			if (fileWriter != null)
				fileWriter.close();
		}
		return true;
	}
	
	public Books dataSplitior(String s,String fileName)
	{
		
		switch (fileName) {
		case "books":
			Books bk=new Books();
			String data[]=s.split("||");
			bk.setBook_Id(data[0]);
			bk.setTitle(data[1]);
			bk.setAuthor(data[2]);
			bk.setAvailble_flag(Boolean.valueOf(data[3]));
			bk.setPrice(data[4]);
			return bk;

		default:
			Books bk1=new Books();
			return bk1;
		}
		
		
	}

}
