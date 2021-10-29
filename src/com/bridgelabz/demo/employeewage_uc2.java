package com.bridgelabz.demo;

public class employeewage_uc2 {

	public static void main(String[] args) {
		int IS_PRESENT=1;
		int empWagePerHr=20;
		int empHrs=8;
		int Salary = empWagePerHr*empHrs;
		double WagePerHr=Math.floor(Math.random()*10)%2;
		if(IS_PRESENT == WagePerHr)
		{
			System.out.println("Present = " +Salary);
			
		}
		else
		{
			
			System.out.println("Abscent = no income");
		}

	}

}
