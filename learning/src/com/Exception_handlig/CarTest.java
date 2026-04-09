package com.Exception_handlig;
import java.util.Scanner;
public class CarTest {
		 public static void stop(String s) throws CarStopped {
			try {
				if(s.equals("stop")) {
					throw new CarStopped("car stopped");
				}
				else {
					System.out.println("car not stalled");
				}
			}
			catch(CarStopped e3) {
				System.out.println(e3.getMessage());
			}  
		 }
		 public static void puncture(String s) throws CarPuncture{
			 try {
				 if(s.equals("puncture")) {
					 throw new CarPuncture( "Car is punctured");
				 }
				 else {
					 System.out.println("Car not punctured");
				 }
			 }
			 catch(CarPuncture e) {
				 System.out.println(e.getMessage()); 
			 } 
		 }
		 public static void carHeat(int n) throws CarHeat{
			try {
				 if(n>50) {
					 throw new CarHeat("Car is heated more than 50 degrees");
				 }
				 else {
					 System.out.println("car not stalled");
				 }
			}
			catch(CarHeat e1) {
				System.out.println(e1.getMessage());
			} 
		 }
		 public static void main(String[] args) {
			try {
				stop("stop");
				puncture("puncture");
				carHeat(30);
			}
			catch(CarStopped e) {
				e.printStackTrace();
			}
			catch(CarPuncture p) {
				p.printStackTrace();
			}
			catch(CarHeat h) {
				h.printStackTrace();
			}
		}}


