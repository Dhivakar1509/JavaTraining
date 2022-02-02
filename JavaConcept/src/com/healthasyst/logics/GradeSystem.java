package com.healthasyst.logics;

public class GradeSystem
{

	public static void main(String[] args) 
	{
		int mark = 120 ;
		if (mark<100 && mark >= 90)
		{
			System.out.println("A");
		}
		else if (mark >= 80 && mark < 89)
		{
			System.out.println("B");
		} 
		else if (mark >= 60 && mark < 79)
		{
			System.out.println("C");
		}
		else if (mark < 59 && mark > 0)
		{
			System.out.println("F");
		}
		else 
		{
			System.out.println(" Invalid Input");
		}

	}

}
