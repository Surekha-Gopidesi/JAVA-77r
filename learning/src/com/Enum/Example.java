package com.Enum;

public class Example {
	
	    public static void main(String[] args) {
	    	enum Day {
	    	    MONDAY, TUESDAY, WEDNESDAY
	    	}

	        Day today = Day.MONDAY;

	        System.out.println("Today is: " + today);

	        if (today == Day.MONDAY) {
	            System.out.println("Time to Start your work ...!");
	        }
	    }
	}


