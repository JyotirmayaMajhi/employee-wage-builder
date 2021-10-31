package com.bridgelabz.demo;

public class employeewage_uc5 {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int IS_RATE_PER_HR=20;
	public static final int NUM_OF_WORKING_DAYS=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empWage=0,empHrs=0,totalEmpWage=0;
		
		for(int day=0;day < NUM_OF_WORKING_DAYS;day++) {
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
			totalEmpWage += empWage;
			System.out.println("Emp Wage=" +empWage);
		}
		System.out.println("Total Emp Wage=" +totalEmpWage);
		

	}

}
