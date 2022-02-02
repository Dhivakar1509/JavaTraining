package com.ha.base;

public class Person {
	private String name;
	private long PhoneNumber;
	private String MailId;
	private String Address;
	private static String SchoolName;
	private static String SchoolAddress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		if(String.valueOf(phoneNumber).length()==10) {
			this.PhoneNumber = phoneNumber;
		}	
		else {
		System.out.println("Invalid Phone Number");
		}

	}
}
