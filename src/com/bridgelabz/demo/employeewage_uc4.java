package com.bridgelabz.demo;

public class employeewage_uc4 {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int IS_RATE_PER_HR=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int empHrs=0;
		int empWage=0;
		
		int empSwitchCheck= (int)Math.floor(Math.random()*10)%3;
	switch(empSwitchCheck) 
	{
	case 1:
		empHrs=4;
		break;
	case 2:
		empHrs=8;
		break;
	default:
		empHrs=0;
	}
	empWage = empHrs * IS_RATE_PER_HR;
	System.out.println("Emp_Wage=" +empWage);
			
		
	
	}
		
}


