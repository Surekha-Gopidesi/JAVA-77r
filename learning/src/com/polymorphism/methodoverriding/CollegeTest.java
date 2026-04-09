package com.polymorphism.methodoverriding;

class University {
    static void announce() {
        System.out.println("University announcement");
    }
}

class EngineeringCollege extends University {
    static void announce() {
        System.out.println("Engineering College announcement");
    }
}

public class CollegeTest {
    public static void main(String[] args) {
        University u = new EngineeringCollege();
        u.announce();
    }
}
