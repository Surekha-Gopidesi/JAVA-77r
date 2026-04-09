package com.functionalInteface;
import java.util.function.*;

public class PreDifined {

	    public static void main(String[] args) {

	        // Predicate
	        Predicate<Integer> eligible = age -> age >= 18;
	        System.out.println("Eligible : " + eligible.test(20));

	        // Function 
	        Function<Integer, Integer> doubleAge = age -> age * 2;
	        System.out.println("Age : " + doubleAge.apply(10));

	        // Consumer 
	        Consumer<String> message = name -> System.out.println("Welcome " + name);
	        message.accept("Surekha");

	        // Supplier 
	        Supplier<String> course = () -> "Java Full Stack";
	        System.out.println("Course : " + course.get());
	    }
	}

