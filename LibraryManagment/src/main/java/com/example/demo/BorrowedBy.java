package com.example.demo;

public class BorrowedBy {


	String due_Date;
	String return_Date;
	String issue;
	
	
	public BorrowedBy(String due_Date, String return_Date, String issue) {
		super();
		this.due_Date = due_Date;
		this.return_Date = return_Date;
		this.issue = issue;
	}
	
	public String getDue_Date() {
		return due_Date;
	}
	public void setDue_Date(String due_Date) {
		this.due_Date = due_Date;
	}
	public String getReturn_Date() {
		return return_Date;
	}
	public void setReturn_Date(String return_Date) {
		this.return_Date = return_Date;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	
	
	
	
}
