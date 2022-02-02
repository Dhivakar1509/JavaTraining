package com.ha.runner;

import com.ha.groups.Student;

public class Runner {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setName("John Wick");
		stu1.setPhoneNumber(9876543210L);
		stu1.setStudentId(101);
		stu1.setStudentPercentage(65.5);
		
		stu1.printStudentDetail();
	}

}
