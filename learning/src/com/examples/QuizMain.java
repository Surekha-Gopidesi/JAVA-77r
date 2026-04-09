package com.examples;

import java.util.Scanner;

public class QuizMain{

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name = sc.nextLine();

	        Quiz quiz = new Quiz(name);
	        quiz.startQuiz();

	        sc.close();
	    }
	}


