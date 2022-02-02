package com.healthasyst.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee.companyName="HA";
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		emp1.empId=101;
		emp1.empName="John";
		emp1.empSalary=6000;
		
		
		emp2.empId=102;
		emp2.empName="Peter";
		emp2.empSalary=2000;
		
		emp3.empId=103;
		emp3.empName="Mark";
		emp3.empSalary=4000;
		
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		Employee.printEmployeeDetail(emp1);
		Employee.printEmployeeDetail(emp2);
		Employee.printEmployeeDetail(emp3);
	}

}
