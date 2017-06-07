package com.example.demo;

public class Publisher {

	String pub_Id;
	String address;
	String name;
	
	
	
	
	public Publisher(String pub_Id, String address, String name) {
		super();
		this.pub_Id = pub_Id;
		this.address = address;
		this.name = name;
	}
	
	public String getPub_Id() {
		return pub_Id;
	}
	public void setPub_Id(String pub_Id) {
		this.pub_Id = pub_Id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
