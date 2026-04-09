package com.examples;
import java.util.Scanner;
class Quiz {
    private String userName;
    private int score;
    Quiz(String userName) {
        this.userName = userName;
        this.score = 0;
        System.out.println("Welcome " + userName + " to the Online Quiz!");
    }
    public void startQuiz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nQ1. Java is a _____ language?");
        System.out.println("1. Platform dependent");
        System.out.println("2. Platform independent");
        int ans1 = sc.nextInt();
        if (ans1 == 2) score++;
        System.out.println("\nQ2. Which keyword is used to inherit a class?");
        System.out.println("1. implement");
        System.out.println("2. extends");
        int ans2 = sc.nextInt();
        if (ans2 == 2) score++;

        System.out.println("\nQ3. Which method is the entry point of Java program?");
        System.out.println("1. start()");
        System.out.println("2. main()");
        int ans3 = sc.nextInt();
        if (ans3 == 2) score++;
        showResult();
        sc.close();
    }
    public void showResult() {
        System.out.println("\nQuiz Completed!");
        System.out.println("Name  : " + userName);
        System.out.println("Score : " + score + "/3");

        if (score >= 2) {
            System.out.println("Result: Passed..");
        } else {
            System.out.println("Result: Failed ");
        }
    }
}



