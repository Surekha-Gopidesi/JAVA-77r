package com.inheritance.heirarchical;

class Employee {
    void salary() {
        System.out.println("Employee salary credited");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer writes code");
    }
}

class Tester extends Employee {
    void testApplication() {
        System.out.println("Tester tests application");
    }
}



