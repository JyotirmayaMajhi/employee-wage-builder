package com.bridgelabz.demo;

public class employeewage_uc3 {

	public static void main(String[] args) {
		int IS_PRESENT=1;
		int empWagePerHr=20;
		int partTimeHr=8;
		int Salary = empWagePerHr*partTimeHr;
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
