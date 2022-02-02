package com.ha.groups;

import com.ha.base.Person;

public class Student extends Person {

	private int StudentId;
	private double StudentPercentage;
	private String CourseCode;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		if (StudentId >= 100) {
			this.StudentId = studentId;
		} else {
			System.out.println("Invalid Id");
		}
	}

	public double getStudentPercentage() {
		return StudentPercentage;
	}

	public void setStudentPercentage(double studentPercentage) {
		if (StudentPercentage >= 0 && StudentPercentage <= 100) {
			this.StudentPercentage = studentPercentage;
		} else {
			System.out.println("Invalid Percentage");
		}
	}

	public void printStudentDetail() {
		System.out.println("Student Id:" + this.StudentId);
		System.out.println("Student Name:" + super.getName());
		System.out.println("Student Phone Number:" + super.getPhoneNumber());
		System.out.println("Student Percentage:" + this.getStudentPercentage());
	}

}
