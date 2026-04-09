package com.anonymous;

class AnonymousDemo {

    public static void main(String[] args) {

        Student student = new Student("Surekha");

        Details details = new Details() {

            @Override
            public void getDetails(Student student) {
                System.out.println("Student Name : " + student.name);
            }
        };

        details.getDetails(student);
    }
}