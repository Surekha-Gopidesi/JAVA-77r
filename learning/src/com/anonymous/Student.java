package com.anonymous;

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}


interface Details {
    void getDetails(Student student);
}

 