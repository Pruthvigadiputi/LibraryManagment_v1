package com.example.demo;

public class Member {

	
	String name;
	String address;
	String memb_Type;
	String expery_date;
	String memb_date;
	String memb_Id;
	
	
	public Member(String name, String address, String memb_Type, String expery_date, String memb_date, String memb_Id) {
		super();
		this.name = name;
		this.address = address;
		this.memb_Type = memb_Type;
		this.expery_date = expery_date;
		this.memb_date = memb_date;
		this.memb_Id = memb_Id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMemb_Type() {
		return memb_Type;
	}
	public void setMemb_Type(String memb_Type) {
		this.memb_Type = memb_Type;
	}
	public String getExpery_date() {
		return expery_date;
	}
	public void setExpery_date(String expery_date) {
		this.expery_date = expery_date;
	}
	public String getMemb_date() {
		return memb_date;
	}
	public void setMemb_date(String memb_date) {
		this.memb_date = memb_date;
	}
	public String getMemb_Id() {
		return memb_Id;
	}
	public void setMemb_Id(String memb_Id) {
		this.memb_Id = memb_Id;
	}
	
	
	
	
	
	
}
