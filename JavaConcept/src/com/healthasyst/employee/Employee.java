package com.healthasyst.employee;

public class Employee {
		public int empId;
		public String empName;
		public double empSalary;
		public static String companyName;
	
		public static void printEmployeeDetail(Employee emp)
		{

			System.out.println(emp.empId);
			System.out.println(emp.empName);
			System.out.println(emp.empSalary);
			System.out.println(Employee.companyName);
		}
}
