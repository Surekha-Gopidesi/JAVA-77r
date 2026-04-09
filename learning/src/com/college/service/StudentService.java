package com.college.service;

public class StudentService {
	public double calculateDiscountedFee(double fee,String department) {
		if(department.equalsIgnoreCase("it")) {
			return  fee-(fee*0.10);
//			
		}
		return fee;
		
		
	}

}
