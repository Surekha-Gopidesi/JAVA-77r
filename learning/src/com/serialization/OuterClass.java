package com.serialization;

class Outer {
    int x = 100;

    class Inner {
        void display() {
            System.out.println("Value of x: " + x);
        }
    }
}