package com.Strings;


public class StringExample {

  public static void main(String[] args) {

    String name = "Java Programming";

    System.out.println("String Name : " + name);
    
    // Length 
    System.out.println("Length: " + name.length());

    // Convert to uppercase
    System.out.println("Uppercase: " + name.toUpperCase());

    // Convert to lowercase
    System.out.println("Lowercase: " + name.toLowerCase());
    
    // Character at index
    System.out.println("Character at index 5: " + name.charAt(5));

    // Check substring
    System.out.println("Contains 'Java': " + name.contains("Java"));
    
    

  }

}


