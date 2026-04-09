package com.arrays.day2;

import java.util.Arrays;

public class Patient {
int patientId;
String name;
double testResults[];
public Patient(int patientId, String name, double[] testResults) {
	super();
	this.patientId = patientId;
	this.name = name;
	this.testResults = testResults;
}
	 double getAverageResult() {
		double sum=0;
		for(double ele:testResults) {
			sum+=ele;
			
		}
		return sum/testResults.length;
	}
	 
	 public boolean hasCriticalValues() {
		 
		 for(double ele:testResults) {
				if(ele<50) {
					return true;
				}
				
			}return false;
	 }
	 public void displayPatientReport() {
		 
		 System.out.println("Patient Name :"+name);
		 System.out.println("Patient Id :"+patientId);
		 System.out.println("Test results :"+getAverageResult());
		 System.out.println("---------------");
	 }
	 public static void main(String[] args) {
			

			Patient p=new Patient(101,"Surekha",new double[] {90,90,90,90});
			Patient p1=new Patient(102,"Sushma",new double[] {60,60,40,80});
			Patient p2=new Patient(101,"Prakash",new double[] {80,70,75,80});
			Patient p3=new Patient(101,"Surendra",new double[] {60,70,40,80});
			Patient p4=new Patient(101,"Bhanu",new double[] {60,60,40,80});
			
			Patient [] p5= {p,p1,p2,p3,p4};
			for(Patient patient:p5) {
				if(patient.hasCriticalValues())
				patient.displayPatientReport();
			}
		}

}

