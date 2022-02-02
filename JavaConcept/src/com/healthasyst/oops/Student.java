package com.healthasyst.oops;

public class Student {
	private int studID;
	private String studName;
	private String studMailID;
	private double studPercentage;
	private static String schoolName;
	
	private static int counter = 1001;
	
	public Student()
	{
		studID=counter;
		counter++;
	}
	
	public double getStudPercentage() {
		return this.studPercentage;
	}
	
	public void setStudPercentage(double studPercentage) {
		
		if(studPercentage >=0 && studPercentage <=99)
		{
			this.studPercentage= studPercentage;
		}else {
			System.out.println("Invalid Percentage");
		}
			
	}

}
